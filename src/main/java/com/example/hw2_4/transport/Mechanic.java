package com.example.hw2_4.transport;

public class Mechanic <M extends Transport>{
    private final String fullName;
    private String companyName;
    private String typeTransport;

    public Mechanic(String fullName, String companyName, String typeTransport) {
        if (fullName == null || fullName.isBlank()) {
            this.fullName = "ФИ должны быть заполнены!!";
        } else {
            this.fullName = fullName;
        }
        this.setCompanyName(companyName);
        this.setTypeTransport(typeTransport);
    }

    public String getFullName() {return fullName;}
    public String getCompanyName() {return companyName;}
    public String getTypeTransport() {return typeTransport;}

    public void setCompanyName(String companyName) {
        if (companyName == null || companyName.isBlank()) {
            this.companyName = "это поле должно быть заполнено!!";
        } else {
            this.companyName = companyName;
        }
    }

    @Override
    public String toString() {return "механик: " + fullName + ", фирмы: " + companyName + ", обслуживает транспортные средства категории: " + typeTransport;}

    public void setTypeTransport(String typeTransport) {
        if (typeTransport != null && !typeTransport.isBlank()) {
            this.typeTransport = typeTransport;
        } else {
            this.typeTransport = "это поле должно быть заполнено!!";
        }
    }

    public void performMaintenance(M m){
        System.out.println("механик " + getFullName() + " провел техобслуживание " + m.getBrand() + " " + m.getModel());
    }
    public void fixCar(M m){
        System.out.println("механик " + getFullName() + " отремонтировал транспортное средство " + m.getBrand() + " " + m.getModel());
    }
}
