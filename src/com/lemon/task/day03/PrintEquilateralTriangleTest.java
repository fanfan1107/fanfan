package com.lemon.task.day03;

/**
 * @Project: java_base
 * @Author: fanfan
 * @Create: 2021-03-28 21:15
 * @Desc： 打印等边三角形
 **/

import javax.swing.*;

/**
 * @@@@ *
 * @@@ * *
 * @@ * * *
 * @ * * * *
   * * * *  *
 */
public class PrintEquilateralTriangleTest {
    public static void main(String[] args){
        for (int i=1;i<=5;i++){
            //控制空格
            for (int j=1;j<=5-i;j++){
                System.out.print(" ");
            }
            for (int k=0;k<i;k++){
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
