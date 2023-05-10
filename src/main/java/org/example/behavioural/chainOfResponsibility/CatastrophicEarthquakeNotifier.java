package org.example.behavioural.chainOfResponsibility;

public class CatastrophicEarthquakeNotifier extends Seismologist{
    public CatastrophicEarthquakeNotifier(int earthquakeMagnitude) {
        super(earthquakeMagnitude);
    }

    @Override
    public void writeMessage(String message) {
        System.out.println("Citizens must immediately go to basements with food stocks for 4-5 days!" + message);
    }
}
