package com.kafejo.shop;

import com.kafejo.shop.cart.Cart;
import com.kafejo.shop.customers.Customer;
import com.kafejo.shop.customers.CustomerDatabase;
import com.kafejo.shop.customers.CustomerStorage;
import com.kafejo.shop.products.*;
import org.jetbrains.annotations.NotNull;

import java.util.HashMap;

public class Shop {

    private final HashMap<Customer, Cart> carts;
    private final CustomerStorage customerStorage;

    private final ProductDatabase productDatabase;

    public Shop(CustomerStorage customerStorage, ProductDatabase productDatabase) {
        this.customerStorage = customerStorage;
        this.productDatabase = productDatabase;
        this.carts = new HashMap<>();
    }

    public static void main(String[] args) throws Product.ProductException {

        // Create a CustomerDatabase
        CustomerStorage customerStorage = createCustomerDatabase();
        ProductDatabase productDatabase = createProductDatabase();

        // Create a Shop
        Shop shop = new Shop(customerStorage, productDatabase);

        // Create a cart for a customer
        shop.createCart(customerStorage.getCustomer(1));

        // Add products to the cart
        shop.addProductToCart(customerStorage.getCustomer(1), "The Hobbit", 2);
        shop.addProductToCart(customerStorage.getCustomer(1), "The Lord of the Rings", 1);
        shop.addProductToCart(customerStorage.getCustomer(1), "The Lord of the Rings: The Battle for Middle-Earth II", 5);

        // Buy the products in the cart
        shop.confirmOrder(customerStorage.getCustomer(1));

    }

    @NotNull
    private static CustomerDatabase createCustomerDatabase() {
        CustomerDatabase customerDatabase = new CustomerDatabase();
        customerDatabase.addCustomer(new Customer("John", "john.doe@mail.com"));
        customerDatabase.addCustomer(new Customer("Jane", "jane.doe@mail.com"));
        customerDatabase.addCustomer(new Customer("Jack", "theripper@mail.com"));
        customerDatabase.addCustomer(new Customer("Jill", "asdad@sfs.cosa"));
        return customerDatabase;
    }

    @NotNull
    private static ProductDatabase createProductDatabase() throws Product.ProductException {
        ProductDatabase productDatabase = new ProductDatabase();
        productDatabase.addProduct(new Book("The Lord of the Rings", 100, "J.R.R. Tolkien", 10));
        productDatabase.addProduct(new Book("The Hobbit", 50, "J.R.R. Tolkien", 10));
        productDatabase.addProduct(new Book("The Silmarillion", 50, "J.R.R. Tolkien", 10));
        productDatabase.addProduct(new Movie("The Lord of the Rings: The Fellowship of the Ring", 100, "Peter Jackson"));
        productDatabase.addProduct(new Movie("The Lord of the Rings: The Two Towers", 100, "Peter Jackson"));
        productDatabase.addProduct(new Game("The Lord of the Rings: The Battle for Middle-Earth", 100, "EA"));
        productDatabase.addProduct(new Game("The Lord of the Rings: The Battle for Middle-Earth II", 100, "EA"));
        productDatabase.addProduct(new Game("The Lord of the Rings: The Battle for Middle-Earth II: The Rise of the Witch-king", 100, "EA"));
        return productDatabase;
    }

    public void createCart(Customer customer) {
        try {
            customerStorage.getCustomer(customer);
            carts.put(customer, new Cart());
        } catch (NullPointerException e) {
            throw new IllegalArgumentException("Customer does not exist");
        }
    }

    public void removeCustomer(Customer customer) {
        try {
            customerStorage.removeCustomer(customer);
            carts.remove(customer);
        } catch (NullPointerException e) {
            throw new IllegalArgumentException("Customer does not exist");
        }
    }

    public Cart getCart(Customer customer) {
        try {
            customerStorage.getCustomer(customer);
            return carts.get(customer);
        } catch (NullPointerException e) {
            throw new IllegalArgumentException("Customer does not exist");
        }
    }

    public int getNumberOfCustomers() {
        return carts.size();
    }

    public void confirmOrder(Customer customer) {
        try {
            Cart cart = carts.get(customer);
            double price = cart.getTotalPrice();
            System.out.println("Total price: " + price);
            System.out.println("Order confirmed");
            carts.remove(customer);
        } catch (NullPointerException e) {
            throw new IllegalArgumentException("Customer does not exist");
        }
    }

    public void addProductToCart(Customer customer, String productName, int quantity) {
        try {
            Product product = productDatabase.getProductByName(productName);
            getCart(customer).addProduct(product, quantity);
        } catch (NullPointerException e) {
            throw new IllegalArgumentException("Product does not exist");
        }
    }
}

