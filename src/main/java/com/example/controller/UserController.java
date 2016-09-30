package com.example.controller;

import com.example.domain.User;
import com.example.service.UserService;
import org.apache.catalina.servlet4preview.http.HttpServletRequest;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

/**
 * ${DESCRIPTION}
 *
 * @author xujiuhua
 * @create 2016-09-29-13:58
 */
@Controller
public class UserController {

    @Autowired
    private UserService userService;

    @RequestMapping("findUsers")
    @ResponseBody
    public List<User> findUsers() {
        List<User> users= userService.findUsers();
        return users;
    }

    @RequestMapping("login")
    public void login(User user, HttpServletRequest request) {
        user.setId(1);
        userService.login(user);
    }

}
