package com.lemon.method;

/**
 * @Project: java_base
 * @Author: fanfan
 * @Create: 2021-03-30 14:13
 * @Desc： 方法
 **/
public class MethodDemo {
    public static void main(String[] args){
        //调用方法--直接方法名
        add(3,4);
//        printNum(10);
       String result= contact("ee","wehdf");
       System.out.println(result);
    }

    //方法：访问修饰符  返回值  方法名（参数列表）{}
    //static 静态，我们使用static都是为了方便调用
    //add方法
    public static void add(int a, int b){
        System.out.println(a+b);
    }

    //循环打印1到n的方法
    public static void printNum(int n){
        for (int i=1;i<=n;i++){
            System.out.println(i);
        }
    }

    //返回拼接的字符串
    public static String contact(String s1,String s2){
        //return  表示方法结束  ；返回返回值，后面不能直接写代码
        return s1+s2;
    }
}
