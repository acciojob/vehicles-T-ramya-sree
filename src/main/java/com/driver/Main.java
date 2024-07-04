package com.driver;

public class Main {
    public static void main(String[] args) {
        Vehicle vehicle=new Vehicle("Generic Vehicle");
        System.out.println("Vehicle Name: "+vehicle.getVehicleName());
        vehicle.steer(45);
        vehicle.move(60,90);
        vehicle.stop();

//        //creating an instance of car
        Car car=new Car("Sedan",4,4,6,true,"Sedan",5);
        System.out.println("Car name: "+car.getVehicleName());
        car.changeGear(3);
        car.changeSpeed(80,180);

        F1 mercedes = new F1("mercedes", true);
        System.out.println("mercedes: "+mercedes.getVehicleName());
        mercedes.move(40,0);
        mercedes.accelerate(20);
        mercedes.accelerate(-60);

    }
}