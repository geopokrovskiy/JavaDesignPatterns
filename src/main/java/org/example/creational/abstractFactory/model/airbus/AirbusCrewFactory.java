package org.example.creational.abstractFactory.model.airbus;

import org.example.creational.abstractFactory.model.AircraftCrewFactory;
import org.example.creational.abstractFactory.model.Captain;
import org.example.creational.abstractFactory.model.FirstOfficer;
import org.example.creational.abstractFactory.model.FlightAttendant;

public class AirbusCrewFactory implements AircraftCrewFactory {
    @Override
    public Captain newCaptain() {
        return new AirbusCaptain();
    }

    @Override
    public FirstOfficer newFirstOfficer() {
        return new AirbusFirstOfficer();
    }

    @Override
    public FlightAttendant newFlightAttendant() {
        return new AirbusFlightAttendant();
    }
}
