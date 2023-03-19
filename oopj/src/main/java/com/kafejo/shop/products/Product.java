package com.kafejo.shop.products;

public abstract class Product implements Comparable<Product> {

    private String name;
    private double price;

    protected Product(String name, double price) throws ProductException {
        this.name = name;
        setPrice(price);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Product product)) return false;

        if (Double.compare(product.getPrice(), getPrice()) != 0) return false;
        return getName() != null ? getName().equals(product.getName()) : product.getName() == null;
    }

    @Override
    public int hashCode() {
        int result;
        long temp;
        result = getName() != null ? getName().hashCode() : 0;
        temp = Double.doubleToLongBits(getPrice());
        result = 31 * result + (int) (temp ^ (temp >>> 32));
        return result;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) throws ProductException {
        try {
            if (price < 0) {
                throw new IllegalArgumentException("Price cannot be negative");
            }
            this.price = price;
        } catch (IllegalArgumentException e) {
            throw new ProductException("Price cannot be negative", e);
        }
    }

    public static class ProductException extends Exception {
        public ProductException(String message) {
            super(message);
        }

        public ProductException(String message, Throwable cause) {
            super(message, cause);
        }
    }
}
