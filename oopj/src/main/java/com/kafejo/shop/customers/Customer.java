package com.kafejo.shop.customers;

public class Customer {

    private String name;
    private String email;

    private final int id;

    private static int nextID = 0;

    public Customer(String name, String email) {
        this.id = getNextID();
        this.name = name;
        this.email = email;
    }

    public String getName() {
        return name;
    }

    public String getEmail() {
        return email;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public int getID() {
        return id;
    }

    private static int getNextID() {
        return nextID++;
    }


}
