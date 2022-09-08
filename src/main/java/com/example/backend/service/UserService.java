package com.example.backend.service;

import com.example.backend.models.Users;

import java.util.List;

public interface UserService {

    public Users saveUsers(Users user);
    public List<Users> getAllUsers();
}
