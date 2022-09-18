package com.gmail.zabolotniipavel.renttools.controller;

import com.gmail.zabolotniipavel.renttools.model.User;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;

@RestController
public class UserController {
    @GetMapping("/user")
    public User getUser(@Valid @RequestParam(value = "name", defaultValue = "Vadik Krasava") String name,
                        @Valid @RequestParam(value = "mobile", defaultValue = "88005553555") String mobile){
        User user = new User();
        user.setUserName(name);
        user.setMobileNumber(mobile);
        return user;
    }

    @PostMapping("/user")
    public User getPoarUser(@Valid User user){
        System.out.println(user.getUserName());
        return user;
    }
}
