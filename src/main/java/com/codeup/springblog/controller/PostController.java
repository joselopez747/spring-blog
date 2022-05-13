package com.codeup.springblog.controller;


import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@Controller
@RequestMapping("/post")
public class PostController {

    @GetMapping
    @ResponseBody
    public String allPosts(){
        return "this is where you would view all the posts";
    }



    @GetMapping("/{id}")
    @ResponseBody
    public String onePost(@PathVariable long id){
        return "this is where you would view one album with the id: " + id;
    }


    @GetMapping("/create")
    @ResponseBody
    public String createPost(){
        return "this is where you would view the form to create an album in the db";
    }

    @PostMapping("/create")
    @ResponseBody
    public String submitPost(){
        return "this is where the logic would be for when the create post form is submitted";
    }
}
