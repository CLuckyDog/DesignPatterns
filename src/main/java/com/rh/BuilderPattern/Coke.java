package com.rh.BuilderPattern;

/**
 * Created by Administrator on 2019/8/11.
 */
public class Coke extends ColdDrink{
    @Override
    public String name() {
        return "Coke";
    }

    @Override
    public float price() {
        return 30.0f;
    }
}
