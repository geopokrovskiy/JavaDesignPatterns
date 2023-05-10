package org.example.structural.bridge.model;

public class Lasagna extends Dish{
    public Lasagna(Cook cook) {
        super(cook);
    }
    @Override
    public void makeDish() {
        cook.cook();
        System.out.println("Cooks a lasagna.");
    }
}
