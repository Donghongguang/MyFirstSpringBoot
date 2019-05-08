package com.example.demo.service.serviceimpl;

import com.example.demo.dao.UserInfoMapper;
import com.example.demo.entity.MyResult;
import com.example.demo.entity.UserInfo;
import com.example.demo.service.UserService;
import com.example.demo.utils.GeneratePassword;
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
        UserInfo user;
        MyResult myResult=new MyResult();
        List<UserInfo> list=new ArrayList<>();
        if(userInfo.getUsername().length()==0){
            myResult.setMsg("请输入用户名");
            myResult.setCode(4);
        }else if(userInfo.getPassword().length()==0){
            myResult.setMsg("请输入密码");
            myResult.setCode(5);
        }else{
            user=userInfoMapper.login(userInfo.getUsername());
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
        }
        return myResult;
    }

    @Override
    public MyResult getAllUSerINfo() {
        MyResult myResult=new MyResult();
        List<UserInfo> userInfoList=userInfoMapper.selectAllUserInfo();
        if(userInfoList.size()>0){
            myResult.setList(userInfoList);
            myResult.setMsg("共有"+userInfoList.size()+"条数据");
            myResult.setCode(0);
        }else{
            myResult.setCode(1);
            myResult.setMsg("暂无数据");
        }
        return myResult;
    }

    @Override
    public MyResult editUser(UserInfo userInfo) {
        MyResult myResult=new MyResult();
        List<UserInfo> userInfoList=new ArrayList<>();
        if(userInfo.getUsername().length()==0){
            myResult.setMsg("用户名不能为空");
            myResult.setCode(0);
        }else if(userInfo.getPassword().length()==0){
            myResult.setMsg("请输入手机号码");
            myResult.setCode(1);
        }else{
            userInfoMapper.updateByPrimaryKey(userInfo);
            myResult.setMsg("更改成功");
            myResult.setCode(3);
            myResult.setObj(userInfo);
            userInfoList.add(userInfo);
            myResult.setList(userInfoList);

        }
        return myResult;
    }

    @Override
    public MyResult addUser(UserInfo userInfo) {
        MyResult myResult=new MyResult();
        if(userInfo.getUsername().length()==0){
            myResult.setMsg("请输入用户名");
            myResult.setCode(1);
        }else if(userInfo.getTelephone().length()==0){
            myResult.setMsg("请输入密码");
            myResult.setCode(2);
        }else{
            userInfo.setScore((float) 10);
            userInfo.setRoleId(1);
            userInfo.setPassword(GeneratePassword.generatePassword());
            userInfoMapper.insert(userInfo);
            myResult.setMsg("添加成功");
            myResult.setCode(0);
            myResult.setObj(userInfo);
        }
        return myResult;
    }
}
