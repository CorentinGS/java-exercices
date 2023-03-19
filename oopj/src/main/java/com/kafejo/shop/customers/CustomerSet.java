package com.kafejo.shop.customers;

import org.jetbrains.annotations.NotNull;

import java.util.Collection;
import java.util.HashSet;
import java.util.Set;

public class CustomerSet implements CustomerStorage {

    private final HashSet<Customer> customers;

    public CustomerSet() {
        this.customers = new HashSet<>();
    }


    @Override
    public void addCustomer(Customer customer) {
        customers.add(customer);
    }

    @Override
    public Customer getCustomer(int id) {
        return customers.stream().filter(customer -> customer.getID() == id).findFirst().orElse(null);
    }

    @Override
    public void removeCustomer(int id) {
        customers.removeIf(customer -> customer.getID() == id);
    }

    @Override
    public void updateCustomer(int id, Customer customer) {
        customers.removeIf(c -> c.getID() == id);
        customers.add(customer);
    }

    @Override
    public void removeCustomer(@NotNull Customer customer) {
        customers.remove(customer);
    }

    @Override
    public Customer getCustomer(@NotNull Customer customer) {
        return customers.stream().filter(c -> c.getID() == customer.getID()).findFirst().orElse(null);
    }

    @Override
    public int getNumberOfCustomers() {
        return customers.size();
    }
}
