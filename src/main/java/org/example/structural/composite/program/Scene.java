package org.example.structural.composite.program;

import org.example.structural.composite.model.*;

public class Scene {
    public static void main(String[] args) {
        StringBand band = new StringBand();
        band.addMusician(new ViolinPlayer());
        band.addMusician(new ViolinPlayer());
        band.addMusician(new ViolinPlayer());
        band.addMusician(new CelloPlayer());
        band.addMusician(new CelloPlayer());
        band.addMusician(new DoubleBassPlayer());
        band.addMusician(new Conductor());
        band.play();
    }


}
