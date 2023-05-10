package org.example.creational.abstractFactory.model.boeing;

import org.example.creational.abstractFactory.model.Captain;

public class BoeingCaptain implements Captain {
    @Override
    public void drivePlane() {
        System.out.println("The captain is holding the steering wheel");
    }
}
