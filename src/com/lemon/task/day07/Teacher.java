package com.lemon.task.day07;

/**
 * @Project: java_base
 * @Author: fanfan
 * @Create: 2021-04-08 14:28
 * @Desc：
 **/
//老师类
public class Teacher {
    private String name;
    private int age;

    //空参构造
    public Teacher() {
    }

    //有参构造
    public Teacher(String name, int age) {
        this.name = name;
        if (age <= 0) {
            System.out.println("年龄必须大于0");
        } else {
            this.age = age;
        }

    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        if (age <= 0) {
            System.out.println("年龄必须大于0");
        } else {
            this.age = age;
        }

    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    @Override
    public String toString() {
        return "Teacher{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}
