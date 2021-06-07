package com.lemon.task.day02;

/**
 * @Project: java_base
 * @Author: fanfan
 * @Create: 2021-03-26 17:58
 * @Desc：
 **/
public class OperatorTest {
    public static void main(String[] args){
        int x = 1;
        int y = 2;  //求出下面结果，并说明为什么

        //求：x/y=0,运算的结果是参与运算的最大数据类型,是int类型,所以是0
        //求：y/x =2,2可以整除1,所以是2
        //求：x%y=1,取余,1除以2余数为1
        //求：y%x=0,取余,2除以1余数为0
        System.out.println(x/y);
        System.out.println(y/x);
        System.out.println(x%y);
        System.out.println(y%x);


    }
}
