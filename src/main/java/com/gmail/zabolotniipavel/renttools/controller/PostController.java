package com.gmail.zabolotniipavel.renttools.controller;

import com.gmail.zabolotniipavel.renttools.model.Post;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import javax.validation.Valid;

@Controller
public class PostController {
    @GetMapping("postOffer")
    public String getPostOffer(@ModelAttribute ("offer") Post post){
        return "postOffer";
    }
    @PostMapping("postOffer")
    public String addOffer(@Valid @ModelAttribute ("offer") Post post, BindingResult result){
        if(result.hasErrors()){
            System.out.println("There were errors in  offer" + result.getAllErrors());
            return "postOffer";
        }
        System.out.println("Added offer" + post.getTitle() + " " + post.getDescription());
        return "redirect:postOffer";
    }
}
