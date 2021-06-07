package com.lemon.task.day02;

/**
 * @Project: java_base
 * @Author: fanfan
 * @Create: 2021-03-26 17:23
 * @Desc： 使用两种方法创建一维数组{100,200,300,400,500}
 **/
public class OneDimensionalArray {
    public static void main(String[] args){
        //静态初始化创建
        int[] a={100,200,300,400,500};
        //动态初始化创建
        int[] a1=new int[5];
        a1[0]=100;
        a1[1]=200;
        a1[2]=300;
        a1[3]=400;
        a1[4]=500;


    }
}
