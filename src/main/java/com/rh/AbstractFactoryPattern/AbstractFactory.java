package com.rh.AbstractFactoryPattern;

/**
 * Created by Administrator on 2019/8/10.
 */
public abstract class AbstractFactory {
    public abstract Color getColor(String color);
    public abstract Shape getShape(String shape);
}
