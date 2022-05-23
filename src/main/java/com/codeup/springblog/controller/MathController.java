//package com.codeup.springblog.controller;
//
//
//import org.springframework.stereotype.Controller;
//import org.springframework.web.bind.annotation.*;
//
//@Controller
//public class MathController {
//    @RequestMapping(path = "/add100To/{number}", method = RequestMethod.GET)
//    @ResponseBody
//    public String addOneHundred(@PathVariable int number){
//
//        return number + " + 100 = " + (number + 100);
//    }
//
//    @RequestMapping(path = "/add/{num1}/and/{num2}", method = RequestMethod.GET)
//    @ResponseBody
//    public double add(@PathVariable double num1, @PathVariable double num2){
//    return num1 + num2;
//    }
//
//    @RequestMapping(path = "/subtract/{num1}/from/{num2}", method = RequestMethod.GET)
//    @ResponseBody
//    public double subtract(@PathVariable double num1, @PathVariable double num2){
//        return num1 - num2;
//    }
//
//    @RequestMapping(path = "/divide/{num1}/by/{num2}", method = RequestMethod.GET)
//    @ResponseBody
//    public double divide(@PathVariable double num1, @PathVariable double num2){
//        return num1 / num2;
//    }
//
//
//    @GetMapping("/math")
//    public String math(){
//        return "math/index";
//    }
//
//}
