package org.example.behavioural.visitor.model;

import static java.lang.Math.sqrt;

public class Euclide implements Visitor{
    @Override
    public void visit(Point2d p) {
        p.setMetric(sqrt(p.getX() * p.getX()
                + p.getY() * p.getY()));
    }

    @Override
    public void visit(Point3d p) {
        p.setMetric(sqrt(p.getX() * p.getX() +
                p.getY() * p.getY() +
                p.getZ() * p.getZ()));
    }
}
