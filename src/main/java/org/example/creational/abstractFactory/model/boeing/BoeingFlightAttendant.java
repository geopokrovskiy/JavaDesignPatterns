package org.example.creational.abstractFactory.model.boeing;

import org.example.creational.abstractFactory.model.FlightAttendant;

public class BoeingFlightAttendant implements FlightAttendant {
    @Override
    public void takeCareOfPassengers() {
        System.out.println("Brings food and drinks");
    }
}
