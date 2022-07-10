package org.example;

public class Main {
    public static void main(String[] args) {

        Car volvo = new Car(1,"ABC123","Volvo",4,4);
        volvo.drive();

        Motorcycle yamaha = new Motorcycle(20,"BRS128","Yamaha","Cruiser");
        yamaha.drive();

        Truck toyota = new Truck(56,"AAA444"," Toyota",80,20_000);
        toyota.drive();



    }
}