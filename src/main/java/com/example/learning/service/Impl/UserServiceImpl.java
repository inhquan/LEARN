package com.example.learning.service.Impl;

import com.example.learning.model.User;
import com.example.learning.respository.UserRespository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserServiceImpl implements UserService{
    @Autowired
    UserRespository userRespository;

    @Override
    public List<User> getAllUser() {
        return userRespository.findAll();
    }

    @Override
    public User getUserByNameAndPassword(String name, String password) {
        return userRespository.findByNameAndPassword(name,password);
    }
}
