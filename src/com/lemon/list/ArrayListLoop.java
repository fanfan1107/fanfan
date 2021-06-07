package com.lemon.list;

import java.util.ArrayList;
import java.util.Iterator;

/**
 * @Project: java_base
 * @Author: fanfan
 * @Create: 2021-04-08 11:53
 * @Desc：
 **/
public class ArrayListLoop {
    public static void main(String[] args) {
        ArrayList<String> list=new ArrayList<>();

        list.add("1");
        list.add("ss");

        //根据索引
        for (int i=0;i<list.size();i++){
            System.out.println(list.get(i));
        }

        //增强for
        for (String e:list){
            System.out.println(e);
        }

        //迭代器
        Iterator<String> it=list.iterator();
        while (it.hasNext()){
            String ele=it.next();
            System.out.println(ele);
        }
    }
}
