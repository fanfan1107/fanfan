package com.lemon.control;

/**
 * @Project: java_base
 * @Author: fanfan
 * @Create: 2021-03-28 14:48
 * @Desc： if语句
 **/
public class IfDemo {
    //流程控制语句：控制代码是否执行
    public static void main(String[] args){
        //if的第一种格式：if
        int age=20;
        if(age>=10){
            System.out.println("你陈年了");
        }
        System.out.println("end");


        //if的第2种格式：if...else
        String username="admin";
        String password="admin";
        if (username=="admin"&&password=="admin"){
            System.out.println("登录成功");
        }else {
            System.out.println("登录失败");
        }
        System.out.println("end");

        //if的第3种格式：if...elseif...else...多分支，分支是互斥的
        int num=10;
        if (num>=80&&num<=100){
            System.out.println("111");
        }else if (num>=60&&num<80){
            System.out.println(2222);
        }else if (num>10&&num<60){
            System.out.println(3333);
        }else {
            System.out.println(66666);
        }

        System.out.println("end");

    }
}
