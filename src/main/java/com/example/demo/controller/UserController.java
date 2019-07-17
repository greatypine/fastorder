package com.example.demo.controller;

import com.example.demo.model.User;
import com.example.demo.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/user")
public class UserController {

    @Autowired  UserService userService;
    @RequestMapping("/userList")
    public List<User> getUserList(){
        return userService.findAllUser();
    }
    @RequestMapping("/add")
    public String addUser(@RequestBody User user){
        if(user!=null){
            userService.createUser(user);
            return "success";
        }else{
            return "error";
        }
    }
}

