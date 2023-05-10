package org.example.structural.decorator.model;

public class RoyalPizzaCook extends PizzaCookDecorator {
    public RoyalPizzaCook(PizzaCook pizzaCook) {
        super(pizzaCook);
    }
    public String addOliveOil(){
        return "Adds olive oil. ";
    }
    @Override
    public String makePizza() {
        return super.makePizza() + addOliveOil();
    }
}
