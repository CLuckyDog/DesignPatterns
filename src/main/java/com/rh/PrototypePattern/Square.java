package com.rh.PrototypePattern;

/**
 * Created by Administrator on 2019/8/13.
 */
public class Square extends Shape{
    public Square(){
        type = "Square";
    }

    @Override
    public void draw() {
        System.out.println("Inside Square::draw() method.");
    }
}
