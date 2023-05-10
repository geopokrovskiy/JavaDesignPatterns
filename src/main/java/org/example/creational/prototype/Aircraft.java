package org.example.creational.prototype;

public class Aircraft implements Copyable{
    private String name;
    private int capacity;
    private int crewCount;

    public Aircraft(String name, int capacity, int crewCount) {
        this.name = name;
        this.capacity = capacity;
        this.crewCount = crewCount;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getCapacity() {
        return capacity;
    }

    public void setCapacity(int capacity) {
        this.capacity = capacity;
    }

    public int getCrewCount() {
        return crewCount;
    }

    public void setCrewCount(int crewCount) {
        this.crewCount = crewCount;
    }

    @Override
    public String toString() {
        return "Aircraft{" +
                "name='" + name + '\'' +
                ", capacity=" + capacity +
                ", crewCount=" + crewCount +
                '}';
    }

    @Override
    public Object copy() {
        return new Aircraft(name, capacity, crewCount);
    }
}
