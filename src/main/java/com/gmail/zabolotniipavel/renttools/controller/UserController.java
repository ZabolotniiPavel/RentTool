package com.gmail.zabolotniipavel.renttools.controller;

import com.gmail.zabolotniipavel.renttools.model.User;
import com.gmail.zabolotniipavel.renttools.model.UserDTO;
import com.gmail.zabolotniipavel.renttools.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;

@Controller
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

    @PostMapping("/register")
    public UserDTO registerUser(@Valid UserDTO user){
        //TODO:
        userService.save(user.getUser());
        return user;
    }
    @GetMapping("/register")
    public String showRegistrationForm(Model model){
        return "register";
    }
}
