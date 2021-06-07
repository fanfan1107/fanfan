package com.lemon.task.day07;

import java.util.ArrayList;

/**
 * @Project: java_base
 * @Author: fanfan
 * @Create: 2021-04-08 14:28
 * @Desc：
 **/
public class ArrayListDemo {
    public static void main(String[] args) {
        //创建Teacher类对象
        Teacher t1=new Teacher("张三",25);
        Teacher t2=new Teacher("李四",35);
        Teacher t3=new Teacher("老王",19);
        Teacher t4=new Teacher("赵六",29);

        //创建ArrayList集合存储t1,t2,t3,t4
        ArrayList<Teacher> list=new ArrayList<>();
        list.add(t1);
        list.add(t2);
        list.add(t3);
        list.add(t4);

        //普通for循环打印老师数据
        for (int i=0;i<list.size();i++){
            System.out.println(list.get(i));
        }
        System.out.println("================");

        //通过增强for循环打印
        for (Teacher ele:list){
            System.out.println(ele);
        }

        //求集合中老师平均年龄
        int ageSum=0;//初始化老师年龄总和为0
        for (int i=0;i<list.size();i++){
            ageSum+=list.get(i).getAge();
        }

        double avgAge=(double) ageSum/list.size();//平均年龄
        System.out.println("所有老师的平均年龄为："+avgAge);




    }
}
