package com.lemon.method;

import javax.crypto.interfaces.PBEKey;

/**
 * @Project: java_base
 * @Author: fanfan
 * @Create: 2021-03-30 15:12
 * @Desc： 方法重载
 **/
public class OverLoadDemo {
    public static void main(String[] args){
        //方法重载
        //在一个类中方法名一样，参数列表不一样(类型，个数，类型的顺序)
        //作用：减少方法的记忆，方便调用者使用
//        add();
    }
    public static void add(int a,int b){
        System.out.println(a+b);
    }
    public static void add(double a,double b){
        System.out.println(a+b);
    }
}
