package org.example.creational.abstractFactory.model.boeing;

import org.example.creational.abstractFactory.model.FirstOfficer;

public class BoeingFirstOfficer implements FirstOfficer {

    @Override
    public void watchScreens() {
        System.out.println("First officer watches screens");
    }
}
