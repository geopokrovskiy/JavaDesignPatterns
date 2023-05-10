package org.example.structural.bridge.model;

public class JapaneseCook implements Cook{
    @Override
    public void cook() {
        System.out.println("Cooks a japanese dish...");
    }
}
