package com.rh.BuilderPattern;

/**
 * Created by Administrator on 2019/8/11.
 */
public abstract class Burger implements Item{
    @Override
    public Packing packing() {
        return new Wrapper();
    }

    @Override
    public abstract float price();
}
