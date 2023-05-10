package org.example.creational.factory.model;

public class Airbus implements Plane {
    @Override
    public void takeOff() {
        System.out.println("Airbus takes off");
    }

    @Override
    public void fly() {
        System.out.println("Airbus flies");
    }

    @Override
    public void land() {
        System.out.println("Airbus lands");
    }
}
