package com.lemon.task.day04;

/**
 * @Project: java_base
 * @Author: fanfan
 * @Create: 2021-03-30 16:43
 * @Desc：
 **/
public class Calculator {
    int a;
    int b;

    //加法
    public void add() {
        System.out.println("两整数相加结果为："+(a + b));
    }

    //减法
    public void subtraction() {
        System.out.println("两整数相减结果为："+(a - b));
    }

    //乘法
    public void multiplication() {
        System.out.println("两整数相乘结果为："+(a * b));
    }

    //除法
    public void division() {
        System.out.println("两整数相除结果为："+(a / b));
    }
}
