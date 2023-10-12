package com.example.learning.respository;

import com.example.learning.model.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRespository extends JpaRepository<User , Integer> {
    User findByNameAndPassword(String name,String password);
}
