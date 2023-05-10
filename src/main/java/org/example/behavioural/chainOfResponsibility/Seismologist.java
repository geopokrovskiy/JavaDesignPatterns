package org.example.behavioural.chainOfResponsibility;

public abstract class Seismologist {
    private int earthquakeMagnitude;
    private Seismologist nextSeismologist;

    public Seismologist(int earthquakeMagnitude) {
        this.earthquakeMagnitude = earthquakeMagnitude;
    }

    public void setNextSeismologist(Seismologist nextSeismologist) {
        this.nextSeismologist = nextSeismologist;
    }

    public void notifyBoss(String message, int magnitude){
        if(magnitude >= earthquakeMagnitude){
            writeMessage(message);
        }
        if(nextSeismologist != null){
            nextSeismologist.notifyBoss(message, magnitude);
        }
    }

    public abstract void writeMessage(String message);
}
