package org.example.behavioural.chainOfResponsibility;

public class EarthquakeMonitor {


    public static void main(String[] args) {
        Seismologist baseNotifier = new BaseEarthquakeNotifier(EarthquakeMagnitude.MEDIUM);
        Seismologist hardNotifier = new HardEarthquakeNotifier(EarthquakeMagnitude.HARD);
        Seismologist catastrophicNotifier = new CatastrophicEarthquakeNotifier(EarthquakeMagnitude.CATASTROPHIC);

        baseNotifier.setNextSeismologist(hardNotifier);
        hardNotifier.setNextSeismologist(catastrophicNotifier);

        hardNotifier.notifyBoss("Some shakes in the soil", EarthquakeMagnitude.MEDIUM); // nothing

        hardNotifier.notifyBoss("The buildings are under the threat of destruction!", EarthquakeMagnitude.CATASTROPHIC);
    }

}
