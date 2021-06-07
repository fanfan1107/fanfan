package com.lemon.encapsulation;

/**
 * @Project: java_base
 * @Author: fanfan
 * @Create: 2021-04-02 17:37
 * @Desc：封装
 **/
public class Student {
    //私有，只有本类可以访问
    private String name;
    private int age;


    public void setAge(int age){
        if(age<=0){
            System.out.println("输入有误");
        }else {
            this.age=age;
        }

    }

    public int getAge(){
        return age;
    }
}
