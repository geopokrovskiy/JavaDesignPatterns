package org.example.behavioural.template;

public abstract class Burger {

    public void makeBurger(){
        System.out.println("Putting a bun...");
        System.out.println("Adding a burger...");
        addSpecificIngredients();
        System.out.println("Adding ketchup...");
        System.out.println("Putting a bun...");
    }

    public abstract void addSpecificIngredients();
}
