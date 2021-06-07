package com.lemon.control;

import java.time.temporal.ValueRange;

/**
 * @Project: java_base
 * @Author: fanfan
 * @Create: 2021-03-28 15:08
 * @Desc： switch
 **/
public class SwitchDemo {
    public static void main(String[] args){
        int month=1;
        //switch是做等值匹配
        switch (month){
            case 1:
                System.out.println("dong");
                break;
            case 2:
                System.out.println("xia");
                break;
            case 3:
                System.out.println("qiu");
                break;
            default:
                System.out.println("输入月份有问题");
        }




    }
}
