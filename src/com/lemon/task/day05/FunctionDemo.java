package com.lemon.task.day05;

import javax.activation.MailcapCommandMap;
import java.awt.event.FocusEvent;

/**
 * @Project: java_base
 * @Author: fanfan
 * @Create: 2021-04-01 15:23
 * @Desc：
 **/
public class FunctionDemo {
    public static void main(String[] args) {
        int[] classA={65,40,66,80,90,100,45,59};
        int[] classB={60,40,68,80,95,38,45,59};
        int[] classC={60,30,68,58,93,28,45,59};
        function(classA);
        function(classB);
        function(classC);


    }

    //求班级的及格人数
    public static void  function(int[] a){
        int sum=0;
        for (int i=0;i<a.length;i++){
            //取出每个分数
            int score=a[i];
            if (score>=60){
                sum++;
            }

        }
        System.out.println("及格人数为："+sum);
    }
}
