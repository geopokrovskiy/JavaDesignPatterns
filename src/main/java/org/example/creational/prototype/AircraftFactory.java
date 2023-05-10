package org.example.creational.prototype;

public class AircraftFactory {
    private Aircraft aircraft;

    public AircraftFactory(Aircraft aircraft) {
        this.aircraft = aircraft;
    }

    public void setAircraft(Aircraft aircraft) {
        this.aircraft = aircraft;
    }
    public Aircraft cloneAircraft(){
        return (Aircraft) aircraft.copy();
    }
}
