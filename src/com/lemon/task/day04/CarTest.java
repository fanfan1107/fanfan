package com.lemon.task.day04;

import com.lemon.task.day04.Car;

/**
 * @Project: java_base
 * @Author: fanfan
 * @Create: 2021-03-30 16:58
 * @Desc：
 **/
public class CarTest {
    public static void main(String[] args) {
        //创建对象
        Car c=new Car();
        c.brand="凯迪拉克";
        c.color="黑色";
        c.wheels=4;
        System.out.println(c.brand);
        System.out.println(c.color);
        System.out.println(c.wheels);
        c.start();
        c.brake();
    }
}
