package com.wishers.yellow_train_journeys.controllers;

import com.wishers.yellow_train_journeys.dto.User;
import com.wishers.yellow_train_journeys.service.UserService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(value = "/ytu-api")
public class UserController {

    @Autowired
    private UserService userservice;

    @PostMapping(value = "/createuser")
    public User createUser(@RequestBody User userdata) {
        //User response = userservice.createNewUser(userdata);

        return userservice.createNewUser(userdata);
    }

    @GetMapping(value = "/users")
    public List<User> getUser() {
        return userservice.getUser();
    }
}
