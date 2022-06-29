package com.chen.controller;

import com.chen.pojo.User;
import com.chen.service.BookService;
import com.chen.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpSession;

@Controller
public class LoginController {

    @Autowired
    @Qualifier("userServiceImpl")
    private UserService userService;

    @RequestMapping("/toLogin")
    public String toLogin(){
        return "login";
    }

    @RequestMapping("/login")
    public String login(HttpSession session, User user){
        // 在数据库中查询
        User queryUser = userService.selectUserByName(user.getUsername());
        // 确有此人且密码正确
        if(queryUser != null && queryUser.getPassword().equals(user.getPassword())){
            // 存入session
            session.setAttribute("username", user.getUsername());
            // 返回书籍页面
            return "redirect:/book/allBook";
        }else{
            // 重新登录
            return "login";
        }
    }
}
