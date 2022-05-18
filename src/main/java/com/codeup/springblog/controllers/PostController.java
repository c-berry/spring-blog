package com.codeup.springblog.controllers;

import com.codeup.springblog.models.Post;
import com.codeup.springblog.models.PostImages;
import com.codeup.springblog.models.User;
import com.codeup.springblog.repositories.PostImagesRepository;
import com.codeup.springblog.repositories.PostRepository;
import com.codeup.springblog.repositories.UserRepository;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.List;

// (BONUS). Add a form to add additional images to the cat blog post.

@Controller
@RequestMapping("/posts")
public class PostController {

    private final PostRepository postDao;
    private final UserRepository userDao;
    private final PostImagesRepository postImagesDao;

    public PostController(PostRepository postDao, UserRepository userDao, PostImagesRepository postImagesDao){
        this.postDao = postDao;
        this.userDao = userDao;
        this.postImagesDao = postImagesDao;
    }

    @GetMapping
    public String index(){
        return "/posts/index";
    }

    @GetMapping("/{id}")
    public String viewPost(@PathVariable long id, Model model){
        model.addAttribute("results", postDao.getById(id));

        return "/posts/show";
    }

    @GetMapping("/index")
    public String viewAllPosts(Model model){
        List<Post> post = postDao.findAll();
        List<PostImages> postImages = postImagesDao.findAll();
        model.addAttribute("posts", post);
        model.addAttribute("images", postImages);

        return "posts/index";
    }

    @GetMapping("/create")
    public String createPostForm(){
        return "posts/create";
    }

    @PostMapping("/create")
    public String addPost(@RequestParam(name="title")String title, @RequestParam(name="body") String body){
        User user = userDao.getById(1L);
        Post post = new Post(title, body, user);
        postDao.save(post);

        return "redirect:/posts/index";
    }

} // end
