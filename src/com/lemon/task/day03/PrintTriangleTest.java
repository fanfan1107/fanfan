package com.lemon.task.day03;

/**
 * @Project: java_base
 * @Author: fanfan
 * @Create: 2021-03-28 21:09
 * @Desc： 打印三角形
 **/
public class PrintTriangleTest {
    public static void main(String[] args){
        //打印三角形
        for (int i=1;i<=5;i++){
            for (int j=1;j<=i;j++){
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
