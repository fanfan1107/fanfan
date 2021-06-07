package com.lemon.task.day04;

import com.lemon.task.day04.Calculator;

/**
 * @Project: java_base
 * @Author: fanfan
 * @Create: 2021-03-30 16:50
 * @Desc：
 **/
public class CalculatorTest {
    public static void main(String[] args) {
        //创建对象
        Calculator c=new Calculator();
        //赋值
        c.a=3;
        c.b=4;
        //调用方法
        c.add();//加
        c.subtraction();//减
        c.multiplication();//乘
        c.division();//除

    }
}
