package com.lemon.task.day06;

import com.lemon.task.day06.Animal;

/**
 * @Project: java_base
 * @Author: fanfan
 * @Create: 2021-04-03 16:02
 * @Desc：
 **/
public class Dog extends Animal {
    @Override
    public void sleep(){
        System.out.println("狗睡觉");
    }
    //看家方法
    public void lookAfterHouse(){
        System.out.println("看家");
    }
}
