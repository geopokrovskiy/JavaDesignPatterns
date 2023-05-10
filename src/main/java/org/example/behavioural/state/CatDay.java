package org.example.behavioural.state;

import org.example.behavioural.state.model.Activity;
import org.example.behavioural.state.model.Cat;
import org.example.behavioural.state.model.Sleeping;

public class CatDay {
    public static void main(String[] args) {
        Cat cat = new Cat();
        Activity activity = new Sleeping();
        cat.setActivity(activity);

        for(int i = 0; i < 24; i++){
            cat.executeActivity();
            cat.changeActivity();
        }
    }
}
