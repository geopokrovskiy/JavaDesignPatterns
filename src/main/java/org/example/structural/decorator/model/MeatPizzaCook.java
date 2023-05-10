package org.example.structural.decorator.model;

public class MeatPizzaCook extends PizzaCookDecorator {
    public MeatPizzaCook(PizzaCook pizzaCook) {
        super(pizzaCook);
    }
    public String addMeat() {
        return "Adds sausages. ";
    }

    @Override
    public String makePizza() {
        return super.makePizza() + addMeat();
    }
}
