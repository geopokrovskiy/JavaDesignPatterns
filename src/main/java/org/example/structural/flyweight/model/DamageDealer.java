package org.example.structural.flyweight.model;

public class DamageDealer implements Player{
    @Override
    public void doJob() {
        System.out.println("Attacks the enemy...");
    }
}
