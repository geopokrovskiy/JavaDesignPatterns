package org.example.behavioural.state.model;

import org.example.behavioural.iterator.Manager;

public class Cat {
    Activity activity;

    public void setActivity(Activity activity) {
        this.activity = activity;
    }

    public void changeActivity() {
        if (this.activity instanceof Eating) {
            this.setActivity(new Sleeping());
        } else if (this.activity instanceof Sleeping) {
            this.setActivity(new Meowing());
        } else if (this.activity instanceof Meowing) {
            this.setActivity(new Eating());
        }
    }

    public void executeActivity(){
        this.activity.doActivity();
    }
}
