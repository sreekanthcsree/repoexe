package com.java8Features;

interface Vehicle{

    String getBrand();
    String speedUp();
    String slowDown();

    default String turnAlarmOn(){
        return "Vehicle turning Alarm On...!";
    }
    default String turnAlarmOff(){
        return "Vehicle turning Alarm Off...!";
    }

    static String getCompany() {
        return "Hyundai";
    }

}

class Car implements Vehicle{

    @Override
    public String getBrand() {
        return "KIA";
    }

    @Override
    public String speedUp() {
        return "The car is speed up...!";
    }

    @Override
    public String slowDown() {
        return "The car is slow down...!";
    }
}
public class DefaultDemo {

    public static void main(String[] args) {
        Vehicle vehicle = new Car();
        System.out.println("======Default Methods=====");
        System.out.println(vehicle.getBrand());
        System.out.println(vehicle.speedUp());
        System.out.println(vehicle.slowDown());
        System.out.println(vehicle.turnAlarmOn());
        System.out.println(vehicle.turnAlarmOff());

        System.out.println("======Static Methods=====");
        System.out.println(Vehicle.getCompany());
    }
}
