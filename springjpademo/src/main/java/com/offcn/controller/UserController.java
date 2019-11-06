package com.offcn.controller;

import com.offcn.entity.User;
import com.offcn.mapper.UserMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

@Controller
@RequestMapping
public class UserController {

    @Autowired
    private UserMapper userMapper;

    @RequestMapping(value = "/getUser")
    @ResponseBody
    public List<User> getUser(){

        List<User> userList = userMapper.getUser();
        System.out.println(userList);
        return userList;
    }


}
