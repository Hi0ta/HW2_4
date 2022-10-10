package com.example.hw2_4.transport;

public final class Bus extends Transport implements Competing {
    public enum BodyType {
        EXTRA_SMALL("особо малая", "до 10 мест"), SMALL("малая", "до 25 мест"),
        MEDIUM("средняя", "от 40 до 50 мест"), LARGE("большая", "от 60 до 80 мест"),
        EXTRA_LARGE("особо большая", "от 100 до 120 мест");
        private String name;
        private String capacity;
        BodyType(String name, String capacity) {
            this.name = name;
            this.capacity = capacity;
        }
        public String getName() {return name;}
        public String getCapacity() {return capacity;}
      //  public void setName(String name) {this.name = name;}
       // public void setCapacity(String capacity) {this.capacity = capacity;}
    }
    private BodyType bodyType;
    public Bus(String brand, String model, double engineVolume, BodyType bodyType) {
        super(brand, model, engineVolume);
        this.bodyType = bodyType;
    }

    public void infoBus() {
        System.out.println(toString());
        startMoving();finishMovement();
        getPitStop();getBestTime();getMaxSpeed();
    }

    @Override
    public void printBodyType() {
        if (bodyType == null){
            System.out.println(getBrand() + " " + getModel() + " данных по автобусу недостаточно");
        }else {
            System.out.println(getBrand() + " " + getModel() + " вместимость: " + bodyType.getName() + " (" + bodyType.getCapacity() + ")");
        }
    }
    public BodyType getBodyType() {return bodyType;}
   // public void setBodyType(BodyType bodyType) {this.bodyType = bodyType;}
    @Override
    public String toString() {return "автобус: " + super.toString() + ", вместимость: " + getBodyType();}
    @Override
    public void startMoving() {System.out.println("Начало движения: ");}
    @Override
    public void finishMovement() {System.out.println("Окончание движения: ");}
    @Override
    public void getPitStop() {System.out.println("здесь был пит-стоп автобуса: ");}
    @Override
    public void getMaxSpeed() {System.out.println("максимальная скорость автобуса: ");}
    @Override
    public void getBestTime() {System.out.println("лучшее время автобуса: ");}

}
