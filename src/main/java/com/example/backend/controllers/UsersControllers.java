package com.example.backend.controllers;

import com.example.backend.models.Users;
import com.example.backend.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.config.annotation.CorsRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

import java.util.List;

@RestController
@RequestMapping("/users")
@CrossOrigin(origins = "http://localhost:3000")
public class UsersControllers {
    @Autowired
    private UserService userService;


    @PostMapping("/save")
    public String add(@RequestBody Users user) {
        userService.saveUsers(user);
        return "New user added";
    }

    @GetMapping("/getAll")
    public List<Users> getAllUsers() {
        return userService.getAllUsers();
    }



    @CrossOrigin(origins = "http://localhost:3000")
    @DeleteMapping("delete/{id}")
    public String deleteUser(@PathVariable Users id) {
        userService.deleteUsers(id);
        return "user id:" + (id.getId()) + " deleted";
    }

}
