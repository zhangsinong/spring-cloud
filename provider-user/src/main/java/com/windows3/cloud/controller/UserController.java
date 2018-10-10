package com.windows3.cloud.controller;

import com.windows3.cloud.po.User;
import com.windows3.cloud.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.Optional;

/**
 * Created by 3 on 2018/10/8.
 */
@RestController
public class UserController {

    @Autowired
    private UserRepository userRepository;

    @GetMapping("/simple/{id}")
    public Optional<User> findById(@PathVariable Long id){
        return userRepository.findById(id);
    }
}
