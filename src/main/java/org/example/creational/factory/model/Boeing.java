package org.example.creational.factory.model;

import org.example.creational.factory.model.Plane;

public class Boeing implements Plane {
    @Override
    public void takeOff() {
        System.out.println("Boeing takes off");
    }

    @Override
    public void fly() {
        System.out.println("Boeing flies");
    }

    @Override
    public void land() {
        System.out.println("Boeing lands");
    }
}
