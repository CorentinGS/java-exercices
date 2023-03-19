package com.corentings.ex3;

public class Main {


    public static double area(double radius) {
        return Math.PI * Math.pow(radius, 2);
    }

    public static double genericArea(Number radius) {
        return Math.PI * Math.pow((Double) radius, 2);
    }
}
