package org.example.creational.builder.model;

public class Director {
    PlaneBuilder builder;

    public void setBuilder(PlaneBuilder builder) {
        this.builder = builder;
    }

    public Plane buildPlane() {
        builder.createPlane();
        builder.buildName();
        builder.buildPrice();
        builder.buildPassengerCount();
        return builder.getPlane();
    }
}
