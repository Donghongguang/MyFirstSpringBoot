package com.example.demo.controller;

import com.example.demo.entity.MyResult;
import com.example.demo.entity.UserInfo;
import com.example.demo.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * 先尝试看项目能否正常使用
 * 2019-05-06
 * 董红广
 */
@Controller
@RequestMapping(value="/user")
public class UserController {
    @Autowired
    private UserService userService;
    @ResponseBody
    @PostMapping("/login")
    public MyResult login(@RequestBody UserInfo userInfo){
        return userService.login(userInfo);
    }

}
