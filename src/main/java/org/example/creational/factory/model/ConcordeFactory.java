package org.example.creational.factory.model;

public class ConcordeFactory implements PlaneFactory{
    @Override
    public Plane createPlane() {
        return new Concorde();
    }
}
