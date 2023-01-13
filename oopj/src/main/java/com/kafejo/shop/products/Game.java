package com.kafejo.shop.products;

public class Game extends Product {

    private String publisher;

    public Game(String name, double price, String publisher) {
        super(name, price);
        this.publisher = publisher;
    }

    public String getPublisher() {
        return publisher;
    }

    public void setPublisher(String publisher) {
        this.publisher = publisher;
    }
}

