package com.kafejo.dsjcl.shop;

import org.jetbrains.annotations.NotNull;

import java.util.LinkedList;
import java.util.List;

public class ShoppingCart {
    private float price;
    private final List<Product> products = new LinkedList<>();

    public void addProduct(Product product) {
        products.add(product);
        price += product.getPrice();
    }

    public void addProducts(@NotNull Product... products) {
        for (Product product : products) {
            addProduct(product);
            price += product.getPrice();
        }
    }

    public void addProducts(@NotNull List<Product> products) {
        for (Product product : products) {
            products.add(product);
            price += product.getPrice();
        }
    }

    public void removeProduct(Product product) {
        products.remove(product);
        price -= product.getPrice();
    }

    public void empty() {
        products.clear();
        price = 0;
    }

    public float getPrice() {
        return price;
    }

    public List<Product> getProducts() {
        return products;
    }

    public int getNumberOfProducts() {
        return products.size();
    }

}
