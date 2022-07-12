package org.example;

public class ChildBook extends Book implements Loanable{

    private Category category = Category.CHILD;


    public ChildBook(String title, String author, Category category, String year) {
        super(title, author, Category.CHILD, year);
    }

    public ChildBook(String title, String author, Category category, String year, int pages) {
        super(title, author, Category.CHILD, year, pages);
    }



    @Override
    public void loan() {
        System.out.println("You can loan this Book");

    }
}
