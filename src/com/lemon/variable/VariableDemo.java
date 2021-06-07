package com.lemon.variable;

/**
 * @Project: java_base
 * @Author: Le0Wu
 * @Create: 2021-03-26 15:11
 * @Desc： 变量
 **/
public class VariableDemo {
    public static void main(String[] args){
        //定义变量格式：数据类型  变量名=变量值
        //逻辑类型
        boolean bool=false;
        boolean bool2=true;
        //重新给变量赋值：变量名=新值
        bool=true;
        //整数
        byte b1=120;
        byte b2=-1;
        short s1=100;
        int i1=10;
        long l1=1;
        long l2=2147483648l;//java中写一个整数默认就是int，所以超过int类型的最大值就会报错,
        //在使用long类型的时候，无论有没有超过int的数值范围，一般都会加大写L或l
        //小数
        float f1=1;
        System.out.println(f1);
        float f2=0.1f;//java中写一个小数类型默认是double，double类型比float大，不能直接赋值，要加f/F
        double d1=3.14;
        double d2=0.33d;
        //字符，用单引号‘’，包含一个字符
        //char c='1';
        //char c1='大';

        int a=5;
        int b=2;
        float c=32.8f;
        System.out.println(b*(int)c%a);
    }
}
