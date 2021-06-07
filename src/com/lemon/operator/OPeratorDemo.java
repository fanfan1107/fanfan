package com.lemon.operator;

import com.sun.org.apache.xerces.internal.util.SynchronizedSymbolTable;

import javax.sound.midi.VoiceStatus;

/**
 * @Project: java_base
 * @Author: fanfan
 * @Create: 2021-03-28 13:50
 * @Desc： 运算符
 **/
public class OPeratorDemo {
    public static void main(String[] args) {
        //算术运算符
        int a = 10;
        int b = 4;
        System.out.println(a + b);
        System.out.println(a - b);
        System.out.println(a * b);
        System.out.println(a / b);//运算的结果等于参与运算的最大数据类型
        System.out.println(a % b);//取余--2
        //+可以做字符串的拼接
        System.out.println(5 + "10");
        //++自增1，--自减1
        //++单独使用前后没有区别，如果参与运算++在前，先自增再运算，如果++在后，先运算再自增


        //关系运算符  > < >= <=  != ==

        //逻辑运算符&  |   &&   ||

        System.out.println(a > b & a > b);
        //!取反
        System.out.println(!false);

        //赋值运算符
        int c=10;
        //扩展赋值运算符  += *= /= %=
        c+=11;//相当于c=int(c+10),JAVA大的数据类型不能直接赋值给小的数据类型
        //三元（目）运算符
        //boolean结果的表达式？结果1：结果2
        int max=a>b ?a:b;//如果为真结果则为a，为假则为b





    }

}
