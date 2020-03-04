package com.yubraj.springdocker.dockerproject.controller;

import com.yubraj.springdocker.dockerproject.model.User;
import com.yubraj.springdocker.dockerproject.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.Hashtable;

@RestController
@RequestMapping("/users")
public class PersonController {

    @Autowired
    UserService userService;

    @RequestMapping("/all")
    public Hashtable<String, User> getAll(){
        return userService.getAll();
    }

    @RequestMapping("{id}")
    public User getUser(@PathVariable("id") String id){
        return userService.getUser(id);
    }

}
