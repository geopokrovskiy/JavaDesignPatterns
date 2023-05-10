package org.example.behavioural.visitor.model;

public class Point2d extends Point{
    private double x;
    private double y;
    public Point2d(double x, double y) {
        this.x = x;
        this.y = y;

    }
    public double getX() {
        return x;
    }

    public double getY() {
        return y;
    }

    @Override
    public void accept(Visitor visitor) {
        visitor.visit(this);
    }
}
