package com.corentings.ex8;

public class Car extends Vehicle {
    private final int numberOfDoors;
    private final String motorType;

    public Car(int currentSpeed, int maxSpeed, int numberOfDoors, String motorType) {
        super(currentSpeed, maxSpeed, null);
        this.numberOfDoors = numberOfDoors;
        this.motorType = motorType;
    }

    public int getNumberOfDoors() {
        return numberOfDoors;
    }

    public String getMotorType() {
        return motorType;
    }
}

