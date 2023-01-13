package com.kafejo.shop.customers;

import org.jetbrains.annotations.NotNull;

public interface CustomerStorage {

    void addCustomer(Customer customer);

    Customer getCustomer(int id);

    void removeCustomer(int id);

    void updateCustomer(int id, Customer customer);

    void removeCustomer(@NotNull Customer customer);

    Customer getCustomer(@NotNull Customer customer);

    int getNumberOfCustomers();
}

