package org.example.creational.factory.model;

public class BoeingFactory implements PlaneFactory{
    @Override
    public Plane createPlane() {
        return new Boeing();
    }
}
