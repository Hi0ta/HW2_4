package com.example.hw2_4.transport;

public class DriverD extends Driver<Bus>{
    private static final String TUPE_LICENSE = "D";

    public DriverD(String fullName, boolean license, int experience, Bus bus) {
        super(fullName, license, experience, bus);
    }

    @Override
    public String toString() {
        return super.toString() + ", категории: " + TUPE_LICENSE;
    }
}
