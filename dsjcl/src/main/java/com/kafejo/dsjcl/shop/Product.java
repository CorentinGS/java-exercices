package com.kafejo.dsjcl.shop;

public class Product {

    private final String name;
    private final double price;

    public Product(String name, double price) {
        this.name = name;
        this.price = price;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Product product)) return false;

        return getName() != null ? getName().equals(product.getName()) : product.getName() == null;
    }

    @Override
    public int hashCode() {
        return getName() != null ? getName().hashCode() : 0;
    }

    public String getName() {
        return name;
    }

    public double getPrice() {
        return price;
    }


    public String toString() {
        return "Product: " + name + ", price: " + price;
    }
}
