package com.lemon.task.day05;

/**
 * @Project: java_base
 * @Author: fanfan
 * @Create: 2021-04-01 12:48
 * @Desc：
 **/

import sun.net.idn.Punycode;

/**
 * 写一个标准的学生类，有姓名、年龄、分数三个私有属性。提供get/set方法，提供有参和无参构造，不要用快捷键。
 *
 * 限定年龄必须大于15岁，无效信息需提示，并设置默认年龄为15。
 *
 * 限定分数为只读属性（只有get方法，没有set方法）。
 *
 * 提供一个show方法打印姓名、年龄、分数
 */
public class Student {
    private String name;
    private int age=15;
    private double score;

    //无参构造
    public Student(){

    }
    //有参构造
    public Student(String name,int age,double score){
        this.name=name;
        if (age<=15){
            System.out.println("年龄必须大于15岁");
        }else {
            this.age=age;
        }
        this.score=score;
    }
   //设置姓名
    public void setName(String name){
        this.name=name;
    }
   //获取姓名
    public String getName(){
        return name;
    }
    //设置年龄
    public void setAge(int age){
        if (age<=15){
            System.out.println("年龄限定年龄必须大于15岁");
        }else{
            this.age=age;
        }
    }
   //获取年龄
    public  int getAge(){
        return age;
    }
    //获取分数
    public double getScore(){
        return score;
    }
    //show方法
    public void show(){
        System.out.println("姓名："+name+"年龄："+age+"分数："+score);
    }

}
