package com.lemon.constructor;

/**
 * @Project: java_base
 * @Author: fanfan
 * @Create: 2021-04-02 10:50
 * @Desc：
 **/
public class Car {
    String brand;//成员变量会有默认值
    String color;
    //构造方法没有返回值，方法名和类名保持一致
    public Car(){
    System.out.println("空参构造");
    }
    //有参构造
    public Car(String brand,String color){
        //this关键字区分成员变量和局部变量，强制在类里面找
        //类名相同时，是遵循就近原则，所以要用this区分
        this.color=color;
        this.brand=brand;
    }


}
