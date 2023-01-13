package com.kafejo.dsjcl.shop;

import java.util.Date;
import java.util.Objects;

public class Customer implements Comparable<Customer>, Cloneable {
    private static int nextId = 1;
    private final int id;
    private String firstName;
    private String lastName;
    private String email;
    private Date dateOfBirth;
    private String sex;

    private ShoppingCart shoppingCart;

    public Customer(String firstName, String lastName, String email, Date dateOfBirth, String sex) {
        this.id = getNextId();
        this.firstName = firstName;
        this.lastName = lastName;
        this.email = email;
        this.dateOfBirth = dateOfBirth;
        this.sex = sex;
    }

    public Customer() {
        this.id = getNextId();
    }

    public static int getNextId() {
        return nextId++;
    }

    public int getId() {
        return id;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Date getDateOfBirth() {
        return dateOfBirth;
    }

    public void setDateOfBirth(Date dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    @Override
    public String toString() {
        return "Customer: " + getFirstName() + " " + getLastName() + ", email: " + getEmail() + ", date of birth: " + getDateOfBirth() +
                ", sex: " + getSex() + ", id: " + getId();
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }

        if (obj == this) {
            return true;
        }

        if (!(obj instanceof Customer customer)) {
            return super.equals(obj);
        }

        return customer.hashCode() == this.hashCode();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + Objects.hashCode(getFirstName());
        result = prime * result + Objects.hashCode(getLastName());
        result = prime * result + Objects.hashCode(getEmail());
        result = prime * result + Objects.hashCode(getDateOfBirth());
        result = prime * result + Objects.hashCode(getSex());

        return result;
    }

/**
* Compares this object with the specified object for order.
 * @param o the object to be compared.
 * @return a negative integer, zero, or a positive integer as this object is less than, equal to, or greater than the specified object.
 */
    @Override
    public int compareTo(Customer o) {
        return this.getId() - o.getId();
    }

    @Override
    public Customer clone() throws CloneNotSupportedException {
        return (Customer) super.clone();
    }

    public ShoppingCart getShoppingCart() {
        return shoppingCart;
    }

    public void setShoppingCart(ShoppingCart shoppingCart) {
        this.shoppingCart = shoppingCart;
    }
}


