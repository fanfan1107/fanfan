package com.lemon.task.day05;

import com.lemon.task.day05.Student;

/**
 * @Project: java_base
 * @Author: fanfan
 * @Create: 2021-04-01 13:20
 * @Desc：
 **/
public class StudentTest {
    public static void main(String[] args) {
        //无参构造
        Student s=new Student();
        s.setAge(14);
        s.setName("fanfan");
        s.show();
        //有参构造
        Student s1=new Student("amy",14,99);
        s1.show();

    }
}
