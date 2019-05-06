package com.example.demo.service.serviceimpl;

import com.example.demo.dao.UserInfoMapper;
import com.example.demo.entity.MyResult;
import com.example.demo.entity.UserInfo;
import com.example.demo.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

/**
 * 实现userservice方法
 * 2019-05-06
 * 董红广
 */
@Service(value = "/userService")
public class UserServiceImpl implements UserService {

    @Autowired
    private UserInfoMapper userInfoMapper;
    @Override
    public MyResult login(UserInfo userInfo) {
        UserInfo user=userInfoMapper.login(userInfo.getUsername());
        MyResult myResult=new MyResult();
        List<UserInfo> list=new ArrayList<>();
        if(user==null){
            myResult.setMsg("不存在该用户");
            myResult.setCode(0);
        }else if(!user.getPassword().equals(userInfo.getPassword())){
             myResult.setMsg("密码错误");
             myResult.setCode(1);
        }else{
            myResult.setCode(2);//登陆成功
            myResult.setMsg("登录成功");
            list.add(user);
            myResult.setList(list);
            myResult.setObj(user);
        }

        return myResult;
    }
}
