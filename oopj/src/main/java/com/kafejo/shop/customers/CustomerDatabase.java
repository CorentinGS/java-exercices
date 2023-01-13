package com.kafejo.shop.customers;

import org.jetbrains.annotations.NotNull;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Set;

public class CustomerDatabase {
    private final HashMap<Integer, Customer> customers;

    public CustomerDatabase() {
        customers = new HashMap<>();
    }

    public void addCustomer(Customer customer) {
        customers.put(customer.getID(), customer);
    }

    public void removeCustomer(@NotNull Customer customer) {
        customers.remove(customer.getID());
    }

    public void removeCustomer(int id) {
        customers.remove(id);
    }

    public Set<Customer> getCustomers() {
        return new HashSet<>(customers.values());
    }

    public Customer getCustomer(int id) {
        return customers.get(id);
    }

    public Customer getCustomer(@NotNull Customer customer) {
        return customers.get(customer.getID());
    }

    public int getNumberOfCustomers() {
        return customers.size();
    }
}
