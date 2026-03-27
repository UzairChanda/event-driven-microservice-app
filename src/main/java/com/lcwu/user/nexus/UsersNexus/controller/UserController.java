package com.lcwu.user.nexus.UsersNexus.controller;

import com.lcwu.user.nexus.UsersNexus.entities.User;
import com.lcwu.user.nexus.UsersNexus.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.UUID;

@RestController
@RequestMapping("/users")
public class UserController {

    //create user

    @Autowired
    private UserService userService;
    @PostMapping("/createNewUser")
    public ResponseEntity<User> createUser(@RequestBody User user){
        String randomUserId = UUID.randomUUID().toString();
        User newUser =  userService.saveUser(user);
        return  new ResponseEntity<User>(newUser, HttpStatus.OK);
    }

    @GetMapping("/{userId}")
    public ResponseEntity<User> getSingleUser(@PathVariable  String userId){
        User user = userService.getUser(userId);
        return  new ResponseEntity<>(user,HttpStatus.OK);
    }

    @GetMapping("/allUsers")
    public ResponseEntity<List<User>> getAllUsers(){
        List<User> allUsers =  userService.getAllUsers();
        return  new ResponseEntity<List<User>>(allUsers,HttpStatus.OK);
    }

    @GetMapping()
    public ResponseEntity<List<User>> getAllUserss(){
        List<User> allUsers =  userService.getAllUsers();
        return  new ResponseEntity<List<User>>(allUsers,HttpStatus.OK);
    }





}
