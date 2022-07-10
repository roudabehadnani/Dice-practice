package org.example;


public class Motorcycle extends Vehicle{

    private String motorcycleType;



    public Motorcycle(int vehicleId, String registrationNumber, String brand, String motorcycleType) {
        super(vehicleId, registrationNumber, brand);
        this.motorcycleType = motorcycleType;
    }


    @Override
    public void drive() {
        System.out.println("Motorcycle is driving with information: " + " Id:" + getVehicleId() + " Registration number:" +
                getRegistrationNumber() + " Brand is:" + getBrand() + " Motorcycle type is:" + getMotorcycleType());

    }

    public String getMotorcycleType() {
        return motorcycleType;
    }

    public void setMotorcycleType(String motorcycleType) {
        this.motorcycleType = motorcycleType;
    }

    @Override
    public String toString() {
        return "Motorcycle{" +
                "motorcycleType='" + motorcycleType + '\'' +
                '}';
    }
}
