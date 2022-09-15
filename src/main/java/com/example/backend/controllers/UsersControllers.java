package com.example.backend.controllers;

import com.example.backend.models.Users;
import com.example.backend.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;


import java.util.List;
import java.util.Optional;

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

    @GetMapping("/getOne/{id}")
    public Optional<Users> getOneUser(@PathVariable long id) {
        return userService.getOneUser(id);
    }


    @PutMapping("update/{id}")
    public String updateUser(@PathVariable long id, @RequestBody Users user) {
        userService.saveUsers(user);
        return "User: " + id + " has been updated!";
    }



    @DeleteMapping("delete/{id}")
    public String deleteUser(@PathVariable Users id) {
        userService.deleteUsers(id);
        return "user id:" + (id.getId()) + " deleted";
    }

}
