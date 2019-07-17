package com.example.demo.service;

import com.example.demo.dao.UserMapper;
import com.example.demo.model.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service("UserService")
public class UserService {
    @Autowired UserMapper userdao;

    public List<User> findAllUser(){
        return userdao.findAllUser();
    }

    public void createUser(User user){
        userdao.createUser(user);
    }
}
