package com.lemon.encapsulation;

/**
 * @Project: java_base
 * @Author: fanfan
 * @Create: 2021-04-02 17:36
 * @Desc： 封装
 **/
public class EncapsulationDemo {
    public static void main(String[] args) {
        Student s=new Student();
        s.setAge(0);
        s.getAge();
        System.out.println(s.getAge());

    }
}
