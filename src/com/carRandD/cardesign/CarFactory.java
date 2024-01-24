package com.carRandD.cardesign;

public class CarFactory {
    public static void main(String[] args) {
        CarSkeleton electricCar = new ElectricCar("Tesla", "Electrical car", 100, 4);
        CarSkeleton hybridCar = new HybridCar("Toyota", "Hybrid car", 0.0, 100, 4);
        CarSkeleton gasPoweredCar = new GasPoweredCar("BMW", "Gas Powered car", 4, 4);

        ElectricCar electricCar1 = new ElectricCar("Volvo", "Electrical car", 100, 4);

        System.out.println(electricCar.drive());
        System.out.println(hybridCar.drive());
        System.out.println(gasPoweredCar.drive());
        System.out.println(((CarSkeleton)electricCar1).drive()); //CLASS CASTING

        System.out.println(electricCar.startEngine());
        System.out.println(hybridCar.startEngine());
        System.out.println(gasPoweredCar.startEngine());
    }
}
