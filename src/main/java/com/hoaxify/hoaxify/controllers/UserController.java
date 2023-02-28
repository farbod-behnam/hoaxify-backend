package com.hoaxify.hoaxify.controllers;

import com.hoaxify.hoaxify.entities.AppUser;
import com.hoaxify.hoaxify.services.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserController {

    private final UserService userService;

    @Autowired
    public UserController(UserService userService) {
        this.userService = userService;
    }

    @PostMapping("/api/v1.0/users")
    public void createUser(@RequestBody AppUser appUser) {
        userService.save(appUser);
    }
}
