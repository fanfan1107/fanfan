package com.lemon.object;

/**
 * @Project: java_base
 * @Author: fanfan
 * @Create: 2021-03-30 16:16
 * @Desc： javabean类
 **/
public class Phone {
    //一般情况下这个类中不写main方法
    //成员变量/成员字段/成员属性
    String brand;
    int price;
    int size;
    //方法一般不加static
    public void call(){
        System.out.println("打电话");
    }

    public void sendMessage(){
        System.out.println("发信息");
    }

}
