package org.example.structural.decorator.program;

import org.example.structural.decorator.model.*;

public class Kitchen {
    public static void main(String[] args) {

        //preparing a default pizza
        PizzaCook defaultPizzaCook = new DefaultPizzaCook();
        System.out.println(defaultPizzaCook.makePizza());

        //preparing a vegetarian pizza
        PizzaCook vegPizzaCook = new VegetarianPizzaCook(new DefaultPizzaCook());
        System.out.println(vegPizzaCook.makePizza());

        //preparing a meat pizza
        PizzaCook meatPizzaCook = new MeatPizzaCook(new DefaultPizzaCook());
        System.out.println(meatPizzaCook.makePizza());

        //preparing a royalPizza
        PizzaCook royalPizzaCook = new RoyalPizzaCook(new MeatPizzaCook(new VegetarianPizzaCook(new DefaultPizzaCook())));
        System.out.println(royalPizzaCook.makePizza());
    }
}
