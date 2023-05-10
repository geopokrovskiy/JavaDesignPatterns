package org.example.creational.abstractFactory.model.program;

import org.example.creational.abstractFactory.model.Captain;
import org.example.creational.abstractFactory.model.FirstOfficer;
import org.example.creational.abstractFactory.model.FlightAttendant;
import org.example.creational.abstractFactory.model.airbus.AirbusCrewFactory;
import org.example.creational.abstractFactory.model.boeing.BoeingCrewFactory;

public class Program {

    public static void main(String[] args) {
        AirbusCrewFactory airbusCrewFactory = new AirbusCrewFactory();
        Captain airbusCaptain = airbusCrewFactory.newCaptain();
        FirstOfficer airbusFirstOfficer = airbusCrewFactory.newFirstOfficer();
        FlightAttendant airbusFlightAttendant = airbusCrewFactory.newFlightAttendant();
        airbusCaptain.drivePlane();
        airbusFirstOfficer.watchScreens();
        airbusFlightAttendant.takeCareOfPassengers();

        BoeingCrewFactory boeingCrewFactory = new BoeingCrewFactory();
        Captain boeingCaptain = boeingCrewFactory.newCaptain();
        FirstOfficer boeingFirstofficer = boeingCrewFactory.newFirstOfficer();
        FlightAttendant boeingFlightAttendant = boeingCrewFactory.newFlightAttendant();
        boeingCaptain.drivePlane();
        boeingFirstofficer.watchScreens();
        boeingFlightAttendant.takeCareOfPassengers();

    }
}
