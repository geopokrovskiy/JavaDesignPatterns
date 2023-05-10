package org.example.behavioural.strategy;

import org.example.behavioural.strategy.model.Cat;
import org.example.behavioural.strategy.model.Eating;
import org.example.behavioural.strategy.model.Meowing;
import org.example.behavioural.strategy.model.Sleeping;

public class Main {
    public static void main(String[] args) {
        Cat cat = new Cat();
        cat.setActivity(new Eating());
        cat.execute();

        cat.setActivity(new Sleeping());
        cat.execute();

        cat.setActivity(new Sleeping());
        cat.execute();

        cat.setActivity(new Sleeping());
        cat.execute();

        cat.setActivity(new Meowing());
        cat.execute();

        cat.setActivity(new Meowing());
        cat.execute();

    }
}
