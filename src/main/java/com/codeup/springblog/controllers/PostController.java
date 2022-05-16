package com.codeup.springblog.controllers;

import com.codeup.springblog.models.Post;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@Controller
@RequestMapping("/posts")
public class PostController {

    @GetMapping
    public String index(){
        return "/posts/index";
    }

    @GetMapping("/show")
    public String viewPost(Model model){
        Post post1 = new Post("First Post", "This is my first post.");
        model.addAttribute("post1", post1);

        return "posts/show";
    }

    @GetMapping("/wow")
    public String test(){
        return "posts/show";
    }

//    @GetMapping("/shows")
//    public String viewPosts(){
//        Post post2 = new Post("Second Post", "This is my second post.");
//        Post post3 = new Post("Third Post", "This is my third post.");
//
//        List<Post> posts = new ArrayList<>();
//        posts.add(post2);
//        posts.add(post3);
//        model.addAttribute("posts", posts);

//        return "posts/show";
//    }

//    @GetMapping("/create")
//    public String createPostForm(){
//        return "This is where you would view the form to create a post... ";
//    }
//
//    @PostMapping("/create")
//    public String createPost(){
//        return "This where the logic be when the form to create a post is submitted... ";
//    }

} // end
