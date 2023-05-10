package org.example.creational.builder.model;

public abstract class PlaneBuilder {
    Plane plane;

    void createPlane(){
        plane = new Plane();
    }

    abstract void buildPassengerCount();
    abstract void buildPrice();
    abstract void buildName();

    public Plane getPlane(){
        return plane;
    }
}
