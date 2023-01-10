package com.kafejo.dsjcl.shop;

import org.junit.jupiter.api.Test;

import java.util.Date;

import static org.junit.jupiter.api.Assertions.*;

class CustomerTest {

    @org.junit.jupiter.api.Test
    void testEquals() throws CloneNotSupportedException {
        // Create a customer object
        Customer customer1 = new Customer();
        Customer customer2 = new Customer();

        // Empty objects should be equal
        assertEquals(customer1, customer2);

        // Create same object
        customer1.setFirstName("John");
        customer1.setLastName("Doe");
        customer1.setEmail("Doe.john@mail.com");
        customer1.setDateOfBirth(new Date());
        customer1.setSex("M");

        customer2.setFirstName("John");
        customer2.setLastName("Doe");
        customer2.setEmail("Doe.john@mail.com");
        customer2.setDateOfBirth(new Date());
        customer2.setSex("M");

        // Objects should be equal
        assertEquals(customer1, customer2);

        // Symmetrical property
        assertEquals(customer2, customer1);

        // Create a reference to the same object
        Customer customer3 = customer1;
        // Transitive property
        assertEquals(customer1, customer3);
        assertEquals(customer3, customer2);
        // Reflective
        assertEquals(customer1, customer1);

        // Consistent
        customer3.setFirstName("Jane");
        assertEquals(customer1, customer3);
        assertNotEquals(customer3, customer2);
        assertNotEquals(customer1, customer2);

        // Existent property
        assertNotEquals(null, customer1);

        Customer customer4 = customer2.clone();
        assertEquals(customer2, customer4);
    }

    @Test
    void compareTo() {
        // Create a customer object
        Customer customer1 = new Customer();
        Customer customer2 = new Customer();

        assert(customer1.compareTo(customer2) < 0);
        assert(customer2.compareTo(customer1) > 0);

        Customer customer3 = customer1;

        assert(customer1.compareTo(customer3) == 0);
    }
}