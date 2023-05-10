package org.example.creational.abstractFactory.model.airbus;

import org.example.creational.abstractFactory.model.FirstOfficer;

public class AirbusFirstOfficer implements FirstOfficer {
    @Override
    public void watchScreens() {
        System.out.println("watches horizons");
    }
}
