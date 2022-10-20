package com.example.hw2_4.transport;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;

public class Main {
    private static Set<Transport> allTransport = new HashSet<>();
    private static Set<Driver> allDriver = new HashSet<>();
    private static Set<Sponsor> allSponsor =  new HashSet<>();
    private static Set<Mechanic> allMechanic = new HashSet<>();
    private static ArrayList<Sponsor> ladaSponsor = new ArrayList<>(5);
    private static ArrayList<Sponsor> audiSponsor = new ArrayList<>(5);
    private static ArrayList<Sponsor> kiaSponsor = new ArrayList<>(5);
    private static ArrayList<Sponsor> hyundaiSponsor = new ArrayList<>(5);
    private static ArrayList<Mechanic<?>> ladaMechanic = new ArrayList<>(3);
    private static ArrayList<Mechanic<?>> audiMechanic = new ArrayList<>(3);
    private static ArrayList<Mechanic<?>> kiaMechanic = new ArrayList<>(3);
    private static ArrayList<Mechanic<?>> hyundaiMechanic = new ArrayList<>(3);
    private static ArrayList<Sponsor> mazSponsor = new ArrayList<>(5);
    private static ArrayList<Sponsor> manBSponsor = new ArrayList<>(5);
    private static ArrayList<Sponsor> manB2Sponsor = new ArrayList<>(5);
    private static ArrayList<Sponsor> liazSponsor = new ArrayList<>(5);
    private static ArrayList<Mechanic<?>> mazMechanic = new ArrayList<>(3);
    private static ArrayList<Mechanic<?>> manBMechanic = new ArrayList<>(3);
    private static ArrayList<Mechanic<?>> manB2Mechanic = new ArrayList<>(3);
    private static ArrayList<Mechanic<?>> liazMechanic = new ArrayList<>(3);
    private static ArrayList<Sponsor> kamazSponsor = new ArrayList<>(5);
    private static ArrayList<Sponsor> belazSponsor = new ArrayList<>(5);
    private static ArrayList<Sponsor> manTSponsor = new ArrayList<>(5);
    private static ArrayList<Sponsor> mazTSponsor = new ArrayList<>(5);
    private static ArrayList<Mechanic<?>> kamazMechanic = new ArrayList<>(3);
    private static ArrayList<Mechanic<?>> belazMechanic = new ArrayList<>(3);
    private static ArrayList<Mechanic<?>> manTMechanic = new ArrayList<>(3);
    private static ArrayList<Mechanic<?>> mazTMechanic = new ArrayList<>(3);


    public static void main(String[] args) {
        //Car bmw = new Car("BMW", "Z8", 3.0, null);
        Car lada = new Car("Lada", "Grande", 1.7, Car.BodyType.SEDAN);
        Car audi = new Car("Audi", "A8 50 L TDI quattro", 3.0, null);
        Car kia = new Car("Kia", "Sportage 4 поколение", 2.4, Car.BodyType.CROSSOVER);
        Car hyundai = new Car("Hyundai", "Avante", 1.6, Car.BodyType.HATCHBACK);
        //System.out.println(lada.toString());
        //System.out.println(audi.toString());
        //System.out.println(kia.toString());
        //hyundai.infoCar();
        Bus maz = new Bus("МАЗ", "232", 4.8, Bus.BodyType.MEDIUM);
        Bus manB = new Bus("MAN", "Lion’s Coach", 12.4, null);
        Bus manB2 = new Bus("MAN", "Lion’s City", 12.4, Bus.BodyType.LARGE);
        Bus liaz = new Bus("ЛиАЗ", "4292", 4.43, Bus.BodyType.SMALL);
        //System.out.println(maz.toString());
        //System.out.println(manB.toString());
        //System.out.println(manB2.toString());
        //liaz.infoBus();
        Truck kamAz = new Truck("КамАЗ", "5490", 11.97, Truck.BodyType.N1);
        Truck belAz = new Truck("БелАЗ", "75320", 60, Truck.BodyType.N3);
        Truck manT = new Truck("MAN", "TGS 6×6", 12.4, Truck.BodyType.N2);
        Truck mazT = new Truck("МАЗ", "5440", 14.86, null);
        //System.out.println(kamAz.toString());
        //System.out.println(manT.toString());
        //System.out.println(mazT.toString());
        //belAz.infoTrucks();
        DriverB driverB1 = new DriverB("Иванов И И",true,5, lada);
        DriverB driverB2 = new DriverB("Васечкин В В",true,3, audi);
        DriverB driverB3 = new DriverB("Сидоров Т К",true,7, kia);
        DriverB driverB4 = new DriverB("Сергеев Р Ф",true,8, hyundai);
        DriverD driverD1 = new DriverD("Петров В А", true, 16, maz);
        DriverD driverD2 = new DriverD("Мосеев П Т", true, 25, manB);
        DriverD driverD3 = new DriverD("Кудряшов И Р", true, 30, manB2);
        DriverD driverD4 = new DriverD("Лодыгин А П", true, 18, liaz);
        DriverC driverC1 = new DriverC("Фадеев Р Р", true, 11, kamAz);
        DriverC driverC2 = new DriverC("Сергеев С И", true, 21, belAz);
        DriverC driverC3 = new DriverC("Андреев А А", true, 14, manT);
        DriverC driverC4 = new DriverC("Гордеев В С", true, 15, mazT);
        //lada.printBodyType();
        //audi.printBodyType();
        //kia.printBodyType();
        //hyundai.printBodyType();
        //kamAz.printBodyType();
        //belAz.printBodyType();
        //manT.printBodyType();
        //mazT.printBodyType();
        //maz.printBodyType();
        //manB.printBodyType();
        //manB2.printBodyType();
        //liaz.printBodyType();
        //sergey.startMoving();
        //petr.stop();
        //ivan.refillAvto();
        //lada.passDiagnostic();
        //audi.passDiagnostic();
        ////kia.passDiagnostic();
        //hyundai.passDiagnostic();
        //kamAz.passDiagnostic();
        //belAz.passDiagnostic();
        //manT.passDiagnostic();
        //mazT.passDiagnostic();
        //maz.passDiagnostic();
        //manB.passDiagnostic();
        //manB2.passDiagnostic();
        //liaz.passDiagnostic();

        allTransport.add(lada);
        allTransport.add(audi);
        allTransport.add(kia);
        allTransport.add(hyundai);
        allTransport.add(kamAz);
        allTransport.add(belAz);
        allTransport.add(manT);
        allTransport.add(mazT);
        allTransport.add(maz);
        allTransport.add(manB);
        allTransport.add(manB2);
        allTransport.add(liaz);
        allTransport.add(hyundai); //повтор для проверки
        allTransport.add(manB); //повтор для проверки
        System.out.println("полный список транспортных средств: ");
        int countT = 1;
        for (Transport transport: allTransport) {
            System.out.println(countT + " " + transport.toString());
            countT++;
        }
        System.out.println();


        Sponsor luk = new Sponsor("Лукойл", 100_00.00);
        //luk.sponsorRace();
        Sponsor gazprom = new Sponsor("Газпром", 50_000.00);
        Sponsor sberbank = new Sponsor("Сбербанк", 200_000.00);
        Sponsor rosneft = new Sponsor("Роснефть", 90_000.00);
        Sponsor vtb = new Sponsor("ВТБ", 150_000.00);

        allSponsor.add(luk);
        allSponsor.add(gazprom);
        allSponsor.add(sberbank);
        allSponsor.add(rosneft);
        allSponsor.add(vtb);
        allSponsor.add(sberbank); //повтор для проверки
        allSponsor.add(rosneft); //повтор для проверки
        System.out.println("полный список спонсоров: ");
        int countS = 1;
        for (Sponsor sponsor: allSponsor) {
            System.out.println(countS + " " + sponsor.toString());
            countS++;
        }
        System.out.println();

        allDriver.add(driverB1);
        allDriver.add(driverB2);
        allDriver.add(driverB3);
        allDriver.add(driverB4);
        allDriver.add(driverC1);
        allDriver.add(driverC2);
        allDriver.add(driverC3);
        allDriver.add(driverC4);
        allDriver.add(driverD1);
        allDriver.add(driverD2);
        allDriver.add(driverD3);
        allDriver.add(driverD4);
        allDriver.add(driverB3); //повтор для проверки
        allDriver.add(driverD2); //повтор для проверки
        allDriver.add(driverC1); //повтор для проверки
        System.out.println("полный список водителей: ");
        int countD = 1;
        for (Driver driver: allDriver) {
            System.out.println(countD + " " + driver.toString());
            countD++;
        }
        System.out.println();
        Mechanic<Car> mechanic1 = new Mechanic<>("Медведев Игорь", "пятое колесо", "легковые авто");
        Mechanic<Truck> mechanic2 = new Mechanic<>("Легостаев Иван", "пятое колесо", "грузовики");
        Mechanic<Bus> mechanic3 = new Mechanic<>("Салеев Семен", "пятое колесо", "автобусы");
        Mechanic<Transport> mechanic4 = new Mechanic<>("Турков Илья", "пятое колесо", "универсал");
        Mechanic<Transport> mechanic5 = new Mechanic<>("Кудымов Федор", "пятое колесо", "универсал");
        /*System.out.println();
        mechanic1.fixCar(lada);
        mechanic2.fixCar(belAz);
        mechanic3.fixCar(manB2);
        System.out.println();
        mechanic1.performMaintenance(hyundai);
        mechanic2.performMaintenance(manT);
        mechanic3.performMaintenance(liaz);
        mechanic4.performMaintenance(kia);
        mechanic5.performMaintenance(mazT);
        mechanic5.performMaintenance(manB);
        System.out.println();*/
        allMechanic.add(mechanic1);
        allMechanic.add(mechanic2);
        allMechanic.add(mechanic3);
        allMechanic.add(mechanic4);
        allMechanic.add(mechanic5);
        allMechanic.add(mechanic2); //повтор для проверки
        System.out.println("полный список механиков: ");
        int countM = 1;
        for (Mechanic mechanic: allMechanic) {
            System.out.println(countM + " " + mechanic.toString());
            countM++;
        }
        /*System.out.println();
        ladaSponsor.add(luk);
        ladaSponsor.add(sberbank);
        ladaSponsor.add(vtb);
        ladaMechanic.add(mechanic1);
        ladaMechanic.add(mechanic4);
        System.out.println();
        driverB1.drive();
        System.out.println("у транспортного средства " + lada.getBrand() + " " + lada.getModel() + " есть спонсоры " + ladaSponsor);
        System.out.println("у транспортного средства " + lada.getBrand() + " " + lada.getModel() + " есть команда механиков " + ladaMechanic);

        audiSponsor.add(rosneft);
        audiSponsor.add(gazprom);
        audiMechanic.add(mechanic5);
        System.out.println();
        driverB2.drive();
        System.out.println("у транспортного средства " + audi.getBrand() + " " + audi.getModel() + " есть спонсоры " + audiSponsor);
        System.out.println("у транспортного средства " + audi.getBrand() + " " + audi.getModel() + " есть команда механиков " + audiMechanic);

        ServiceStation<Car, Truck> piatoeKoleso = new ServiceStation<>("пятое колесо");
        piatoeKoleso.addAvtoB(lada);
        piatoeKoleso.addAvtoB(kia);
        piatoeKoleso.addAvtoB(hyundai);
        piatoeKoleso.addAvtoB(audi);
        System.out.println();
        System.out.println("в очереди на проведение техосмотра " + piatoeKoleso.queueBsize() + " авто");
        piatoeKoleso.technicalInspectionB();
        System.out.println("в очереди на проведение техосмотра " + piatoeKoleso.queueBsize() + " авто");
        piatoeKoleso.technicalInspectionB();
        piatoeKoleso.technicalInspectionB();
        piatoeKoleso.technicalInspectionB();
        //System.out.println("в очереди на проведение техосмотра " + piatoeKoleso.queueBsize() + " авто");
        ServiceStation<Car, Truck> gigant = new ServiceStation<>("гигант");
        gigant.addAvtoC(belAz);
        gigant.addAvtoC(manT);
        gigant.technicalInspectionC();*/




    }
}
