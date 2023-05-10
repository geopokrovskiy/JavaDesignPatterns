package org.example.structural.façade.model;

public class Conductor {
    boolean conducting;

    public boolean isConducting() {
        return conducting;
    }

    public void startConcert(){
        System.out.println("Conductor is conducting the orchestra...");
        this.conducting = true;
    }

    public void finishConcert(){
        System.out.println("Conductor is finishing his job...");
        this.conducting = false;
    }
}
