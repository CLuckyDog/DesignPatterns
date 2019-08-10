package com.rh.FactoryPattern;

/**
 * Created by Administrator on 2019/8/10.
 */
public class Square implements Shape{
    @Override
    public void draw() {
        System.out.println("Inside Square::draw() method.");
    }
}
