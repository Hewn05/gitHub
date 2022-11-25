package com.project.controller;

import com.project.dao.User;
import com.project.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;

@RestController
public class UserController {

    @Autowired
    private UserRepository userRepository;

    @PostMapping("/user")
    public User create(){
        User user = new User();
        user.setUsername("useruser");
        user.setPassword("00000000");
        return userRepository.save(user);
    }

    @GetMapping("/user/{id}")
    public String read(@PathVariable int id){

        Optional<User> userOptional = userRepository.findById(id);
        userOptional.ifPresent(System.out::println);

        return "successfully executed";
    }
}
