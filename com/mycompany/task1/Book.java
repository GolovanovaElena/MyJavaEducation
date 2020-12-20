package com.mycompany.task1;

import java.util.Arrays;

public class Book {
    private String name;
    private Author[] authors;
    private double price;
    private int qty = 0;

    public Book(String name, Author[] authors, double price) {
        this.name = name;
        this.authors = authors;
        this.price = price;
    }

    public Book(String name, Author[] authors, double price, int qty) {
        this.name = name;
        this.authors = authors;
        this.price = price;
        this.qty = qty;
    }

    public String getName() {
        return name;
    }

    public Author[] getAuthors() {
        return authors;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public int getQty() {
        return qty;
    }

    public void setQty(int qty) {
        this.qty = qty;
    }

    public String getAuthorNames() {
        String allAuthors = authors[0].getName();
        for (int i = 1; i < authors.length; i++) {
            allAuthors = allAuthors + "," + authors[i].getName();
        }
        return allAuthors;
    }

    @Override
    public String toString() {
        String allAuthors = this.authors[0].toString();
        for (int i = 1; i < this.authors.length; i++) {
            allAuthors = allAuthors + "," + "\n" + this.authors[i].toString() ;
        }
        return "Book{" +
                "name='" + this.name + '\'' +
                "," + "\n" + authors + allAuthors + ","  +
                "\n" + "price=" + this.price +
                ", qty=" + this.qty +
                '}';
    }
}
