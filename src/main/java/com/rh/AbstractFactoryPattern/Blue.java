package com.rh.AbstractFactoryPattern;

/**
 * Created by Administrator on 2019/8/10.
 */
public class Blue implements Color{
    @Override
    public void fill() {
        System.out.println("Inside Blue::fill() method.");
    }
}
