package com.rh.PrototypePattern;

/**
 * Created by Administrator on 2019/8/13.
 */
public class Circle extends Shape{
    public Circle(){
        type = "Circle";
    }

    @Override
    public void draw() {
        System.out.println("Inside Circle::draw() method.");
    }
}
