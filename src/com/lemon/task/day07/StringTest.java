package com.lemon.task.day07;

import javax.swing.plaf.SpinnerUI;
import java.awt.event.FocusEvent;

/**
 * @Project: java_base
 * @Author: fanfan
 * @Create: 2021-04-08 15:02
 * @Desc：
 **/
public class StringTest {
    public static void main(String[] args) {
        String s= "abc,123,中国,llllll,haha";
        //利用spilt方法，根据逗号切割成数组
        String[] arr=s.split(",");
        //循环数组输出
        for (int i=0; i<arr.length;i++){
            if (i==arr.length-1){
                System.out.print(arr[i]+":"+arr[i].length());
            }else {
                System.out.print(arr[i]+"："+arr[i].length()+"，");
            }

        }
    }
}
