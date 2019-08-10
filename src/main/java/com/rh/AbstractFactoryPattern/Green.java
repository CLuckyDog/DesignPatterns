package com.rh.AbstractFactoryPattern;

/**
 * Created by Administrator on 2019/8/10.
 */
public class Green implements Color{
    @Override
    public void fill() {
        System.out.println("Inside Green::fill() method.");
    }
}
