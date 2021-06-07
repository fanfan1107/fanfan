package com.lemon.string;

import com.sun.org.apache.xerces.internal.util.SynchronizedSymbolTable;

/**
 * @Project: java_base
 * @Author: fanfan
 * @Create: 2021-04-07 15:12
 * @Desc： string
 **/
public class StringDemo {
    public static void main(String[] args) {
        String str1 = "123";
        String str2 = "45";
        //equals():一般用于登录，
        System.out.println(str1.equals(str2));
        //比较忽略大小写，一般用于邮箱，验证码
        System.out.println(str1.equalsIgnoreCase(str2));

        //equals和==的区别
        //==比较基本数据类型比较值，引用数据类型比较地址值
        //equals来自oject类的方法。如果没有重写，用的就是==。如果重写，一般比较内容

        //ctrl+shift+N;查找文件


        //replace 替换 ，字符串创建后都是不可改变的，要用先的字符来接收
        String str3 = "38273dshxb";
        String newstr = str3.replace("38", "11");
        System.out.println(newstr);
        //length,获取字符串长度
        System.out.println(str3.length());
        //contains 是否包含某个字符串
        System.out.println(str3.contains("8"));
        //index of 获取子字符串第一次出现的位置，如果没有返回-1
        System.out.println(str3.indexOf("3"));
        System.out.println(str3.lastIndexOf("3"));
        //isEmpty  判断是否为空,如果直接写null，判断会报空指针异常
//        String str5=null;
        String str5 = "";
        System.out.println(str5.isEmpty());

        //split 切割，用哪个切割，如果有哪个字符就被切走了，返回的是数组,
        String str6 ="1,2,3,4,564";
        String[] arr = str6.split("2");
        for (String s : arr) {
            System.out.println(s);
        }

        //substring 截取
        System.out.println(str6.substring(1));
        System.out.println(str6.substring(1,3));//包头不包尾
    }
}
