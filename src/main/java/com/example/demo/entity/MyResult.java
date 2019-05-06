package com.example.demo.entity;

import java.util.List;

/**
 * 我也不知道干嘛用的
 * 2019-05-06
 * 董红广
 */
public class MyResult {
    private  int code;
    private String msg;
    private List<?> list;
    private Object obj;

    public int getCode() {
        return code;
    }

    public void setCode(int code) {
        this.code = code;
    }

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }

    public List<?> getList() {
        return list;
    }

    public void setList(List<?> list) {
        this.list = list;
    }

    public Object getObj() {
        return obj;
    }

    public void setObj(Object obj) {
        this.obj = obj;
    }
}
