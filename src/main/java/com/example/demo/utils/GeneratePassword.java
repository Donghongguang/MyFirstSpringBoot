package com.example.demo.utils;



public class GeneratePassword {
    final static String password= "QWERTYUIOPLKJMNHGBVFDCXSAZqazxswedcvfrtgbnhyujmkiolp.!@#$%^&*123456789?";
    public static  String generatePassword(){
        String newpassword = null;
        for(int i=0;i<8;i++){
            newpassword +=password.charAt((int)Math.random()*90);
        }
        return newpassword;
    }


}
