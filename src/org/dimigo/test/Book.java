package org.dimigo.test;

public class Book {


    private String title = "미생";
    public String author = "연수";
    public int page = 1000;

    public String getTitle() {
        return title;
    }

    public Book(String title, String author, int page){
        this.title = title;
        this.author = author;
        this.page = page;
    }
}
