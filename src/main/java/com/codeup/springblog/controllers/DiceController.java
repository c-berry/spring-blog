package com.codeup.springblog.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.Random;
import java.util.ArrayList;
import java.util.List;

@Controller
@RequestMapping("/roll-dice")
public class DiceController {

    @GetMapping
    public String rollDice(){
        return "dice/roll-dice";
    }

    @GetMapping("/{guess}")
    public String rollDice(@PathVariable int guess, Model model){

        int random1 = (int) (Math.random() * 6 + 1);
        int random2 = (int) (Math.random() * 6 + 1);
        int random3 = (int) (Math.random() * 6 + 1);

        ArrayList<Integer> rolledNums = new ArrayList<>();
        rolledNums.add(random1);
        rolledNums.add(random2);
        rolledNums.add(random3);

//        if(guess == random){
//            model.addAttribute("correct", true);
//        } else {
//            model.addAttribute("incorrect", true);
//        }

        int numbersHit = 0;

        if (random1 == guess) {
            numbersHit += 1;
        }
        if (random2 == guess) {
            numbersHit += 1;
        }
        if (random3 == guess) {
            numbersHit += 1;
        }

        model.addAttribute("rolledNums", rolledNums);
        model.addAttribute("guess", guess);
        model.addAttribute("numbersHit", numbersHit);

        return "dice/roll-dice";
    }

    //    @PostMapping
//    public String guess(@RequestParam(name="email") String email, Model model){
//        model.addAttribute("email", email);
//        return "/views-lecture/coffee";
//    }

} //EoC
