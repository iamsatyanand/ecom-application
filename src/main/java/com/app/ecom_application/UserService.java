package com.app.ecom_application;

import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class UserService {
    private List<User> userList = new ArrayList<>();
    private Long nextId = 1L;

    public List<User> getAllUsers(){
        return userList;
    }

    public User addUser(User user){
        user.setId(nextId++);
        userList.add(user);
        return user;
    }

    public User getuserById(Long id) {
        for(User user : userList){
            if(user.getId().equals(id)){
                return user;
            }
        }
        return null; // or throw an exception if user not found
         // or throw an exception if user not found
    }
}
