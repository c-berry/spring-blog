package com.codeup.springblog.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.Random;

@Controller
@RequestMapping("/roll-dice")
public class DiceController {

    @GetMapping
    public String rollDice(){
        return "views-exercises/roll-dice";
    }

    @GetMapping("/{guess}")
    public String rollDice(@PathVariable int guess, Model model){

        int random = new Random().nextInt((6 - 1) + 1);

        if(guess == random){
            model.addAttribute("correct", true);
        } else {
            model.addAttribute("incorrect", true);
        }

        return "views-exercises/roll-dice";
    }

    //    @PostMapping
//    public String guess(@RequestParam(name="email") String email, Model model){
//        model.addAttribute("email", email);
//        return "/views-lecture/coffee";
//    }

} //EoC
