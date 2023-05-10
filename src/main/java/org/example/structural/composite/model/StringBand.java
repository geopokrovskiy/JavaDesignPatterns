package org.example.structural.composite.model;

import java.util.ArrayList;
import java.util.List;

public class StringBand {
    private List<Musician> musicianList = new ArrayList<>();

    public void addMusician(Musician musician){
        this.musicianList.add(musician);
    }

    public void removeMusician(Musician musician){
        this.musicianList.remove(musician);
    }

    public void play(){
        for(Musician musician : this.musicianList){
            musician.playMusic();
        }
    }
}
