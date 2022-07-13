package org.example;

public class ReferenceBook extends Book{


    public ReferenceBook(String title, String author, Category category, String year) {
        super(title, author, Category.NOT_LOANABLE, year);
    }

    public ReferenceBook(String title, String author, Category category, String year, int pages) {
        super(title, author, Category.NOT_LOANABLE, year, pages);
    }



}
