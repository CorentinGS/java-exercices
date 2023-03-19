package com.kafejo.shop.cart;

import com.kafejo.shop.products.Product;

import java.util.SortedMap;

import java.util.TreeMap;

public class Cart {

    private final TreeMap<Product, Integer> products;

    public Cart() {
        this.products = new TreeMap<>();
    }

    public void addProduct(Product product, int quantity) {
        products.put(product, quantity);
    }

    public void removeProduct(Product product) {
        products.remove(product);
    }

    public void updateProductQuantity(Product product, int quantity) {
        products.replace(product, quantity);
    }

    public SortedMap<Product, Integer> getProducts() {
        return products;
    }

    public double getTotalPrice() {
        return products.entrySet().stream().mapToDouble(entry -> entry.getKey().getPrice() * entry.getValue()).sum();
    }

    public int getNumberOfProducts() {
        return products.size();
    }
}
