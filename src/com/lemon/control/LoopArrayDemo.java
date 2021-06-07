package com.lemon.control;

/**
 * @Project: java_base
 * @Author: fanfan
 * @Create: 2021-03-28 20:57
 * @Desc： 循环遍历数组
 **/
public class LoopArrayDemo {
    public static void main(String[] args){
        int[] a={100,300,500};
//        System.out.print("[");
//        for (int i=0;i<a.length;i++){
//            if (i==a.length-1){
//                System.out.print(a[i]);
//            }else {
//                System.out.print(a[i]+",");
//            }
//        }


        //倒着遍历数组
//        for (int i=a.length-1;i>=0;i--){
//            System.out.print(a[i]+",");
//        }

        //增强for循环
//        for(数据类型 变量名 : 数组或者集合名) {
//        }
        for (int ele:a){
            System.out.println(ele);
        }
        System.out.println("]");
    }
}
