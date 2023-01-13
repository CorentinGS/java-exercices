package com.kafejo.shop.products;

import java.util.HashSet;
import java.util.Set;
import java.util.stream.Collectors;

public class ProductDatabase {

    private HashSet<Product> products;

    public ProductDatabase() {
        this.products = new HashSet<>();
    }

    public void addProduct(Product product) {
        this.products.add(product);
    }

    public void removeProduct(Product product) {
        this.products.remove(product);
    }

    public Set<Product> getProducts() {
        return products;
    }

    public void setProducts(Set<Product> products) {
        this.products = new HashSet<>(products);
    }

    public Product getProductByName(String name) {
        return this.products.stream()
                .filter(product -> product.getName().equals(name))
                .findFirst()
                .orElse(null);
    }

    public Set<Product> getProductsByPriceRange(double min, double max) {
        return this.products.stream()
                .filter(product -> product.getPrice() >= min && product.getPrice() <= max)
                .collect(Collectors.toSet());
    }

}
