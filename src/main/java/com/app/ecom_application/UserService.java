package com.app.ecom_application;

import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class UserService {
    List<User> userList = new ArrayList<>();

    public List<User> getAllUsers(){
        return userList;
    }

    public User addUser(User user){
        userList.add(user);
        return user;
    }
}
