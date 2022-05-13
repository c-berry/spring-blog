package com.codeup.springblog.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@Controller
@RequestMapping("/albums")
public class AlbumController {

    @GetMapping
    @ResponseBody
    public String allAlbums(){
        return "This is where you would view all of the albums... ";
    }

    @GetMapping("/{id}")
    @ResponseBody
    public String showOneAlbum(@PathVariable long id){
        return "This is where you would view one album by id... " + id;
    }

    @GetMapping("/create")
    @ResponseBody
    public String createAlbumForm(){
        return "This is where you would view form to create an album... ";
    }

    @PostMapping
    @ResponseBody
    public String createAlbum(){
        return "This where the logic be when the form to create an album is submitted... ";
    }

} //EoC
