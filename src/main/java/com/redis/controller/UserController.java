package com.redis.controller;

import com.redis.model.User;
import com.redis.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Map;
import java.util.UUID;

@RestController
@RequestMapping("/users")
public class UserController {

    @Autowired
    private UserRepository userRepository;

    @PostMapping
    public User saveUser(@RequestBody User user){
        user.setUserId(UUID.randomUUID().toString());
        return userRepository.saveUser(user);
    }

    @GetMapping("/{userId}")
    public User getUser(@PathVariable String userId){
        return userRepository.getUser(userId);
    }

    @GetMapping
    public List<User> getAllUsers(){
        return userRepository.getAllUsers();
    }

    @DeleteMapping("/{userId}")
    public void deleteUser(@PathVariable String userId){
        userRepository.deleteUser(userId);
    }

}
