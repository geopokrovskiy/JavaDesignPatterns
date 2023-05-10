package org.example.behavioural.memento;

public class Reviewer {
    private Save save;

    public Save getSave(){
        return save;
    }
    public void setSave(Save save){
        this.save = save;
    }
}
