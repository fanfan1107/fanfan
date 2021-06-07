package com.lemon.task.day07;

import javax.sound.midi.Soundbank;
import java.sql.SQLOutput;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

/**
 * @Project: java_base
 * @Author: fanfan
 * @Create: 2021-04-19 21:08
 * @Desc：
 **/
public class ListDuplicateTest {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        list.add("c");
        list.add("d");
        list.add("c");
        list.add("g");
        System.out.println(list);
        Set<String> set=new HashSet<>();

        for (String ele : list) {
            set.add(ele);
        }
        System.out.println("去重过后的结果为："+set);
    }
}
