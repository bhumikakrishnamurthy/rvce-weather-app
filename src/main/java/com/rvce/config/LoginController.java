package com.rvce.config;

import com.rvce.model.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class LoginController {

    @Autowired
    private UserRepository userRepository;

    @PostMapping("/login")
    public boolean login(@RequestBody LoginForm requestBody) {

        // Query the database to see if the user exists and the password is correct
        return userRepository.findByEmailAndPassword(requestBody.getEmail(), requestBody.getPassword()) != null;
    }
}

