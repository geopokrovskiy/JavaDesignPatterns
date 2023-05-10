package org.example.behavioural.chainOfResponsibility;

public class HardEarthquakeNotifier extends Seismologist{
    public HardEarthquakeNotifier(int earthquakeMagnitude) {
        super(earthquakeMagnitude);
    }

    @Override
    public void writeMessage(String message) {
        System.out.println("A hard earthquake. Citizens must stay at low levels of buildings. Elevator use is strictly prohibited!" + message);
    }
}
