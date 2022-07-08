package org.example;

import java.util.Random;

public enum Dice {

    D6(6),
    D10(10),
    D20(20),
    D100(100);

    //Field
    private final int Maxvalue;

    //constructor
    Dice(int maxvalue) {
        Maxvalue = maxvalue;
    }

    public int getMaxvalue() {
        return Maxvalue;
    }

    public int roll(){
        Random random = new Random();
        int min = 1;
        int max = Maxvalue;
        int randomNum = min + random.nextInt(max);
        System.out.println("random number is: " + randomNum);
        return randomNum;
    }
}
