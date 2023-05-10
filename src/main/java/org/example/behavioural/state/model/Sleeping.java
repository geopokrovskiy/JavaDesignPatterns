package org.example.behavioural.state.model;

public class Sleeping implements Activity {
    @Override
    public void doActivity() {
        System.out.println("Sleeping...");
    }
}
