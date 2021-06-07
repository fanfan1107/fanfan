package com.lemon.arry;

/**
 * @Project: java_base
 * @Author: fanfan
 * @Create: 2021-03-26 17:33
 * @Desc： 数据常见异常
 **/
public class ArrayException {
    public static void main(String[] args){
        //索引越界异常,ArrayIndexOutOfBoundsException
        int[] a={1,2};
//        System.out.println(a[9]);
        //空指针异常
        //null可以赋值给任意的引用数据类型，代表什么都没有
        int[] a1=null;//数组一开始可以赋值为null，但是后面如果想要去使用变量就会报错。
        //如果要使用数组a1，就要在new数组
        a1=new int[3];





    }
}
