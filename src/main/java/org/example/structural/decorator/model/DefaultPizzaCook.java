package org.example.structural.decorator.model;

public class DefaultPizzaCook implements PizzaCook {
    public String makeBase() {
        return "Prepares the pastry. ";
    }
    public String addTomatoSauce() {
        return "Adds tomato sauce. ";
    }
    public String addCheese() {
        return "Adds cheese. ";
    }
    @Override
    public String makePizza() {
        return makeBase() + addTomatoSauce() + addCheese();
    }
}
