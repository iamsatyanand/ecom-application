package com.app.ecom_application;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
public class UserController {

    List<User> users= new ArrayList<>();

    @GetMapping("/api/users")
    public List<User> getAllUsers(){
        return users;
    }

    @PostMapping("/api/users")
    public User createUser(@RequestBody User user){
        users.add(user);
        return user;
    }


}
