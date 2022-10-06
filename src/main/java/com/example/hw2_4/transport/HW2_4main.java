package com.example.hw2_4.transport;

public class HW2_4main {
    public static void main(String[] args) {
        //Car audi = new Car("Audi", "A8 50 L TDI quattro", 3.0);
        Car lada = new Car("Lada", "Grande",  1.7);
        Car bmw = new Car("BMW", "Z8", 3.0);
        Car kia = new Car("Kia", "Sportage 4 поколение", 2.4);
        Car hyundai = new Car("Hyundai", "Avante", 1.6);
        System.out.println(lada.toString());
        System.out.println(bmw.toString());
        System.out.println(kia.toString());
        hyundai.infoCar();
        Bus maz = new Bus("МАЗ", "232", 4.8);
        Bus manB = new Bus("MAN", "Lion’s Coach", 12.4);
        Bus manB2 = new Bus("MAN", "Lion’s City", 12.4);
        Bus liaz = new Bus("ЛиАЗ", "4292", 4.43);
        System.out.println(maz.toString());
        System.out.println(manB.toString());
        System.out.println(manB2.toString());
        liaz.infoBus();
        Trucks kamAz = new Trucks("КамАЗ", "5490", 11.97);
        Trucks belAz = new Trucks("БелАЗ","75320", 60);
        Trucks manT = new Trucks("MAN","TGS 6×6",12.4);
        Trucks mazT = new Trucks("МАЗ","5440",14.86);
        System.out.println(kamAz.toString());
        System.out.println(manT.toString());
        System.out.println(mazT.toString());
        belAz.infoTrucks();
        Driver<Car> ivan = new Driver<>("Иванов И И", "B", 5);
        ivan.drive(bmw);
        Driver<Bus> petr = new Driver<>("Петров П П", "D", 20);
        petr.drive(liaz);
        Driver<Trucks> sergey = new Driver<>("Сергеев С С", "C", 15);
        sergey.drive(belAz);
    }

    }
