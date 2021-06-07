package com.lemon.list;

import java.util.ArrayList;

/**
 * @Project: java_base
 * @Author: fanfan
 * @Create: 2021-04-08 10:32
 * @Desc：集合
 **/
public class ArrayListDemo {
    public static void main(String[] args) {
        //arraylist  超级数组  有序，有索引，可重复
        ArrayList list=new ArrayList();

        list.add(1);
        list.add("1");
        list.add(true);
        list.add("ss");
        //为什么输出的是值，不是地址值，因为println自动调用传入对象的tostring，arraylist重写了tostring()方法
        System.out.println(list);

        //泛型 规定集合数据类型，只能是引用数据类型
        ArrayList<String> list1=new ArrayList<>();
        list1.add("1");

        ArrayList<Integer> list2=new ArrayList<>();
        list2.add(1);

        //将一个全是数字的字符串转成int
        int i=Integer.parseInt("123");
        System.out.println(i);
        //将数字转换为字符串  直接使用+“”


        ArrayList<Animal> list3=new ArrayList<>();
        Animal a1=new Animal("黑色",4,"猫");
        Animal a2=new Animal("红色",43,"狗");
        Animal a3=new Animal("白色",3,"鸡");
        list3.add(a1);
        list3.add(a2);
        list3.add(a3);

        System.out.println(list3);




    }
}
