package com.example.hw2_4.transport;

public final class Bus extends Transport implements Competing {
    public Bus(String brand, String model, double engineVolume) {
        super(brand, model, engineVolume);
    }
    public void infoBus() {
        System.out.println(toString());
        startMoving();finishMovement();
        getPitStop();getBestTime();getMaxSpeed();
    }
    @Override
    public String toString() {return "автобус: " + super.toString();}
    @Override
    public void startMoving() {System.out.println("Начало движения: ");}
    @Override
    public void finishMovement() {System.out.println("Окончание движения: ");}
    @Override
    public void getPitStop() {System.out.println("здесь был пит-стоп: ");}
    @Override
    public void getMaxSpeed() {System.out.println("максимальная скорость: ");}
    @Override
    public void getBestTime() {System.out.println("лучшее время: ");}
    @Override
    public boolean equals(Object o) {return super.equals(o);}
    @Override
    public int hashCode() {return super.hashCode();}
}
