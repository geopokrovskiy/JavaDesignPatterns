package org.example.structural.bridge.program;

import org.example.structural.bridge.model.*;

public class Kitchen {
    public static void main(String[] args) {
        Dish[] dishes = new Dish[] {
                new Lasagna(new ItalianCook()),
                new Ramen(new JapaneseCook())
        };

        for(Dish dish : dishes){
            dish.makeDish();
        }
    }
}
