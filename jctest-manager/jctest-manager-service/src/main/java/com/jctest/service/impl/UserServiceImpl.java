package com.jctest.service.impl;

import com.jctest.mapper.UserMapper;
import com.jctest.pojo.User;
import com.jctest.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private UserMapper userMapper;



    @Override
    public List<User> getAllUser() {
        List<User> list = userMapper.getAllUser();
        return list;
    }
}
