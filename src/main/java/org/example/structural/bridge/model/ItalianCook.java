package org.example.structural.bridge.model;

public class ItalianCook implements Cook{
    @Override
    public void cook() {
        System.out.println("Cooks an italian dish...");
    }
}
