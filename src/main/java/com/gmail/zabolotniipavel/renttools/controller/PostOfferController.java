package com.gmail.zabolotniipavel.renttools.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.Map;

@Controller
public class PostOfferController {
    @GetMapping("postOffer")
    public String getPostOffer(Map<String, Object> model){
        return "postOffer";
    }
}
