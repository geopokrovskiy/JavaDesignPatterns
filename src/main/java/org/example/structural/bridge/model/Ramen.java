package org.example.structural.bridge.model;

public class Ramen extends Dish{
    public Ramen(Cook cook) {
        super(cook);
    }

    @Override
    public void makeDish() {
        cook.cook();
        System.out.println("Cooks ramen.");
    }
}
