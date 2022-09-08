package com.example.backend.service;

import com.example.backend.models.Users;
import com.example.backend.repositories.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserServiceAPI implements UserService{

    @Autowired
    private UserRepository userDao;

    @Override
    public Users saveUsers(Users user) {
        return userDao.save(user);
    }

    @Override
    public List<Users> getAllUsers() {
        return userDao.findAll();
    }
}
