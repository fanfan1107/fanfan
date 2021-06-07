package com.lemon.xxx;

import com.lemon.inherit.AccessDemo;

/**
 * @Project: java_base
 * @Author: fanfan
 * @Create: 2021-04-02 17:57
 * @Desc：测试访问修饰符
 **/
public class AccessSon extends AccessDemo {
    public static void main(String[] args) {
        String str="";
        //判断为空
//        if (str==null||str.equals("")){
//            System.out.println(123);
//        }
        //判断不为空
        if (str!=null&&str.length()!=0){
            System.out.println(123);
        }
        System.out.println(str.length());
    }


    public void show(){
//        AccessSon a=new AccessSon();
//        protectFiled=1;
//        System.out.println(protectFiled);
//        System.out.println(publicFiled);


    }
}
