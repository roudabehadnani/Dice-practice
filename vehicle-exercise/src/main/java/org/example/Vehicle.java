package org.example;


public abstract class Vehicle {

    private int vehicleId;
    private String registrationNumber;
    private String brand;



    public Vehicle(int vehicleId, String registrationNumber, String brand) {
        super();
        this.vehicleId = vehicleId;
        this.registrationNumber = registrationNumber;
        this.brand = brand;
    }

    public abstract void drive();


    public int getVehicleId() {
        return vehicleId;
    }

    public void setVehicleId(int vehicleId) {
        this.vehicleId = vehicleId;
    }

    public String getRegistrationNumber() {
        return registrationNumber;
    }

    public void setRegistrationNumber(String registrationNumber) {
        this.registrationNumber = registrationNumber;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }





}
