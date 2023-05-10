package org.example.behavioural.chainOfResponsibility;

public class BaseEarthquakeNotifier extends Seismologist{

    public BaseEarthquakeNotifier(int earthquakeMagnitude) {
        super(earthquakeMagnitude);
    }

    @Override
    public void writeMessage(String message) {
        System.out.println("A basic earthquake. Citizens are invited to stay at home." + message);
    }
}
