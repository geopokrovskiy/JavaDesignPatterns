package org.example.creational.builder.model;

public class Plane {
    private int passengerCount;
    private String name;
    private int price;

    public void setPassengerCount(int passengerCount) {
        this.passengerCount = passengerCount;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return "Plane{" +
                "passengerCount=" + passengerCount +
                ", name='" + name + '\'' +
                ", price=" + price +
                '}';
    }
}
