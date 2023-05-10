package org.example.creational.builder.model;

public class BoeingBuilder extends PlaneBuilder{

    @Override
    void buildPassengerCount() {
        plane.setPassengerCount(500);
    }

    @Override
    void buildPrice() {
        plane.setPrice(1_000_000);
    }

    @Override
    void buildName() {
        plane.setName("Boeing");
    }
}
