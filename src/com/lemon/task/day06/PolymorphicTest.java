package com.lemon.task.day06;

import com.lemon.task.day06.Coder;
import com.lemon.task.day06.Employee;

/**
 * @Project: java_base
 * @Author: fanfan
 * @Create: 2021-04-03 16:16
 * @Desc：
 **/
public class PolymorphicTest {
    public static void main(String[] args) {
        //父类类型接收子类对象
        Employee employee=new Coder();
        Employee employee1=new Tester();
        Employee employee2=new Manager();
        //调用work和sleep方法
        employee.work();
        employee.sleep();
        employee1.work();
        employee1.sleep();
        employee2.work();
        employee2.sleep();

       //调用method方法
        method(employee);
        method(employee1);
        method(employee2);

    }
  //method方法
    public static void method(Employee employee){
        employee.sleep();
        employee.work();
    }
}
