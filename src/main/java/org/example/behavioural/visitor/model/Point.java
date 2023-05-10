package org.example.behavioural.visitor.model;

public abstract class Point {
    private double metric = -1;

    public double getMetric() {
        return metric;
    }

    public void setMetric(double metric) {
        this.metric = metric;
    }
    public abstract void accept(Visitor visitor);
}
