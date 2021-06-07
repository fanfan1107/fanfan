package com.lemon.arry;

/**
 * @Project: java_base
 * @Author: Le0Wu
 * @Create: 2021-03-26 17:04
 * @Desc： 数组
 **/
public class ArrayDemo {
    public static void main(String[] args) {
        //数组:数据结构,存储数据的容器
        //一般数据类型相同,具有相同意义的数据放在数组中
        //静态初始化创建一维数组--数据类型[] 数组名={}
        int[] a = {1, 2, 3};
        //取值或赋值---数组名[索引]
        a[0]=2;//重新赋值
//        System.out.println(a[0]);
//        System.out.println(a.length);//求数组的长度
        //动态初始化创建一维数组--数据类型[] 数组名=new 数据类型[数组长度]
        //动态初始化数据元素默认值:整数为0；小数0.0;Boolean false;char 空字符
        //引用数据类型默认为 null
        int[] a2 = new int[5];
        a2[0]=1;
        a2[1]=3;

        //二维数组,静态初始化  数据类型[][] 数组名={{,,,},{,,,},{,,,}}
        String[][] arr = {{"郭敬明", "和和"}, {"ddd", "ss"}};

        //二维数组,动态初始化   数据类型[][] 数组名 = new 数据类型[二位数组的长度][];,
        //没有给第二个长度创建方式比较少用，因为需要自己再创建一维数组，比较麻烦
        //二维数组,动态初始化   数据类型[][] 数组名 = new 数据类型[外面数组的长度][里面数组的长度]
        String[][] arr1=new String[3][];
        //这种后面没有指定长度，输出的是null，必须要再new一个一维数组
        System.out.println(arr1[0]);
        arr1[0]=new String[2];//设置里面数组的长度
        System.out.println(arr1[0]);
        arr1[0][0]="xx";
        arr1[0][1]="yy";
        System.out.println(arr1[0][0]);
        String[][] arr2=new String[3][2];
        arr1[0][0]="xx";
        arr1[0][1]="yy";












    }
}
