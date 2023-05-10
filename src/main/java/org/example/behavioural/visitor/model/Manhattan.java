package org.example.behavioural.visitor.model;
import static java.lang.Math.abs;
public class Manhattan implements Visitor{
    @Override
    public void visit(Point2d p) {
        p.setMetric(abs(p.getX()) + abs(p.getY()));
    }

    @Override
    public void visit(Point3d p) {
        p.setMetric(abs(p.getX()) + abs(p.getY()) + abs(p.getZ()));
    }
}
