package com.lemon.polymorphic;

import sun.plugin2.message.GetAppletMessage;

/**
 * @Project: java_base
 * @Author: fanfan
 * @Create: 2021-04-03 14:30
 * @Desc：多态
 **/
public class PolymorphicDemo {
    public static void main(String[] args) {
        //为什么有多态？扩展性
        JianCard card1=new JianCard();
        ZhaoCard card2=new ZhaoCard();
        GongCard card3=new GongCard();

        Card c1=new JianCard();

        //父类的类型接受子类对象，缺点不能调用子类特有的方法
        Card card=new JianCard();
       // card=new ZhaoCard();
        //想要强制调用子类特有的方法，要使用强转
        JianCard jc=(JianCard)card;
        jc.a();
        //重写之后的方法一定会执行

        atmGetMoney(card);
    }
    //多态：用父类的类型接收子类对象,好处：用一个父类变量，接收所有的子类对象
    //多态只能调用父类的方法，如果子类重写了就调用了重写之后的方法
    public static void atmGetMoney(Card card){
        System.out.println("欢迎光临");
        card.getMoney();
        System.out.println("谢谢");


    }
}
