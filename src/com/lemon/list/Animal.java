package com.lemon.list;

/**
 * @Project: java_base
 * @Author: fanfan
 * @Create: 2021-04-08 11:33
 * @Desc：
 **/
public class Animal {
    private String color;
    private int legs;
    private String name;

    public Animal() {
    }

    public Animal(String color, int legs, String name) {
        this.color = color;
        this.legs = legs;
        this.name = name;
    }

    public String getColor() {
        return color;
    }

    public int getLegs() {
        return legs;
    }

    public String getName() {
        return name;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public void setLegs(int legs) {
        this.legs = legs;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "{" +
                "color='" + color + '\'' +
                ", legs=" + legs +
                ", name='" + name + '\'' +
                '}';
    }
}
