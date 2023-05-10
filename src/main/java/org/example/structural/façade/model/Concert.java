package org.example.structural.façade.model;

public class Concert {
    Musician musician = new Musician();
    Conductor conductor = new Conductor();
    Music music = new Music();

    public void doConcert(){
        this.conductor.startConcert();
        this.musician.playMusic(conductor);
        this.music.playMusic();
    }
}
