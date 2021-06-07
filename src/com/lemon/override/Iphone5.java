package com.lemon.override;

/**
 * @Project: java_base
 * @Author: fanfan
 * @Create: 2021-04-03 13:27
 * @Desc：
 **/
public class Iphone5 extends Iphone4{
    public Iphone5(){
        super();//初始化子类对象之前先初始化父类，因为构造方法里面默认调用父类空参构造
//        this();//调用本类其他构造方法
    }
    //重写的方法：和父类一摸一样
    @Override //注解 检测当前方法是否是重写方法
    public void siri(){
        //调用方法的时候优先在本类中找，找不到去找父类，再找不到去找爷爷类
        super.siri();//调用父类的方法，在保留父类的方法下再去升级 super默认找父类
        System.out.println("嘿 siri");
    }

}
