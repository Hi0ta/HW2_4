package com.example.hw2_4.transport;

public final class Trucks extends Transport implements Competing{
    public enum BodyType {
        N1("до 3,5 тонн"), N2("свыше 3,5 до 12 тонн"), N3("свыше 12 тонн");
        private String capacity;
        BodyType(String capacity) {
            this.capacity = capacity;
        }
        public String getCapacity() {return capacity;}
       // public void setCapacity(String capacity) {this.capacity = capacity;}
    }
    private BodyType bodyType;
    public Trucks(String brand, String model, double engineVolume, BodyType bodyType) {
        super(brand, model, engineVolume);
        this.bodyType = bodyType;
    }
    public void infoTrucks() {
        System.out.println(toString());
        startMoving();finishMovement();
        getPitStop();getBestTime();getMaxSpeed();
    }
    public BodyType getBodyType() {return bodyType;}
   // public void setBodyType(BodyType bodyType) {this.bodyType = bodyType;}

    @Override
    public void printBodyType() {
        if (bodyType == null){
            System.out.println(getBrand() + " " + getModel() + " данных по грузовику недостаточно");
        }else {
            System.out.println(getBrand() + " " + getModel() + " вместимость: " + getBodyType() + " (" + bodyType.getCapacity() + ")");
        }
    }
    @Override
    public String toString() {return "грузовик: " + super.toString() + ", вместимость: " + getBodyType();}

    @Override
    public void passDiagnostic() {
        if (getRandom(0.0, 1.0) == 0.0) {
            System.out.println("грузовиком: " + getBrand() + " " + getModel() + " диагностика пройдена");
        }else {
            try {
                throw new RuntimeException("грузовиком: " + getBrand() + " " + getModel() + " диагностика не пройдена");
            } catch (RuntimeException e){
                System.out.println(e.getMessage());
            }
        }
    }

    @Override
    public void startMoving() {System.out.println("Начало движения грузовика: ");}
    @Override
    public void finishMovement() {System.out.println("Окончание движения грузовика: ");}
    @Override
    public void getPitStop() {System.out.println("здесь был пит-стоп грузовика: ");}
    @Override
    public void getMaxSpeed() {System.out.println("максимальная скорость грузовика: ");}
    @Override
    public void getBestTime() {System.out.println("лучшее время грузовика: ");}

    public static double getRandom(double min, double max){
        double x = (int)(Math.random()*((max-min)+1))+min;
        return x;
    }

}
