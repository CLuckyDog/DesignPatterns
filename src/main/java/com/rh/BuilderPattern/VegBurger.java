package com.rh.BuilderPattern;

/**
 * Created by Administrator on 2019/8/11.
 */
public class VegBurger extends Burger{
    @Override
    public String name() {
        return "Veg Burger";
    }

    @Override
    public float price() {
        return 25.0f;
    }
}
