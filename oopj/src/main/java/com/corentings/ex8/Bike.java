package com.corentings.ex8;

public class Bike extends Vehicle {
    private final int numberOfGears;

    public Bike(int currentSpeed, int maxSpeed, int numberOfGears) {
        super(currentSpeed, maxSpeed, null);
        this.numberOfGears = numberOfGears;
    }

    public int getNumberOfGears() {
        return numberOfGears;
    }
}
