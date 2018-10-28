package com.windows3.cloud.controller;

import com.windows3.cloud.po.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

/**
 * Created by 3 on 2018/10/8.
 */
@RestController
public class MovieController {

       @Autowired
    private RestTemplate restTemplate;


    @GetMapping("/movie/{id}")
    public User findById(@PathVariable Long id){
        return this.restTemplate.getForObject("http://provider-user/simple/"+id,User.class);
    }
}
