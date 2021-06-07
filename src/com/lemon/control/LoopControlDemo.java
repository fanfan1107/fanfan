package com.lemon.control;

/**
 * @Project: java_base
 * @Author: fanfan
 * @Create: 2git021-03-29 11:09
 * @Desc： 循环控制语句
 **/
public class LoopControlDemo {
    public static void main(String[] args){
        for (int i=0;i<=10;i++){
            if (i%3==0){
                //continue;//结束当前循环，继续下一次循环
                break;//结束整个循环
            }
        }
    }
}
