package org.example;

public class Book {

    private String title;
    private String author;
    Category category;
    private String year;
    private int pages;


    public Book(String title, String author, Category category, String year) {
        this.title = title;
        this.author = author;
        this.category = category;
        this.year = year;
        this.pages = 100;
    }

    public Book(String title, String author, Category category, String year, int pages) {
        this.title = title;
        this.author = author;
        this.category = category;
        this.year = year;
        this.pages = pages;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public Category getCategory() {
        return category;
    }

    public void setCategory(Category category) {
        this.category = category;
    }

    public String getYear() {
        return year;
    }

    public void setYear(String year) {
        this.year = year;
    }

    public int getPages() {
        return pages;
    }

    public void setPages(int pages) {
        this.pages = pages;
    }

    @Override
    public String toString() {
        return "Book{" +
                "title='" + title + '\'' +
                ", author='" + author + '\'' +
                ", category=" + category +
                ", year='" + year + '\'' +
                ", pages=" + pages +
                '}';
    }
}
