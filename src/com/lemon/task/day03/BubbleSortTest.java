package com.lemon.task.day03;

/**
 * @Project: java_base
 * @Author: fanfan
 * @Create: 2021-03-28 22:16
 * @Desc： 冒泡排序
 **/
public class BubbleSortTest {
    public static void main(String[] args){
        int[] items ={1,3,5,7,9,2,4,6,8,0};
        //要比较n-1轮
        for (int j=0;j<items.length-1;j++){
            //每轮结束后都会确定一个最大值
            for (int i=0;i<items.length-1-j;i++){
                if (items [i]>items [i+1]){
                    int temp=items[i+1];
                    items[i+1]=items[i];
                    items[i]=temp;
                }
            }

        }
       System.out.print("[");
        for (int i=0;i<items.length;i++){
            if (i==items.length-1){
                System.out.print(items[i]);
            }else {
                System.out.print(items[i]+",");
            }
        }
        System.out.print("]");
    }
}
