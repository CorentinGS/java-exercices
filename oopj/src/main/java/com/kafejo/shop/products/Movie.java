package com.kafejo.shop.products;

import org.jetbrains.annotations.NotNull;

public class Movie extends Product {

    private String director;

    public Movie(String name, double price, String director) throws ProductException {
        super(name, price);
        this.director = director;
    }

    public String getDirector() {
        return director;
    }

    public void setDirector(String director) {
        this.director = director;
    }

    @Override
    public int compareTo(@NotNull Product o) {
        return 0;
    }
}
