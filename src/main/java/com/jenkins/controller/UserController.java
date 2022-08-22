package com.jenkins.controller;

import com.jenkins.entity.User;
import com.jenkins.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class UserController {

    @Autowired
    private UserService userService;

    @PostMapping("/user")
    public User addUser(@RequestBody User user){
        return userService.addUser(user);
    }

    @GetMapping("/user/{id}")
    public User getUserById(@PathVariable("id")long id){
        return userService.getUserById(id);
    }

    @GetMapping("/users")
    public List<User> getAllUsers(){
        return userService.getAllUsers();
    }

    @DeleteMapping("/user/{id}")
    public void deleteUserById(@PathVariable("id")long id){
        userService.deleteUserById(id);
    }
}
