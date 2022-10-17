package com.example.hw2_4.transport;

public class DriverB extends Driver<Car> {
    private static final String TUPE_LICENSE = "B";

    public DriverB(String fullName,  boolean license, int experience, Car car) {
        super(fullName, license, experience, car);
    }

    @Override
    public String toString() {
        return super.toString() + ", категории: " + TUPE_LICENSE;
    }
}
