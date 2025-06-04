package com.example.ec2springbootsample.controller;

import com.example.ec2springbootsample.repository.UserRepository;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import com.example.ec2springbootsample.entity.User;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class HomeController {
    private final UserRepository userRepository;
    public HomeController(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    @GetMapping("/")
    public String home() {
        return "home";
    }

    @GetMapping("/user-form")
    public String about() {
        return "about";
    }

    @PostMapping("/users")
    public String saveUser(@RequestParam String name, @RequestParam String email) {
        User user = new User();
        user.setName(name);
        user.setEmail(email);
        userRepository.save(user);
        return "redirect:/user-form";
    }
}