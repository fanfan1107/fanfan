package com.lemon.set;

import java.util.HashSet;
import java.util.Iterator;

/**
 * @Project: java_base
 * @Author: fanfan
 * @Create: 2021-04-08 14:25
 * @Desc：
 **/
public class HashSetLoop {
    public static void main(String[] args) {
        HashSet<String> set=new HashSet<>();
        set.add("ss");
        set.add("dd");

        for (String el:set){
            System.out.println(el);
        }

        System.out.println("--------");

        Iterator<String> it=set.iterator();
        while (it.hasNext()){
            String ele=it.next();
            System.out.println(ele);
        }
    }
}
