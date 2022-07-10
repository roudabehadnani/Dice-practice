package org.example;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {


        systemDeveloper sara = new systemDeveloper(1, "Sara Anderson",
                LocalDate.of(2010,05,01),
                new String[]{"OCA", "OCP", "OCE", "OCM"},
                new String[]{"C++", "Ruby", "Java", "assembly", "fortran", "python", "lua", "ada"});


        salesPerson johan = new salesPerson(101, "Johan Balk",
                LocalDate.of(2015,03,17),
                new String[10], 4);


        sara.calculateSalary();
        sara.printDescription();

        johan.calculateSalary();
        johan.printDescription();


    }
}