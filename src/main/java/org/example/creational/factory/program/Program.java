package org.example.creational.factory.program;

import org.example.creational.factory.model.*;

public class Program {
    static PlaneFactory planeFactory(String name) {
        if (name.equalsIgnoreCase("airbus")) return new AirbusFactory();
        else if (name.equalsIgnoreCase("boeing")) return new BoeingFactory();
        else if (name.equalsIgnoreCase("concorde")) return new ConcordeFactory();
        else throw new RuntimeException("Unknown plane type!");
    }

    public static void main(String[] args) {
        PlaneFactory airbusFactory = planeFactory("airbus");
        Plane airbus = airbusFactory.createPlane();
        airbus.takeOff();
        airbus.fly();
        airbus.land();

        PlaneFactory boeingFactory = planeFactory("boeing");
        Plane boeing = boeingFactory.createPlane();
        boeing.takeOff();
        boeing.fly();
        boeing.land();

        PlaneFactory concordeFactory = planeFactory("concorde");
        Plane concorde = concordeFactory.createPlane();
        concorde.takeOff();
        concorde.fly();
        concorde.land();
    }
}
