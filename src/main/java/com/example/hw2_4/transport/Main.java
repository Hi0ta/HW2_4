package com.example.hw2_4.transport;

public class Main {
    public static void main(String[] args) {
        //Car bmw = new Car("BMW", "Z8", 3.0, null);
        Car lada = new Car("Lada", "Grande",  1.7, Car.BodyType.SEDAN);
        Car audi = new Car("Audi", "A8 50 L TDI quattro", 3.0, null);
        Car kia = new Car("Kia", "Sportage 4 поколение", 2.4, Car.BodyType.CROSSOVER);
        Car hyundai = new Car("Hyundai", "Avante", 1.6, Car.BodyType.HATCHBACK);
        System.out.println(lada.toString());
        System.out.println(audi.toString());
        System.out.println(kia.toString());
        hyundai.infoCar();
        Bus maz = new Bus("МАЗ", "232", 4.8, Bus.BodyType.MEDIUM);
        Bus manB = new Bus("MAN", "Lion’s Coach", 12.4, null);
        Bus manB2 = new Bus("MAN", "Lion’s City", 12.4, Bus.BodyType.LARGE);
        Bus liaz = new Bus("ЛиАЗ", "4292", 4.43, Bus.BodyType.SMALL);
        System.out.println(maz.toString());
        System.out.println(manB.toString());
        System.out.println(manB2.toString());
        liaz.infoBus();
        Trucks kamAz = new Trucks("КамАЗ", "5490", 11.97, Trucks.BodyType.N1);
        Trucks belAz = new Trucks("БелАЗ","75320", 60, Trucks.BodyType.N3);
        Trucks manT = new Trucks("MAN","TGS 6×6",12.4, Trucks.BodyType.N2);
        Trucks mazT = new Trucks("МАЗ","5440",14.86,null);
        System.out.println(kamAz.toString());
        System.out.println(manT.toString());
        System.out.println(mazT.toString());
        belAz.infoTrucks();
        Driver<Car> ivan = new Driver<>("Иванов И И", "B", 5);
        ivan.drive(audi);
        Driver<Bus> petr = new Driver<>("Петров П П", "D", 20);
        petr.drive(liaz);
        Driver<Trucks> sergey = new Driver<>("Сергеев С С", "C", 15);
        sergey.drive(belAz);
        lada.printBodyType();
        audi.printBodyType();
        kia.printBodyType();
        hyundai.printBodyType();
        kamAz.printBodyType();
        belAz.printBodyType();
        manT.printBodyType();
        mazT.printBodyType();
        maz.printBodyType();
        manB.printBodyType();
        manB2.printBodyType();
        liaz.printBodyType();
        sergey.startMoving(belAz);
        petr.stop(liaz);
        ivan.refillAvto(audi);
        }
    }
