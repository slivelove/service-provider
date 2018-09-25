package com.cloud.serviceprovider.controller;

import com.cloud.serviceprovider.entity.User;
import com.cloud.serviceprovider.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.Optional;

@Controller
public class UserController {
    @Autowired
    private UserRepository userRepository;

    @GetMapping("/simple/{id}")
    @ResponseBody
    public Optional<User> findById(@PathVariable Long id){
        return userRepository.findById(id);
    }
}
