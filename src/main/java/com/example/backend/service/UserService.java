package com.example.backend.service;

import com.example.backend.models.Users;

import java.util.List;
import java.util.Optional;

public interface UserService {

    Users saveUsers(Users user);

    List<Users> getAllUsers();

    void deleteUsers(Users id);

    Optional<Users> getOneUser(long id);
}
