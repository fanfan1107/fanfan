package com.lemon.task.day07;

/**
 * @Project: java_base
 * @Author: fanfan
 * @Create: 2021-04-08 15:13
 * @Desc：
 **/
public class StringReverse {
    public static void main(String[] args) {
        String str="abcdefg";
        String strReverse="";

        for (int i=str.length()-1;i>=0;i--){
            //利用字符串charAt方法获取到每个索引位置的值,再进行拼接
            strReverse+=str.charAt(i);
        }
        System.out.println("反转过后的字符串为："+strReverse);
    }
}
