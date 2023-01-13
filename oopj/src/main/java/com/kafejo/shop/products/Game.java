package com.kafejo.shop.products;

import org.jetbrains.annotations.NotNull;

public class Game extends Product {

    private String publisher;

    public Game(String name, double price, String publisher) throws ProductException {
        super(name, price);
        this.publisher = publisher;
    }

    public String getPublisher() {
        return publisher;
    }

    public void setPublisher(String publisher) {
        this.publisher = publisher;
    }

    @Override
    public int compareTo(@NotNull Product o) {
        return 0;
    }
}

