package com.carRandD.cardesign;

public class CarSkeleton {
    private String name;
    private String description;

    public CarSkeleton(){}

    public CarSkeleton(String name, String description) {
        this.name = name;
        this.description = description;
    }

    public String startEngine(){
        System.out.println("Class Name: "+ getClass().getSimpleName());
        return getName() + "starting engine";
    }

    public String drive(){
        runEngine(this);
        return getName()+ " is driving.";
    }

    protected void runEngine(CarSkeleton carSkeleton){
        System.out.println(carSkeleton.getClass().getSimpleName());
        if(carSkeleton instanceof ElectricCar){
            double kmPerCharge = ((ElectricCar)carSkeleton).getAvgKmPerCharge();
            double batterySize = ((ElectricCar)carSkeleton).getBatterySize();
            System.out.println("The car engine is starting with electric. Per charge: " + kmPerCharge + " Battery Size: " + batterySize);
        }
        else if(carSkeleton instanceof HybridCar){
            HybridCar hybridCar = ((HybridCar)carSkeleton);
            System.out.println("The car engine is starting with hybrid. Per charge: " + hybridCar.getAvgKmPerLitre() + " Battery Size: " + hybridCar.getBatterySize() + "Cylinder: " + hybridCar.getCylinders());
        }
        else if(carSkeleton instanceof GasPoweredCar){
            GasPoweredCar gasPoweredCar = ((GasPoweredCar)carSkeleton);
            System.out.println("The car engine is starting with gas powered. Per charge: " + gasPoweredCar.getAvgKmPerLitre() + "Cylinder: " + gasPoweredCar.getCylinders());
        }
        else {
            System.out.println("Invalid car type!");
        }
    }

    public String getName() {
        return name;
    }

    public String getDescription() {
        return description;
    }

}
