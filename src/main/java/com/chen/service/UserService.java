package com.chen.service;

import com.chen.pojo.User;

public interface UserService {
    // 根据用户名查用户信息
    User selectUserByName(String username);
}
