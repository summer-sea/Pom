package com.jctest.controller;


import com.jctest.pojo.User;
import com.jctest.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;


@RequestMapping("user")
@Controller
public class UserController {

    @Autowired
    private UserService userService;


    @RequestMapping("getAllUser")
    @ResponseBody
    public List<User> getAllUser(){
        return  userService.getAllUser();
    }

}
