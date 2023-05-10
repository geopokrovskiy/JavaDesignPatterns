package org.example.structural.decorator.model;

public class VegetarianPizzaCook extends PizzaCookDecorator {
    public VegetarianPizzaCook(PizzaCook pizzaCook) {
        super(pizzaCook);
    }
    public String addVegetables() {
        return "Adds vegetables. ";
    }
    @Override
    public String makePizza() {
        return super.makePizza() + addVegetables();
    }
}
