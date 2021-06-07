package com.lemon.task.day06;

import com.lemon.task.day06.Employee;

/**
 * @Project: java_base
 * @Author: fanfan
 * @Create: 2021-04-03 16:14
 * @Desc：
 **/
public class Manager extends Employee {
    @Override
    public void work(){
        System.out.println("管理项目");
    }
}
