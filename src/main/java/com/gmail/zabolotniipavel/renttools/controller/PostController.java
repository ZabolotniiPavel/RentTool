package com.gmail.zabolotniipavel.renttools.controller;

import com.gmail.zabolotniipavel.renttools.model.Post;
import com.gmail.zabolotniipavel.renttools.service.PostService;
import com.gmail.zabolotniipavel.renttools.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.validation.Valid;
import java.util.List;

@Controller
public class PostController {
    @Autowired
    private PostService postService;
    @Autowired
    private UserService userService;
    @GetMapping("postOffer")
    public String getPostOffer(@ModelAttribute ("post") Post post){
        return "postOffer";
    }
    @PostMapping("postOffer")
    public String addOffer(@Valid @ModelAttribute ("post") Post post, BindingResult result){
        if(result.hasErrors()){
            return "postOffer";
        }
        post.setUser(userService.find(2L));
        postService.save(post);
        return "redirect:posts";
    }
    @GetMapping("posts")
    public String getPosts(Model model) {
        model.addAttribute("posts", postService.findAll());
        return "posts";
    }
}
