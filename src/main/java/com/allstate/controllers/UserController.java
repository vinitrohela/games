//package com.allstate.controllers;
//
//import com.allstate.entities.User;
//import com.allstate.services.UserService;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.web.bind.annotation.*;
//
//@RestController
//@RequestMapping(value = "/users")
//public class UserController {
//    private UserService userService;
//
//    @Autowired
//    public void setUserService(UserService userService) {
//        this.userService = userService;
//    }
//
//    @RequestMapping(value = {"", "/"}, method = RequestMethod.POST)
//    public User create(@RequestBody User user){
//        return this.userService.create(user);
//    }
//}
