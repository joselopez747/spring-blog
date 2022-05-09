package com.codeup.springblog.controller;


import com.codeup.springblog.services.MathService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@Controller
public class MathController {


    MathService mathService = new MathService();

//    public MathController(MathService mathService) {
//        this.mathService = mathService;
//    }

    @RequestMapping(path = "/add100To/{number}", method = RequestMethod.GET)
    @ResponseBody
    public String addOneHundred(@PathVariable int number) {
        return number + " + 100 = " + (number + 100);
    }

    @GetMapping("/add/{num1}/and/{num2}")
    @ResponseBody
    public double add(@PathVariable double num1, @PathVariable double num2) {
        return num1 + num2;
    }

    @GetMapping("/subtract/{num1}/from/{num2}")
    @ResponseBody
    public double subtract(@PathVariable double num1, @PathVariable double num2) {
        return num2 - num1;
    }

    @GetMapping("/multiply/{num1}/and/{num2}")
    @ResponseBody
    public double multiply(@PathVariable double num1, @PathVariable double num2) {
        return num1 * num2;
    }

    @GetMapping("/divide/{num1}/by/{num2}")
    @ResponseBody
    public double divide(@PathVariable double num1, @PathVariable double num2) {
        return mathService.divide(num1, num2);
    }


    @GetMapping("/math")
    public String math() {
        return "math/index";
    }


    @PostMapping("/math")
    public String doMath(
            // do the math itself
            @RequestParam(name = "inputA") double inputA,
            @RequestParam(name = "inputB") double inputB,
            @RequestParam(name = "operation") String operation,
            Model model
    ) {

        double total = mathService.doOperation(operation, inputA, inputB);

        model.addAttribute("total", total);

        return "math/index";
    }

}