package com.kafejo.shop.customers;

public class Customer {

    private static int nextID = 0;
    private final int id;
    private String name;
    private String email;

    public Customer(String name, String email) {
        this.id = getNextID();
        this.name = name;
        this.email = email;
    }

    private static int getNextID() {
        return nextID++;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public int getID() {
        return id;
    }


}
