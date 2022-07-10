package org.example;

import java.time.LocalDate;
import java.util.Arrays;

public class salesPerson extends Employee {

    public static final double CLIENT_BONUS = 500;
    public static final double ACQUIREDCLIENT_BONUS = 1_000;

    private String[] clients;
    private int acquiredClients;

    public salesPerson(int id, String name, LocalDate dateHired, String[] clients, int acquiredClients) {
        super(id, name, dateHired);
        this.clients = clients;
        this.acquiredClients = acquiredClients;
        calculateSalary();
    }


    @Override
    public void calculateSalary() {
        double salesPersonSalary = BASE_SALARY;

        double clientsSalary = clients.length * CLIENT_BONUS;
        double acquiredClientsSalary = acquiredClients * ACQUIREDCLIENT_BONUS;

        salesPersonSalary += clientsSalary;
        salesPersonSalary += acquiredClientsSalary;
        setSalary(salesPersonSalary);

    }

    @Override
    public void printDescription() {
        System.out.println("Prints systemDeveloper information:" + getName() + " with Id number:" + getId() +
                " has salary of:" + getSalary()+
                " Also the number of acquired client is :" + getAcquiredClients());

    }

    public String[] getClients() {
        return clients;
    }

    public void setClients(String[] clients) {
        this.clients = clients;
    }

    public int getAcquiredClients() {
        return acquiredClients;
    }

    public void setAcquiredClients(int acquiredClients) {
        this.acquiredClients = acquiredClients;
    }



    @Override
    public String toString() {
        return "salesPerson{" +
                "clients=" + Arrays.toString(clients) +
                ", acquiredClients=" + acquiredClients +
                '}';
    }
}
