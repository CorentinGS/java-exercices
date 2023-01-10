package com.kafejo.dsjcl.shop;

import org.jetbrains.annotations.NotNull;

import java.util.*;

public class CustomerAdministration implements Iterable<Customer> {

    private final Map<Integer, Customer> customers;

    public CustomerAdministration() {
        customers = new HashMap<>();
    }

    public CustomerAdministration(Customer... customers) {
        this.customers = new HashMap<>();
        for (Customer customer : customers) {
            this.customers.put(customer.getId(), customer);
        }
    }


    public void addCustomer(Customer customer) {
        customers.put(customer.getId(), customer);
    }

    public Customer getCustomer(int id) {
        return customers.get(id);
    }

    public void removeAllCustomer(@NotNull Collection<Customer> customers) {
        Customer k;
        Iterator<Customer> it = customers.iterator();

        while (it.hasNext()) {
            k = it.next();
            this.removeCustomer(k);
        }
    }

    private void removeCustomer(@NotNull Customer k) {
        customers.remove(k.getId());
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        for (Customer customer : customers.values()) {
            sb.append(customer.toString()).append("\n");
        }
        return sb.toString();
    }

    @Override
    public Iterator<Customer> iterator() {
        return new CustomerAdministrationIterator();
    }


    class CustomerAdministrationIterator implements Iterator<Customer> {

        private int index = 0;

        @Override
        public boolean hasNext() {
            return index < customers.size();
        }

        @Override
        public Customer next() {
            if (hasNext()) {
                return customers.get(index++);
            } else {
                throw new NoSuchElementException();
            }
        }
    }
}
