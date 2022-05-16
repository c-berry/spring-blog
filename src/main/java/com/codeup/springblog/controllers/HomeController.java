package com.codeup.springblog.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping("/")
public class HomeController {

//    @GetMapping
//    @ResponseBody
//    public String home(){
//        return "This is the landing page!";
//    }

    @GetMapping
    public String postsHome(){
        return "/posts/index";
    }

} //EoC
