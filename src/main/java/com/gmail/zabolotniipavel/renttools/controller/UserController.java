package com.gmail.zabolotniipavel.renttools.controller;

import com.gmail.zabolotniipavel.renttools.model.User;
import com.gmail.zabolotniipavel.renttools.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;

@RestController
public class UserController {
    @Autowired
    private UserService userService;
    @GetMapping("/user")
    public User getUser(@Valid @RequestParam(value = "name", defaultValue = "Vadik Krasava") String name,
                        @Valid @RequestParam(value = "mobile", defaultValue = "88005553555") String mobile){
        User user = new User();
        user.setUserName(name);
        user.setMobileNumber(mobile);
        userService.save(user);
        return user;
    }

    @PostMapping("/user")
    public User getPoarUser(@Valid User user){
        System.out.println(user.getUserName());
        userService.save(user);
        return user;
    }
}
