package org.example.behavioural.visitor;

import org.example.behavioural.visitor.model.*;

public class Main {
    public static void main(String[] args) {
        Point p1 = new Point2d(3, 4);
        Visitor visitor1 = new Euclide();
        p1.accept(visitor1);
        System.out.println(p1.getMetric());

        Point p2 = new Point3d(3, 4, 5);
        p2.accept(visitor1);
        System.out.println(p2.getMetric());

        Visitor visitor2 = new Manhattan();
        p1.accept(visitor2);
        System.out.println(p1.getMetric());
    }
}
