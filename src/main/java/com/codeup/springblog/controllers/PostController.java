package com.codeup.springblog.controllers;

import com.codeup.springblog.models.Post;
import com.codeup.springblog.repositories.PostRepository;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@Controller
@RequestMapping("/posts")
public class PostController {

    private final PostRepository postDao;

    public PostController(PostRepository postDao){
        this.postDao = postDao;
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
    public String viewPosts(Model model){
        List<Post> post = postDao.findAll();
        model.addAttribute("posts", post);

        return "posts/index";
    }

    @GetMapping("/create")
    public String createPostForm(){
        return "posts/create";
    }

    @PostMapping("/create")
    public String addPost(@RequestParam(name="title")String title, @RequestParam(name="body") String body){
        Post post = new Post(title, body);
        postDao.save(post);

        return "redirect:/posts/index";
    }

} // end
