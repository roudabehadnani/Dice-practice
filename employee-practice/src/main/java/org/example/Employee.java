package org.example;

import java.time.LocalDate;

public abstract class Employee {

    public static final double BASE_SALARY = 25_000;

    private int id;
    private String name;
    private double salary;
    private LocalDate dateHired;

    public Employee(int id, String name, LocalDate dateHired) {
        this.id = id;
        this.name = name;
        this.dateHired = dateHired;
    }
    
    public abstract void calculateSalary();

    public abstract void printDescription();
    

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public LocalDate getDateHired() {
        return dateHired;
    }

    public void setDateHired(LocalDate dateHired) {
        this.dateHired = dateHired;
    }



}
