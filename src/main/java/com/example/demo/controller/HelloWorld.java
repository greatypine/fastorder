package com.example.demo.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@RestController
public class HelloWorld {

    @RequestMapping("/hello")
    public String test(){
        return "hello,this is a springboot demo";
    }

    @RequestMapping("getUser")
    public Map<String, Object> getUser(){
        System.out.println("微信小程序正在调用。。。");
        Map<String, Object> map = new HashMap<String, Object>();
        List<String> list = new ArrayList<String>();
        list.add("zhangsan");
        list.add("lisi");
        list.add("wanger");
        list.add("mazi");
        map.put("list",list);
        System.out.println("微信小程序调用完成。。。");
        return map;
    }

}
