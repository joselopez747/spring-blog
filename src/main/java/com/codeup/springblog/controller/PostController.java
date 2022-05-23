package com.codeup.springblog.controller;


import com.codeup.springblog.models.Post;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@Controller
@RequestMapping("/posts")
public class PostController {

    public List<Post> generatePosts(){
        List<Post> allPosts = new ArrayList<>();
        Post post1 = new Post(1, "First post", "This is my first post!");
        Post post2 = new Post(2, "Another post!", "Amazing content!");
        Post post3 = new Post(3, "Third post", "Fascinating information!");
        allPosts.add(post1);
        allPosts.add(post2);
        allPosts.add(post3);
        return allPosts;
    }

    @GetMapping
    public String allPosts(Model model){
        List<Post> allPosts = generatePosts();
        model.addAttribute("allPosts", allPosts);
        return "posts/index";
    }

    @GetMapping("/{id}")
    public String onePost(@PathVariable long id, Model model){
        List<Post> allPosts = generatePosts();
        Post post = null;
        for(int i = 0; i < allPosts.size(); i++){
            if(allPosts.get(i).getId() == id){
                post = allPosts.get(i);
            }
        }
        model.addAttribute("id", id);
        model.addAttribute("post", post);

        return "posts/show";
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


    @GetMapping("posts/{id}/edit")
    public String editPost(
            @PathVariable(name= "id") Long id,
            Model model
    ){
        model.addAttribute("post", postsDao.findById(id));
        return "/posts/show";
    }

    @PostMapping("/edit")
    public String doEdit(
            @ModelAttribute Post post
    ){
        postsDao.save(post);
    }
}
