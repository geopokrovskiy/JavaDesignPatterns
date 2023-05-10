package org.example.behavioural.strategy.model;

public class Cat {
    Activity activity;

    public void setActivity(Activity activity) {
        this.activity = activity;
    }

    public void execute(){
        this.activity.doActivity();
    }
}
