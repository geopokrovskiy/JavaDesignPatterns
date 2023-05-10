package org.example.behavioural.strategy.model;

public class Sleeping implements Activity{
    @Override
    public void doActivity() {
        System.out.println("Sleeping...");
    }
}
