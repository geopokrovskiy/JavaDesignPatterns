package org.example.structural.composite.model;

public class Conductor implements Musician{
    @Override
    public void playMusic() {
        System.out.println("Conducts the ensemble");
    }
}
