package org.example.creational.abstractFactory.model;

public interface AircraftCrewFactory {
    Captain newCaptain();
    FirstOfficer newFirstOfficer();
    FlightAttendant newFlightAttendant();
}
