package com.chen.dao;

import com.chen.pojo.User;

public interface UserMapper {
    // 根据用户名查用户信息
    User selectUserByName(String username);
}
