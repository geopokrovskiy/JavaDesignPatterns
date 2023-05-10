package org.example.structural.bridge.model;

public abstract class Dish {
    protected Cook cook;
    protected Dish(Cook cook) {
        this.cook = cook;
    }
    public abstract void makeDish();
}
