package com.lemon.list;

import java.util.ArrayList;

/**
 * @Project: java_base
 * @Author: fanfan
 * @Create: 2021-04-08 11:46
 * @Desc：
 **/
public class ArrayListAPi {
    public static void main(String[] args) {
        ArrayList list=new ArrayList();

        list.add(1);
        list.add("1");
        list.add(true);
        list.add("ss");

        //获取，根据索引
        System.out.println(list.get(0));
        //长度
        System.out.println(list.size());
        //是否包含某个元素 contains
        System.out.println(list.contains(true));
        //删除，根据索引或元素删除
//        list.remove(0);
//        list.remove(true);
        //修改
        list.set(0,2);
        System.out.println(list);

    }
}
