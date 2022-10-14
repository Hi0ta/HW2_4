package com.example.hw2_4.transport;

public final class Car extends Transport implements Competing{
public enum BodyType {
    SEDAN("седан"), HATCHBACK("хэтчбэк"), COMPARTMENT("купэ"),
    STATION_WAGON("универсал"), OFF_ROAD_VEHICLE("внедорожник"), CROSSOVER("кроссовер"),
    PICKUP_TRUCK("пикап"), VAN("фургон"), MINIVAN("минивэн");
    private String name;
    BodyType(String name) {this.name = name;}
    public String getName() {return name;}
//    public void setName(String name) {this.name = name;}
}
    BodyType bodyType;
    public Car(String brand, String model, double engineVolume, BodyType bodyType) {
        super(brand, model, engineVolume);
        this.bodyType = bodyType;
    }
    public BodyType getBodyType() {return bodyType;}
  //  public void setBodyType(BodyType bodyType) {this.bodyType = bodyType;}
    public void infoCar() {
        System.out.println(toString());
        startMoving();finishMovement();
        getPitStop();getBestTime();getMaxSpeed();
    }

    @Override
    public void printBodyType() {
        if (bodyType == null){
            System.out.println(getBrand() + " " + getModel() + " данных по авто недостаточно");
        }else {
            System.out.println(getBrand() + " " + getModel() + " тип кузова: " + bodyType.getName());
        }
    }
    @Override
    public String toString() {return "автомобиль: " + super.toString() + ", тип кузова: " + getBodyType();}

    @Override
    public void passDiagnostic() {
       if (getRandom(0.0, 1.0) == 0.0) {
           System.out.println("автомобилем: " + getBrand() + " " + getModel() + " диагностика пройдена");
           }else {
           try {
               throw new RuntimeException("автомобилем: " + getBrand() + " " + getModel() + " диагностика не пройдена");
           } catch (RuntimeException e){
               System.out.println(e.getMessage());
           }
       }
    }

    @Override
    public void startMoving() {
        System.out.println("Начало движения автомобиля: ");
    }
    @Override
    public void finishMovement() {
        System.out.println("Окончание движения автомобиля: ");
    }
    @Override
    public void getPitStop() {
        System.out.println("здесь был пит-стоп автомобиля: ");
    }
    @Override
    public void getMaxSpeed() {
        System.out.println("максимальная скорость автомобиля: ");
    }
    @Override
    public void getBestTime() {
        System.out.println("лучшее время автомобиля: ");
    }
    public static double getRandom(double min, double max){
        double x = (int)(Math.random()*((max-min)+1))+min;
        return x;
    }

}
