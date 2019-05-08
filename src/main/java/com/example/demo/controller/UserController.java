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

import java.util.List;

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
    public MyResult login(@RequestBody UserInfo userInfo) {
        return userService.login(userInfo);
    }


    /**
     * 看前端能不能接收数据，返回后端user的所有数据写入前端表格
     * 董红广
     * 2019-05-08
     */
    @ResponseBody
    @PostMapping("/getuserList")
    public MyResult getAllUser() {
        return userService.getAllUSerINfo();
    }
    /**
     * 编辑信息
     * 董红广
     * 2019-05-08
     */
    @ResponseBody
    @PostMapping("/editUser")
    public MyResult ediUser(@RequestBody UserInfo userInfo){
        return userService.editUser(userInfo);
    }
    /**
     * 增加用户基本信息
     * 董红广
     * 2019-05-08
     */
    @ResponseBody
    @PostMapping("/addUser")
    public MyResult addUSer(@RequestBody UserInfo userInfo){
        return userService.addUser(userInfo);
    }
}

