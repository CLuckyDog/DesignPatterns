package com.rh.BuilderPattern;

/**
 * Created by Administrator on 2019/8/11.
 */
public class Pepsi extends ColdDrink{
    @Override
    public String name() {
        return "Pepsi";
    }

    @Override
    public float price() {
        return 35.0f;
    }
}
