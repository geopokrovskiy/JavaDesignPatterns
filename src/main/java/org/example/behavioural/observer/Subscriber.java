package org.example.behavioural.observer;

import java.util.List;

public class Subscriber implements Observer{

    String name;

    public Subscriber(String name) {
        this.name = name;
    }

    @Override
    public void handleEvent(List<String> movies) {
        System.out.println("Hello, " + name + "\n we have new movies!:\n " +
                movies + "!\n");
    }
}
