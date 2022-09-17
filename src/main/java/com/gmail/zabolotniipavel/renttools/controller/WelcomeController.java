package com.gmail.zabolotniipavel.renttools.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.Map;

@Controller
public class WelcomeController {
    @GetMapping("welcome")
    public String welcome(Map<String, Object> model){
        model.put("message", "My Super Cool Rent App");
        return "welcome";
    }
}
