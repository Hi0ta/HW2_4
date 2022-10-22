package com.example.hw2_4.transport;

import java.util.LinkedList;
import java.util.Queue;

public class ServiceStation <B extends Car,  C extends Truck>{
    private String companyName;
    public ServiceStation(String companyName) {this.companyName = companyName;}
    public String getCompanyName() {return companyName;}

    private final Queue<B> queueB = new LinkedList<>();
    private final Queue<C> queueC = new LinkedList<>();

    public void addAvtoB(B car){
        queueB.offer(car);
    }
    public void addAvtoC(C truck){
        queueC.offer(truck);
        }
        public void technicalInspectionB(){
           B car = queueB.poll();
           if (car != null) {
               System.out.println("техосмотр авто " + car.getBrand() + " "  + car.getModel() + " проведен");
           }
        }
    public void technicalInspectionC(){
        C truck = queueC.poll();
        if (truck != null) {
            System.out.println("техосмотр авто " + truck.getBrand() + " "  + truck.getModel() + " проведен");
        }
    }
    public int queueBsize(){
        return queueB.size();
    }
    public int queueCsize(){
           return queueC.size();
        }
}
