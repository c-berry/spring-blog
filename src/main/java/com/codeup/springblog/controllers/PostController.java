package com.codeup.springblog.controllers;

import com.codeup.springblog.models.*;
import com.codeup.springblog.repositories.PostDetailsRepository;
import com.codeup.springblog.repositories.PostImagesRepository;
import com.codeup.springblog.repositories.PostRepository;
import com.codeup.springblog.repositories.UserRepository;
import com.codeup.springblog.services.EmailService;
import com.codeup.springblog.services.StringService;
import org.springframework.security.core.context.SecurityContext;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Controller
@RequestMapping("/posts")
public class PostController {

    private final PostRepository postDao;
    private final UserRepository userDao;
    private final PostImagesRepository postImagesDao;
    private final PostDetailsRepository postDetailsDao;

    private final StringService stringService;
    private final EmailService emailService;

    public PostController(PostRepository postDao, UserRepository userDao, PostImagesRepository postImagesDao, PostDetailsRepository postDetailsDao,  StringService stringService, EmailService emailService){
        this.postDao = postDao;
        this.userDao = userDao;
        this.postImagesDao = postImagesDao;
        this.postDetailsDao = postDetailsDao;

        this.stringService = stringService;
        this.emailService = emailService;
    }

    @GetMapping
    public String index(){
        return "/posts/index";
    }

    @GetMapping("/{id}")
    public String viewPost(@PathVariable long id, Model model){

        model.addAttribute("post", postDao.getById(id));

        return "/posts/show";
    }

    @GetMapping("/index")
    public String viewAllPosts(Model model){

        List<Post> post = postDao.findAll();
        List<PostImages> postImages = postImagesDao.findAll();

        model.addAttribute("posts", post);
        model.addAttribute("images", postImages);
        model.addAttribute("stringService", stringService);

        return "posts/index";
    }

//    @GetMapping("/create")
//    public String createPostForm(){
//        return "posts/create";
//    }
//
//    @PostMapping("/create")
//    public String addPost(@RequestParam(name="title")String title, @RequestParam(name="body") String body, @RequestParam(name="tag")List<Tag> tags){
//
//        User user = userDao.getById(1L);
//        Post post = new Post(tags, title, body, user);
//        postDao.save(post);
//
//        return "redirect:/posts/index";
//    }

    //    form-model binding refactor =>
    @GetMapping("/create")
    public String createPostForm(Model model){

        model.addAttribute("post", new Post());

        return "posts/create";
    }

    @PostMapping("/create")
    public String addPost(@ModelAttribute Post post){

        System.out.println(post.getPostDetails().toString());

        User user = userDao.getById(1L);
        post.setUser(user);

//        PostDetails pd = postDetailsDao.getById(post.getPostDetails().getId());
//        post.setPostDetails(pd);

//        post.setPostDetails(post.getPostDetails());
//        postDetailsDao.save(post.setPostDetails());

//        User user = (User) SecurityContextHolder.getContext(). getAuthentication().getPrincipal();
//        post.setUser(user);

//        emailService.prepareAndSend(post, post.getTitle(), post.getBody());

        postDao.save(post);

        return "redirect:/posts/index";
    }

//    @PostMapping("/edit-post")
//    public String editPost(@RequestParam(name="title")String title, @RequestParam(name="body") String body, @RequestParam(name="id") long id, @RequestParam(name="tag") List<Tag> tags) {
//
//        Post post = postDao.getById(id);
//        post.setTitle(title);
//        post.setBody(body);
//        post.setTags(tags);
//        postDao.save(post);
//
//        return "redirect:/posts/" + id;
//    }
//

    //    form-model binding refactor =>
    @GetMapping("/posts/{id}")
    public String updatePost(@PathVariable long id, Model model) {

        model.addAttribute("post", postDao.getById(id));

        return "/posts/show";
    }

    @PostMapping("/edit-post")
    public String UpdatePost(@ModelAttribute Post post, @ModelAttribute PostImages images) {

//        Post existingPost = postDao.getById(post.getId());
//        existingPost.setTitle(post.getTitle());

//        User user = (User) SecurityContextHolder.getContext(). getAuthentication().getPrincipal();
//        post.setUser(user);

        postDao.save(post);

        return "redirect:/posts/index";
    }

    @PostMapping("/add-image")
    public String addImage(@RequestParam(name="img-title")String title, @RequestParam(name="url")String url, @RequestParam(name="id") long id){

        Post post = postDao.getById(id);
        PostImages postImage = new PostImages(title, url, post);

        List<PostImages> images = post.getPostImages();
        images.add(postImage);
        post.setPostImages(images);
        postDao.save(post);

        return "redirect:/posts/" + id;
    }

//    @PostMapping("/delete-post")
//    public String deletePost(@RequestParam(name="id") long id){
//
//        Post post = postDao.getById(id);
//        postDao.delete(post);
//
//        return "redirect:/posts/index";
//    }

    //    form-model binding refactor
    @PostMapping("/delete-post")
    public String deleteMovie(@RequestParam(name="id") long id) {

        postDao.deleteById(id);

        return "redirect:/posts/index";
    }

    @PostMapping("/delete-img")
    public String deleteImage(@RequestParam(name="id") long id){

        PostImages image = postImagesDao.getById(id);
        postImagesDao.delete(image);

        return "redirect:/posts/index";
    }

} // end