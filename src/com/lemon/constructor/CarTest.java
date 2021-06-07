package com.lemon.constructor;

/**
 * @Project: java_base
 * @Author: fanfan
 * @Create: 2021-04-02 16:45
 * @Desc：
 **/
public class CarTest {
    public static void main(String[] args) {
        //构造方法：创建对象，java提供了一个没有参数的构造方法（空参）
        //如果写了任意构造方法，java中不会再提供默认的构造方法
        //给成员变量赋值
        Car c=new Car();
        c.color="red";
        //两个对象指向同一个地址值
        Car c2=c;
        System.out.println(c);
        System.out.println(c2);
        System.out.println(c2.color);
    }
}
