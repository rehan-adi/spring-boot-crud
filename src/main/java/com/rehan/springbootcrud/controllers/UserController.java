package com.rehan.springbootcrud.controllers;

import com.rehan.springbootcrud.models.User;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import com.rehan.springbootcrud.repositories.UserRepository;

import java.util.List;

@RestController
@RequestMapping("/api/users")
public class UserController {

    private final UserRepository userRepository;

    public UserController(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    @GetMapping
    public ResponseEntity<?> getAllUsers() {
        try {
            List<User> users = userRepository.findAll();

            if (users.isEmpty()) {
                return ResponseEntity.status(404).body("No users found.");
            }

            return ResponseEntity.ok(users);
        } catch (Exception e) {
            return ResponseEntity.status(500).body("Something went wrong: " + e.getMessage());
        }
    }
}
