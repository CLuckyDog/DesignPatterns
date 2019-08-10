package com.rh.AbstractFactoryPattern;

/**
 * Created by Administrator on 2019/8/10.
 */
public class Red implements Color{
    @Override
    public void fill() {
        System.out.println("Inside Red::fill() method.");
    }
}
