package com.lemon.control;

/**
 * @Project: java_base
 * @Author: fanfan
 * @Create: 2021-03-28 20:18
 * @Desc： sum求和
 **/
public class SumDemo {
    public static void main(String[] args){
        //求和1到100
        int sum=0;
        for (int i=1;i<=100;i++){
            sum+=i;
        }
        System.out.println(sum);
    }
}
