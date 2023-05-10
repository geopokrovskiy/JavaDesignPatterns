package org.example.creational.factory.model;

import org.example.creational.factory.model.Plane;

public class Concorde implements Plane {
    @Override
    public void takeOff() {
        System.out.println("Concorde stays in a hangar");
    }

    @Override
    public void fly() {
        System.out.println("Concorde stays in a hangar");
    }

    @Override
    public void land() {
        System.out.println("Concorde stays in a hangar");
    }
}
