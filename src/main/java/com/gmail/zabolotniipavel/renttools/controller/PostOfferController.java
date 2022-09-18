package com.gmail.zabolotniipavel.renttools.controller;

import com.gmail.zabolotniipavel.renttools.model.Offer;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import java.util.Map;

@Controller
public class PostOfferController {
    @GetMapping("postOffer")
    public String getPostOffer(@ModelAttribute ("offer") Offer offer){
        return "postOffer";
    }
    @PostMapping("postOffer")
    public String addOffer(@ModelAttribute ("offer") Offer offer){
        System.out.println("Added offer" + offer.getName());
        return "postOffer";
    }
}
