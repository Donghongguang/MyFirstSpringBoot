package com.example.demo.service;

import com.example.demo.entity.MyResult;
import com.example.demo.entity.UserInfo;

/**
 * 接口，主要用来测试项目能够正常运行
 * 董红广
 * 2019-05-06
 */
public interface UserService {

    MyResult login(UserInfo userInfo);

    MyResult getAllUSerINfo();

    MyResult editUser(UserInfo userInfo);

    MyResult addUser(UserInfo userInfo);
}
