package com.rh.BuilderPattern;

/**
 * Created by Administrator on 2019/8/11.
 */
public class ChickenBurger extends Burger{
    @Override
    public String name() {
        return "ChickenBurger";
    }

    @Override
    public float price() {
        return 50.5f;
    }
}
