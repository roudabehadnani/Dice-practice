package org.example;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {

        ChildBook book1 = new ChildBook("Drawing book","Fiona watt ",Category.CHILD,"2014",100);

        YoungAdultBook book2 = new YoungAdultBook("Ordinary Monster","J.M. Miro ",Category.ADULT,"2015",900);

        ReferenceBook book3 = new ReferenceBook("Reference book"," F.M ",Category.NOT_LOANABLE,"2011",1500);


        Book[] type = new Book[]{book1, book2, book3};


        System.out.println("Loanable Books: ");
        for (Book b1 : type){
            if (b1 instanceof Loanable){
                System.out.println(b1);
            }
        }


        System.out.println("Not Loanable Book: ");
        for (Book b2 : type){
            if (b2.category == Category.NOT_LOANABLE){
                System.out.println(b2);
            }
        }


        System.out.println("Child Category: ");
        for (Book b3: type) {
            if (b3.category == Category.CHILD ){
                System.out.println(b3);
            }

        }


        System.out.println("Adult Book: ");
        for (Book b4 : type){
            if (b4.category == Category.ADULT){
                System.out.println(b4);
            }
        }


    }
}