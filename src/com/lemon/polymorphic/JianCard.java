package com.lemon.polymorphic;

import com.sun.org.apache.xerces.internal.util.SynchronizedSymbolTable;

/**
 * @Project: java_base
 * @Author: fanfan
 * @Create: 2021-04-03 14:41
 * @Desc：
 **/
public class JianCard extends Card{
    public void getMoney(){
        System.out.println("建设银行取钱");
    }
    public void a(){
        System.out.println("aaa");
    }
}
