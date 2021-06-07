package com.lemon.object;

import java.security.PublicKey;

/**
 * @Project: java_base
 * @Author: fanfan
 * @Create: 2021-03-30 16:41
 * @Desc： user类
 **/
public class User {
    String username;
    String password;

    public void login(){
        System.out.println(username+"登录成功");
    }
}
