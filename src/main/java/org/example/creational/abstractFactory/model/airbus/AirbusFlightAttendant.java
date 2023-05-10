package org.example.creational.abstractFactory.model.airbus;

import org.example.creational.abstractFactory.model.FlightAttendant;

public class AirbusFlightAttendant implements FlightAttendant {
    @Override
    public void takeCareOfPassengers() {
        System.out.println("shows the safety rules");
    }
}
