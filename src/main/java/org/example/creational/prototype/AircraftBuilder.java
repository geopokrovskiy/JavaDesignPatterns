package org.example.creational.prototype;

public class AircraftBuilder {
    public static void main(String[] args) {
        //original aircraft
        Aircraft aircraft = new Aircraft("Airbus", 270, 7);
        System.out.println("Original: " + aircraft);

        // clone the aircraft
        AircraftFactory aircraftFactory = new AircraftFactory(aircraft);
        Aircraft aircraft1 = aircraftFactory.cloneAircraft();
        Aircraft aircraft2 = aircraftFactory.cloneAircraft();
        System.out.println("Clone1: " + aircraft1);
        System.out.println("Clone2: " + aircraft2);
    }
}
