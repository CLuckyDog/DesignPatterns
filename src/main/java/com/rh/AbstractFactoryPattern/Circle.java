package com.rh.AbstractFactoryPattern;

/**
 * Created by Administrator on 2019/8/10.
 */
public class Circle implements Shape {
    @Override
    public void draw() {
        System.out.println("Inside Circle::draw() method.");
    }
}
