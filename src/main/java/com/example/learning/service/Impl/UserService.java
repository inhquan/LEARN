package com.example.learning.service.Impl;

import com.example.learning.model.User;

import java.util.List;

public interface UserService {
    List<User> getAllUser();

    User getUserByNameAndPassword(String name, String password);

}
