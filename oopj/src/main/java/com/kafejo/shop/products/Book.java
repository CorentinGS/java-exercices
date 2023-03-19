package com.kafejo.shop.products;

import org.jetbrains.annotations.NotNull;

public class Book extends Product {

    private String author;
    private int pages;

    public Book(String name, double price, String author, int pages) throws ProductException {
        super(name, price);
        this.author = author;
        this.pages = pages;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public int getPages() {
        return pages;
    }

    public void setPages(int pages) {
        this.pages = pages;
    }

    @Override
    public int compareTo(@NotNull Product o) {
        return 0;
    }
}
