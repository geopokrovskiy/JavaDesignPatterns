package org.example.structural.façade.model;

public class Musician {
    public void playMusic(Conductor conductor){
        if(conductor.isConducting()){
            System.out.println("Music is being played...");
        } else {
            System.out.println("Applause in the hall...");
        }
    }
}
