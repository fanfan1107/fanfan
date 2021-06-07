package com.lemon.task.day07;

import java.util.HashMap;

/**
 * @Project: java_base
 * @Author: fanfan
 * @Create: 2021-04-08 15:28
 * @Desc：
 **/
public class HashMapTest {
    public static void main(String[] args) {
        //创建HashMap对象
        HashMap<String,String> map=new HashMap<>();
        //存放键值对
        map.put("id","1");
        map.put("mobile_phone","13212312312");
        map.put("pwd","12312312");

        System.out.println(map);

        //判断是否有mobile_phone键
        if (map.containsKey("mobile_phone")){
            System.out.println(map.get("mobile_phone"));
        }else {
            System.out.println("map中没有该键");
        }

        //替换Map中pwd对应的值，替换为88888888。
        map.replace("pwd","88888888");
        System.out.println(map.get("pwd"));
    }
}
