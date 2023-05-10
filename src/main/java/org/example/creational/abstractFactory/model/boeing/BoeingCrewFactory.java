package org.example.creational.abstractFactory.model.boeing;

import org.example.creational.abstractFactory.model.AircraftCrewFactory;
import org.example.creational.abstractFactory.model.Captain;
import org.example.creational.abstractFactory.model.FirstOfficer;
import org.example.creational.abstractFactory.model.FlightAttendant;

public class BoeingCrewFactory implements AircraftCrewFactory {
    @Override
    public Captain newCaptain() {
        return new BoeingCaptain();
    }

    @Override
    public FirstOfficer newFirstOfficer() {
        return new BoeingFirstOfficer();
    }

    @Override
    public FlightAttendant newFlightAttendant() {
        return new BoeingFlightAttendant();
    }
}
