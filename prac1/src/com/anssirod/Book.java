package com.anssirod;

public class Book {
    private String name;
    private int pages;

    public String toString() {
        return "Name: " + this.name + " Pages: " + this.pages;
    }

    public Book(String n, int p) {
        name = n;
        pages = p;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getPages() {
        return pages;
    }

    public void setPages(int pages) {
        this.pages = pages;
    }

    public void read() {
        System.out.println("Reading....");
    }
}
