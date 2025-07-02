package com.app.ecom_application;

import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequiredArgsConstructor
@RequestMapping("/api/users")
public class UserController {

    private final UserService userService;

//    public UserController(UserService userService) {
//        this.userService = userService;
//    }

    @GetMapping()
    public ResponseEntity<List<User>> getAllUsers(){
        if (userService.getAllUsers().isEmpty()) {
            return new ResponseEntity<>(HttpStatus.NO_CONTENT);
        }
        return new ResponseEntity<>(userService.getAllUsers(), HttpStatus.OK);
    }

    @GetMapping("/{id}")
    public ResponseEntity<User> GetUserById(@PathVariable Long id){
        User user = userService.getuserById(id);
        if(user == null) {
            return ResponseEntity.notFound().build();
//            return ResponseEntity.status(HttpStatus.NOT_FOUND).build();
//            return new  ResponseEntity<>(user, HttpStatus.NOT_FOUND);
        }
        return ResponseEntity.ok(user);
//        return userService.getuserById(id);
    }

    @PostMapping()
    public ResponseEntity<User> createUser(@RequestBody User user){
        return new ResponseEntity<>(userService.addUser(user), HttpStatus.CREATED);
    }


}
