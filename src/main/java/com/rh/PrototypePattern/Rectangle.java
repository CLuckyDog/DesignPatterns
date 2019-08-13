package com.rh.PrototypePattern;

/**
 * Created by Administrator on 2019/8/13.
 */
public class Rectangle extends Shape{

    public Rectangle(){
        type = "Rectangle";
    }

    @Override
    void draw() {
        System.out.println("Inside Rectangle::draw() method.");
    }
}
