package org.example.creational.abstractFactory.model.airbus;

import org.example.creational.abstractFactory.model.Captain;

public class AirbusCaptain implements Captain {
    @Override
    public void drivePlane() {
        System.out.println("Holding a stick");
    }
}
