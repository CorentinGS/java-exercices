package com.kafejo.dsjcl.shop;

import org.jetbrains.annotations.NotNull;

import java.util.HashSet;
import java.util.Set;

public class Stocks {

    private final Set<Product> products = new HashSet<>();

    public void addProduct(Product product) {
        products.add(product);
    }

    public void addProducts(@NotNull Product... products) {
        for (Product product : products) {
            addProduct(product);
        }
    }

    public boolean exists(Product product) {
        return products.contains(product);
    }

    public void removeProduct(Product product) {
        products.remove(product);
    }

    public void removeProducts(@NotNull Product... products) {
        for (Product product : products) {
            removeProduct(product);
        }
    }

    public Set<Product> getProducts() {
        return products;
    }

    public Set<Product> getMissingProducts(@NotNull ShoppingCart shoppingCart) {
        Set<Product> missingProducts = new HashSet<>(shoppingCart.getProducts());
        missingProducts.removeAll(products);

        return missingProducts;
    }

    public Set<Product> getAvailableProducts(@NotNull ShoppingCart shoppingCart) {
        Set<Product> availableProducts = new HashSet<>(shoppingCart.getProducts());
        availableProducts.retainAll(products);

        return availableProducts;
    }


}
