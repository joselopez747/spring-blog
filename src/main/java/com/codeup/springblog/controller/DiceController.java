package com.codeup.springblog.controller;


import com.codeup.springblog.models.Dice;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.Random;

@Controller
@RequestMapping("/roll-dice")
public class DiceController {
    private final int[] rolls = {1, 2, 3, 4, 5, 6};


    @GetMapping
    public String diceInfo() {
        return "views-lecture/dice";
    }


    @GetMapping("/{n}")
    public String randomRoll(@PathVariable int n, Model model) {
        int rnd = new Random().nextInt(rolls.length);
//        model.addAttribute("n", n);
//        boolean guessedRoll = true;
//        if (n.equals(rnd)){
//            n = false;
//        }
//        model.addAttribute("guessedRoll", guessedRoll);
        return "views-lecture/dice";



    }
}

