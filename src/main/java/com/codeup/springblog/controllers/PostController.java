package com.codeup.springblog.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@Controller
@RequestMapping("/posts")
public class PostController {

    @GetMapping
    @ResponseBody
    public String index(){
        return "This is the index page.";
    }

    @GetMapping("/{id}")
    @ResponseBody
    public String viewPost(@PathVariable int id){
        return "This is where you would view a single post... "+ id;
    }

    @GetMapping("/create")
    @ResponseBody
    public String createPostForm(){
        return "This is where you would view the form to create a post... ";
    }

    @PostMapping("/create")
    @ResponseBody
    public String createPost(){
        return "This where the logic be when the form to create a post is submitted... ";
    }

} //EoC
