package org.example.behavioural.template;

public class Whopper extends Burger{
    @Override
    public void addSpecificIngredients() {
        System.out.println("Adding pickles, cheese and vegetables");
    }
}
