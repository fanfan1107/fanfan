package com.lemon.task.day03;

/**
 * @Project: java_base
 * @Author: fanfan
 * @Create: 2021-03-28 20:45
 * @Desc：
 **/
public class SumTest {
    public static void main(String[] args){
        //求0到100之间的所有的偶数和以及奇数和
        int oddSum=0;
        int evenSum=0;
        for (int i=0;i<=100;i++){
            if (i%2==0){
                evenSum+=i;
            }else {
                oddSum+=i;
            }
        }
        System.out.println("偶数和为："+evenSum);
        System.out.println("奇数和为："+oddSum);

    }
}
