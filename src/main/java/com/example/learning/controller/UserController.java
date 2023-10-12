package com.example.learning.controller;

import com.example.learning.model.User;
import com.example.learning.service.Impl.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class UserController {
    @Autowired
    UserService iUserService;

    @GetMapping("/")
    public String index() {
        return "index";
    }

    @PostMapping("/login")
    public String login( String username, String password, Model model) {
        User user = iUserService.getUserByNameAndPassword(username, password);
        if (user != null) {
            model.addAttribute("user",user);
//            return "homeScreen";
            return "user";
        } else {
            return "errorScreen";
        }
    }

    @GetMapping("/user")
    public String user(Model model) {
        model.addAttribute("user", iUserService.getAllUser());
        return "user";
    }
}
