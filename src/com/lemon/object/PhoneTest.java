package com.lemon.object;

/**
 * @Project: java_base
 * @Author: fanfan
 * @Create: 2021-03-30 16:26
 * @Desc： phone测试类
 **/
public class PhoneTest {
    public static void main(String[] args) {
        //创建对象  类名 对象名（变量名）=new 类名（）
        Phone p=new Phone();//包名+类名=全类名
        System.out.println(p);//com.lemon.object.Phone@1b6d3586
        //给对象属性赋值
        p.brand="vivo";
        p.price=88;
        p.size=9;
        //调用方法
        p.sendMessage();
        p.call();
    }
}
