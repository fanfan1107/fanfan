package com.lemon.control;

/**
 * @Project: java_base
 * @Author: fanfan
 * @Create: 2021-03-30 13:56
 * @Desc： dowhile
 **/
public class DoWhileDemo {
    /*
    do while 格式（了解）
		初始化语句 1
		do {
			循环体3;
			循环体执行之后的语句4;
		}while(条件判断语句2);
     */
    //do while 至少会执行一次循环体。
    public static void main(String[] args){
        int a=11;
        do {
            System.out.println(a);
            a++;

        }while (a<=10);

    }
}
