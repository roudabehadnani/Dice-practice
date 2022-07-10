package org.example;

import java.time.LocalDate;
import java.util.Arrays;

public class systemDeveloper extends Employee{

    public static final double LANGUAGE_BONUS = 1_500;
    public static final double CERTIFICATE_BONUS = 1_000;

    private String[] certificates;
    private String[] languages;

    public systemDeveloper(int id, String name, LocalDate dateHired, String[] certificates, String[] languages) {
        super(id, name, dateHired);
        this.certificates = certificates;
        this.languages = languages;
        calculateSalary();
    }


    @Override
    public void calculateSalary() {
        double systemDeveloperSalary = BASE_SALARY;

        double languagesBonus = languages.length * LANGUAGE_BONUS;
        double certificatesBonus = certificates.length * CERTIFICATE_BONUS;

        systemDeveloperSalary += languagesBonus;
        systemDeveloperSalary += certificatesBonus;
        setSalary(systemDeveloperSalary);

    }

    @Override
    public void printDescription() {
        System.out.println("Prints systemDeveloper information:" + getName() + " with Id number:" + getId() +
                " has salary of:" + getSalary()+
                " Also has certificates:" + Arrays.toString(certificates));

    }

    public String[] getCertificates() {
        return certificates;
    }

    public void setCertificates(String[] certificates) {
        this.certificates = certificates;
    }

    public String[] getLanguages() {
        return languages;
    }

    public void setLanguages(String[] languages) {
        this.languages = languages;
    }


    @Override
    public String toString() {
        return "systemDeveloper{" +
                "certificates=" + Arrays.toString(certificates) +
                ", languages=" + Arrays.toString(languages) +
                '}';
    }



}
