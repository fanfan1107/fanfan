package com.lemon.task.day04;

import java.util.Scanner;

/**
 * @Project: java_base
 * @Author: fanfan
 * @Create: 2021-03-30 17:12
 * @Desc：
 **/
/*

要求此计算器支持控制台输入数据，能根据实际输入
的运算符（+、-、*、/）和数据来完成对应的运算
 */
public class ScannerCalculator {
        //scanner类创建对象
        Scanner s=new Scanner(System.in);
        //分别获取到控制台输入的数字，字符
        int a=s.nextInt();
        int b=s.nextInt();
        String c=s.next();


       public void calcaulate(){
           if (c.equals("+")){
               System.out.println(a+b);
           }else if (c.equals("-")){
               System.out.println(a-b);
           }else if (c.equals("*")){
               System.out.println(a*b);
           }else if (c.equals("/")){
               System.out.println(a/b);
           }else {
               System.out.println("运算符有误");
           }

       }

    }


