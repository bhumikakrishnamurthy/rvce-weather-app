package com.rvce.config;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.rvce.model.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.util.MultiValueMap;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class LoginController {

    @Autowired
    private UserRepository userRepository;

    @PostMapping("/login")
    public boolean login(@RequestBody MultiValueMap requestBody) throws JsonProcessingException {
        ObjectMapper mapper = new ObjectMapper();
        LoginForm form = mapper.readValue(requestBody.keySet().toArray()[0].toString(), LoginForm.class);

        // Query the database to see if the user exists and the password is correct
        return userRepository.findByUsernameAndPassword(form.getUsername(), form.getPassword()) != null;
    }
}

