package com.example.hw2_4.transport;

public class Driver<A extends Transport> {

    private final String fullName;
    private String tupeLicense;
    private int experience;

    public Driver(String fullName, String tupeLicense, int experience) {
        if (fullName == null || fullName.isEmpty() || fullName.isBlank()) {
            this.fullName = "ФИО должно быть заполнено!!";
        } else {
            this.fullName = fullName;
        }
        this.setTupeLicense(tupeLicense);
        this.setExperience(experience);
    }

    public String getFullName() {return fullName;}
    public String getTupeLicense() {return tupeLicense;}
    public int getExperience() {return experience;}

    public void setTupeLicense(String tupeLicense) {
        if (tupeLicense.length() != 1){
            System.out.println("категория прав введена неверно");
        }else if (tupeLicense == "B" || tupeLicense == "C" || tupeLicense == "D") {
            this.tupeLicense = tupeLicense;
        } else {
            System.out.println("категория прав введена неверно");
        }
    }
    public void setExperience(int experience) {
        if (experience <= 0) {
            this.experience = 0;
        } else {
            this.experience = experience;
        }
    }
    public void drive(A transport){
        System.out.println(toString() + " управляет автомобилем: " + transport.getBrand() + " " + transport.getModel() + " и будет участвовать в заезде");
    }
    void startMoving () {System.out.println("Начать движение");}
    void stop (){System.out.println("Остановиться");}
    void refillAvto(){System.out.println("Заправить авто");}
    @Override
    public String toString() {return "водитель ФИО: " + fullName +", категория прав: " + getTupeLicense() + ", стаж вождения " + experience + " лет";}

}

