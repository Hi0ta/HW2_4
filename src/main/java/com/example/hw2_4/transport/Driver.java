package com.example.hw2_4.transport;

public abstract class Driver<A extends Transport> {
    private final String fullName;
    private final boolean license;
    private int experience;
    private Transport transport;

    public Driver(String fullName, boolean license, int experience, Transport transport) {
        if (fullName == null || fullName.isBlank()) {
            this.fullName = "ФИО должно быть заполнено!!";
        } else {
            this.fullName = fullName;
        }
        if (license != true) {
            throw new IllegalArgumentException("без наличия водительских прав транспортным средством управлять нельзя!!");
        } else {
            this.license = license;
        }
        this.setExperience(experience);
        this.transport = transport;
    }
    public String getFullName() {
        return fullName;
    }
    public boolean getLicense() {
        return license;
    }
    public int getExperience() {
        return experience;
    }
    public Transport getTransport() {return transport;}

    public void setExperience(int experience) {
        if (experience <= 0) {
            this.experience = 0;
        } else {
            this.experience = experience;
        }
    }
    public void drive() {
        System.out.println(toString() + " управляет: " + transport.getBrand() + " " + transport.getModel() + " и будет участвовать в заезде");
    }

    void startMoving() {
        System.out.println("водитель: " + fullName + " на " + transport.getBrand() + " " + transport.getModel() + " - начал движение");
    }
    void stop() {
        System.out.println("водитель: " + fullName + " на " + transport.getBrand() + " " + transport.getModel() + " - остановился");
    }
    void refillAvto() {
        System.out.println("водитель: " + fullName + " заправил " + transport.getBrand() + " " + transport.getModel());
    }
    @Override
    public String toString() {
        return "водитель ФИО: " + fullName + ", стаж вождения: " + experience + " лет" + ", наличие прав: " + getLicense();
    }
}

