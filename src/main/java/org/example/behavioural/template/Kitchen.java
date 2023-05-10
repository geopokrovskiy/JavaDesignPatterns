package org.example.behavioural.template;

public class Kitchen {


    public static void main(String[] args) {
        Burger bigTasty = new BigTasty();
        Burger whopper = new Whopper();

        bigTasty.makeBurger();
        System.out.println("\n=========================\n");
        whopper.makeBurger();
    }
}
