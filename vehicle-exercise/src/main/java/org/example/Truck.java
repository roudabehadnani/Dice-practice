package org.example;

public class Truck extends Vehicle{

    private double maxSpeed;
    private double maxWeight;


    public Truck(int vehicleId, String registrationNumber, String brand, double maxSpeed, double maxWeight) {
        super(vehicleId, registrationNumber, brand);
        this.maxSpeed = maxSpeed;
        this.maxWeight = maxWeight;
    }


    @Override
    public void drive() {
        System.out.println("Truck is driving with information: " + " Id:" + getVehicleId() + " Registration number:" +
                getRegistrationNumber() + " Brand is:" + getBrand() + " Maximum speed is:" + getMaxSpeed() + " Km/h" +
                " And Maximum weight is:" + getMaxWeight() + " pounds" );

    }

    public double getMaxSpeed() {
        return maxSpeed;
    }

    public void setMaxSpeed(double maxSpeed) {
        this.maxSpeed = maxSpeed;
    }

    public double getMaxWeight() {
        return maxWeight;
    }

    public void setMaxWeight(double maxWeight) {
        this.maxWeight = maxWeight;
    }

    @Override
    public String toString() {
        return "Truck{" +
                "maxSpeed=" + maxSpeed +
                ", maxWeight=" + maxWeight +
                '}';
    }
}
