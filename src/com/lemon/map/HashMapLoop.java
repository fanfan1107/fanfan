package com.lemon.map;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

/**
 * @Project: java_base
 * @Author: fanfan
 * @Create: 2021-04-10 15:14
 * @Desc：
 **/
public class HashMapLoop {
    public static void main(String[] args) {
        HashMap<String,Integer> map=new HashMap<>();
        //添加值
        map.put("name",12);
        map.put("age",10);
        map.put("id",100);
        System.out.println(map);

        //遍历
        //1.keySet(),返回所有的键
        //接口类型（父类）=接口的实现类（子类）
        //多态
        //ctrl+h,选中类，快捷键可以查看实现的子类
        Set<String> keyset=map.keySet();
        for (String key:keyset){
           // System.out.println(key+"="+map.get(key));
        }


        //2.entrySet  entry对象集合
        Set<Map.Entry<String, Integer>> entrySet = map.entrySet();
        for (Map.Entry<String, Integer> entry:entrySet){
//            System.out.print(entry);
            System.out.println(entry.getKey()+"="+entry.getValue());
        }
        //表达式
        map.forEach((k,v)->{
          //  System.out.println(k+"="+v);
        });

    }
}

