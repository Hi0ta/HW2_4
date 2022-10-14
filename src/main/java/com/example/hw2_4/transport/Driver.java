package com.example.hw2_4.transport;

public class Driver<A extends Transport> {

    private final String fullName;
    private String tupeLicense;
    private int experience;

    public Driver(String fullName, String tupeLicense, int experience) {
        if (fullName == null || fullName.isBlank()) {
            this.fullName = "ФИО должно быть заполнено!!";
        } else {
            this.fullName = fullName;
        }
        this.setTupeLicense(tupeLicense);
        this.setExperience(experience);
    }

    public String getFullName() {
        return fullName;
    }

    public String getTupeLicense() {
        return tupeLicense;
    }

    public int getExperience() {
        return experience;
    }

    public void setTupeLicense(String tupeLicense) {
        if (tupeLicense.length() != 1) {
                throw new IllegalArgumentException("категория прав введена неверно");
            //System.out.println("категория прав введена неверно");
        } else if (tupeLicense.equals("B") || tupeLicense.equals("C") || tupeLicense.equals("D")) {
            this.tupeLicense = tupeLicense;
        } else {
                throw new IllegalArgumentException("категория прав введена неверно");
            // System.out.println("категория прав введена неверно");
        }
    }

    public void setExperience(int experience) {
        if (experience <= 0) {
            this.experience = 0;
        } else {
            this.experience = experience;
        }
    }

    public void drive(A transport) {
        System.out.println(toString() + " управляет автомобилем: " + transport.getBrand() + " " + transport.getModel() + " и будет участвовать в заезде");
    }

    void startMoving(A transport) {
        System.out.println("водитель: " + fullName + " на " + transport.getBrand() + " " + transport.getModel() + " - начал движение");
    }

    void stop(A transport) {
        System.out.println("водитель: " + fullName + " на " + transport.getBrand() + " " + transport.getModel() + " - остановился");
    }

    void refillAvto(A transport) {
        System.out.println("водитель: " + fullName + " заправил " + transport.getBrand() + " " + transport.getModel());
    }

    @Override
    public String toString() {
        return "водитель ФИО: " + fullName + ", категория прав: " + getTupeLicense() + ", стаж вождения " + experience + " лет";
    }

}

