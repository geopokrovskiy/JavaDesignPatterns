package org.example.creational.builder.model;

public class AirbusBuilder extends PlaneBuilder{
    @Override
    void buildPassengerCount() {
        plane.setPassengerCount(300);
    }

    @Override
    void buildPrice() {
        plane.setPrice(500_000);
    }

    @Override
    void buildName() {
        plane.setName("Airbus");
    }
}
