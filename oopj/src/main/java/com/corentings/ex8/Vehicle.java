package com.corentings.ex8;

import java.util.Date;

public abstract class Vehicle {
    private final int maxSpeed;
    private final Date manufactureDate;
    private final int currentSpeed;

    protected Vehicle(int currentSpeed, int maxSpeed, Date manufactureDate) {
        this.currentSpeed = currentSpeed;
        this.maxSpeed = maxSpeed;
        this.manufactureDate = manufactureDate;
    }

    public int getCurrentSpeed() {
        return currentSpeed;
    }

    public int getMaxSpeed() {
        return maxSpeed;
    }

    public Date getManufactureDate() {
        return manufactureDate;
    }


}
