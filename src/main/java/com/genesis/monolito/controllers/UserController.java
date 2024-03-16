package com.genesis.monolito.controllers;

import com.genesis.monolito.models.User;
import com.genesis.monolito.servicies.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("api/genesis/users")
public class UserController {
    @Autowired
    private UserService userService;
    @PostMapping("")
    public User createUser(@RequestBody User user){
        return userService.createUser(user);
    }
}
