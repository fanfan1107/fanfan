package com.lemon.control;

/**
 * @Project: java_base
 * @Author: fanfan
 * @Create: 2021-03-28 19:55
 * @Desc： for循环
 **/
public class ForDemo {
    public static void main(String[] args){
//        for(初始化语句 1 ;条件判断语句 2 ;循环体执行之后的语句 4) {
//            循环体 3 ;
//        }
        for (int i=1;i<=5;i++){
//            System.out.println("*****");
            for (int j=1;j<=5;j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
