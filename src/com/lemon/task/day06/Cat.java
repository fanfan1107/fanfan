package com.lemon.task.day06;

import com.lemon.task.day06.Animal;

/**
 * @Project: java_base
 * @Author: fanfan
 * @Create: 2021-04-03 16:02
 * @Desc：
 **/
public class Cat extends Animal {

    @Override
    public void eat(){
     System.out.println("猫喜欢吃鱼");
    }

    //抓老鼠方法
    public void catchMouse(){
        System.out.println("抓老鼠");
    }
}
