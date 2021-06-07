package com.lemon.map;

import java.util.HashMap;

/**
 * @Project: java_base
 * @Author: fanfan
 * @Create: 2021-04-10 14:45
 * @Desc：
 **/
public class HashMapDemo {
    public static void main(String[] args) {
        //键值对  key:无序，无索引，不可重复，如果put键相同，相当于替换值，覆盖原来的值
        HashMap<String,Integer> map=new HashMap<>();
        //添加值
        map.put("name",12);
        map.put("age",10);
        map.put("id",100);
        map.put("name",1033);

        System.out.println(map);

        //长度
        System.out.println(map.size());

        //取值
        System.out.println(map.get("id"));
        System.out.println(map.get("name"));

        //判断是否包含某个键  containskey
        System.out.println(map.containsKey("name"));
    }
}
