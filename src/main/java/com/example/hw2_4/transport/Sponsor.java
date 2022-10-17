package com.example.hw2_4.transport;

public class Sponsor {
    private final String name;
    private double amount;

    public Sponsor(String name, double amount) {
        if (name == null || name.isBlank()) {
            this.name = "это поле должно быть заполнено!!";
        } else {
            this.name = name;
        }
        this.setAmount(amount);
    }
    public String getName() {return name;}
    public double getAmount() {return amount;}
    public void setAmount(double amount) {
        if (amount < 0){
            this.amount = 0;
        }else {
            this.amount = amount;
        }
    }

    @Override
    public String toString() {return "спонсор: " + name + ", сумма поддержки: " + amount + " руб.";}

    public void sponsorRace(){
        System.out.println("спонсор: " + getName() + " спонсирует заезд на сумму = " + getAmount() + " руб.");
    }
}
