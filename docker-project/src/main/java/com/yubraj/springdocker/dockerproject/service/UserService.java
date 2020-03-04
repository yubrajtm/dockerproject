package com.yubraj.springdocker.dockerproject.service;

import com.yubraj.springdocker.dockerproject.model.User;
import org.springframework.stereotype.Service;

import java.util.Hashtable;

@Service
public class UserService {
    Hashtable<String, User> users = new Hashtable<String,User>();

    public UserService(){
        User user = new User();
        user.setId("1");
        user.setAge(25);
        user.setFirstName("Yubraj");
        user.setLastName("Ghimire");
        users.put("1",user);

        user = new User();
        user.setId("2");
        user.setAge(32);
        user.setFirstName("Ali");
        user.setLastName("Ahamandi");

        users.put("2",user);

    }
    public User getUser(String id){
        if(users.containsKey(id))
            return users.get(id);
        else
            return null;
    }

    public Hashtable<String, User> getAll(){
        return users;
    }

}
