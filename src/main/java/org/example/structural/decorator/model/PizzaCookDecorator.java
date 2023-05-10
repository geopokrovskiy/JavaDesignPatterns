package org.example.structural.decorator.model;

public class PizzaCookDecorator implements PizzaCook {
    PizzaCook pizzaCook;
    public PizzaCookDecorator(PizzaCook pizzaCook) {
        this.pizzaCook = pizzaCook;
    }
    @Override
    public String makePizza() {
        return pizzaCook.makePizza();
    }
}
