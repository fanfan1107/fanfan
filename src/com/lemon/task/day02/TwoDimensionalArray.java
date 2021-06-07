package com.lemon.task.day02;

/**
 * @Project: java_base
 * @Author: fanfan
 * @Create: 2021-03-26 17:43
 * @Desc： 二维数组{{"java","html"},{"css","javascript"}}
 **/
public class TwoDimensionalArray {
    public static void main(String[] args){
        //静态初始化
        String[][] arr={{"java","html"},{"css","javascript"}};
        //动态初始化
        String[][] arr1=new String[3][2];
        arr1[0][0]="java";
        arr1[0][1]="html";
        arr1[1][0]="css";
        arr1[1][1]="javascript";
        arr1[2][0]="python";
        arr1[2][1]="c++";
        System.out.println( arr1[2][0]);



    }
}
