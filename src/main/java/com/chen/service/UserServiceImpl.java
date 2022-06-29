package com.chen.service;

import com.chen.dao.UserMapper;
import com.chen.pojo.User;

public class UserServiceImpl implements UserService{
    private UserMapper userMapper;

    public void setUserMapper(UserMapper userMapper){
        this.userMapper = userMapper;
    }

    @Override
    public User selectUserByName(String username) {
        return userMapper.selectUserByName(username);
    }
}
