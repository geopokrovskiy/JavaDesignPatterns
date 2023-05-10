package org.example.creational.builder.program;

import org.example.creational.builder.model.*;

public class PlaneBuilderRunner {

    public static void main(String[] args) {
        Director boeingDirector = new Director();
        boeingDirector.setBuilder(new BoeingBuilder());

        Plane boeing = boeingDirector.buildPlane();
        System.out.println(boeing);

        Director airbusDirector = new Director();
        airbusDirector.setBuilder(new AirbusBuilder());

        Plane airbus = airbusDirector.buildPlane();
        System.out.println(airbus);
    }
}
