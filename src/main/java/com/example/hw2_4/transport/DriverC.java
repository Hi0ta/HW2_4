package com.example.hw2_4.transport;

public class DriverC extends Driver<Truck>{

    private static final String TUPE_LICENSE = "C";

    public DriverC(String fullName, boolean license, int experience, Truck truck) {
        super(fullName, license, experience, truck);
    }

    @Override
    public String toString() {
        return super.toString() + ", категории: " + TUPE_LICENSE;
    }
}
