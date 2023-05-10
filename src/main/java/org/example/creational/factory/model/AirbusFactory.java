package org.example.creational.factory.model;

import org.example.creational.factory.model.Airbus;
import org.example.creational.factory.model.Plane;
import org.example.creational.factory.model.PlaneFactory;

public class AirbusFactory implements PlaneFactory {
    @Override
    public Plane createPlane() {
        return new Airbus();
    }
}
