package com.lemon.inherit;

/**
 * @Project: java_base
 * @Author: fanfan
 * @Create: 2021-04-02 17:51
 * @Desc： 访问修饰符
 **/
public class AccessDemo {
    public int publicFiled;//公共，任何人都能访问
    protected int protectFiled;//受保护，同包下都能访问，不同包子类访问
    int defalutFiled;//默认，同包下都能访问
    private int age;//私有，本类访问

}
