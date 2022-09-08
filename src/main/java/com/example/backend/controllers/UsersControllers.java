package com.example.backend.controllers;


import com.example.backend.models.Users;
import com.example.backend.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/users")
public class UsersControllers {
    @Autowired
    private UserService userService;

    @PostMapping("/save")
    public String add(@RequestBody Users user) {
        userService.saveUsers(user);
        return "New user added";
    }

}
