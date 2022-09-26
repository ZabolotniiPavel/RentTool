package com.gmail.zabolotniipavel.renttools.controller;

import com.gmail.zabolotniipavel.renttools.model.Offer;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import javax.validation.Valid;

@Controller
public class PostOfferController {
    @GetMapping("postOffer")
    public String getPostOffer(@ModelAttribute ("offer") Offer offer){
        return "postOffer";
    }
    @PostMapping("postOffer")
    public String addOffer(@Valid @ModelAttribute ("offer") Offer offer, BindingResult result){
        if(result.hasErrors()){
            System.out.println("There were errors in  offer" + result.getAllErrors());
            return "postOffer";
        }
        System.out.println("Added offer" + offer.getTitle() + " " + offer.getDescription());
        return "redirect:postOffer";
    }
}
