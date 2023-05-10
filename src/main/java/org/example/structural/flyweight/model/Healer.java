package org.example.structural.flyweight.model;

public class Healer implements Player{
    @Override
    public void doJob() {
        System.out.println("Heals the tank...");
    }
}
