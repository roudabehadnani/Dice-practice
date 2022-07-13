package org.example;

public class YoungAdultBook extends Book implements Loanable{


        public YoungAdultBook(String title, String author, Category category, String year) {
                super(title, author, Category.ADULT, year);
        }

        public YoungAdultBook(String title, String author, Category category, String year, int pages) {
                super(title, author, Category.ADULT, year, pages);
        }

        @Override
        public void loan() {
                System.out.println("You can loan this Book");
        }
}
