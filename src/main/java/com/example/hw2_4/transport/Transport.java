package com.example.hw2_4.transport;

import java.util.Objects;

public abstract class Transport{
    private final String brand;
    private final String model;
    private double engineVolume;
   // private final int productionYear;
  //  private final String productionCountry;
   // private String bodyColor;
    //private int maxSpeed;
    public Transport(String brand, String model, double engineVolume) {
        if (brand == null || brand.isEmpty() || brand.isBlank()) {
            this.brand = "default";
        } else {
            this.brand = brand;
        }
        if (model == null || model.isEmpty() || model.isBlank()) {
            this.model = "default";
        } else {
            this.model = model;
        }
        this.setEngineVolume(engineVolume);
    }
    public String getBrand() {return brand;}
    public String getModel() {return model;}
    public double getEngineVolume() {return engineVolume;}

    public void setEngineVolume(double engineVolume) {
        if (Double.compare(engineVolume, 0) == 0) {
            this.engineVolume = 1.5;
        } else {
            this.engineVolume = engineVolume;
        }
    }
    public abstract void startMoving ();
    public abstract void finishMovement ();
    @Override
    public String toString() {return brand + " " + model + ", объем двигателя: " + engineVolume + " литра";}
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Transport transport = (Transport) o;
        return Double.compare(transport.engineVolume, engineVolume) == 0 && brand.equals(transport.brand) && model.equals(transport.model);
    }
    @Override
    public int hashCode() {return Objects.hash(brand, model, engineVolume);}
}

