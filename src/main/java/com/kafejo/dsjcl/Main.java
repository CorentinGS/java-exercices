package com.kafejo.dsjcl;

import com.kafejo.dsjcl.filesystem.Ls;
import com.kafejo.dsjcl.shop.*;
import org.apache.log4j.Logger;
import org.jetbrains.annotations.NotNull;

import java.util.Date;

public class Main {

    static final Logger logger = Logger.getLogger(Main.class.getName());

    public static void main(String[] args) {
       logger.info("Hello World!");

       // Create a book
        Book book;
        book = new Book("The Lord of the Rings", 22.5);

        book.setAuthor("J.R.R. Tolkien");
        book.setPublisher("Allen & Unwin");
        book.setNumberOfPages(1216);

        System.out.println(book);

        Customer customer;
        customer = new Customer("John", "Doe",
                "john.doe@mail.com", new Date(), "M");


        Customer customer2;
        customer2 = new Customer("Jane", "Doe",
                "jane.doe@mail.com", new Date(), "F");


        CustomerAdministration customerAdministration = new CustomerAdministration(customer, customer2);
        System.out.println(customerAdministration);

        Stocks stocks = generateStocks();
        System.out.println(stocks);

        customerAdministration.getCustomer(1).setShoppingCart(new ShoppingCart());

        customerAdministration.getCustomer(1).getShoppingCart().addProduct(book);

        customerAdministration.getCustomer(1).getShoppingCart().addProduct(book);

        customerAdministration.getCustomer(1).getShoppingCart().addProduct(new Book("Lord of the Flies", 12.5));

        System.out.println(customerAdministration.getCustomer(1).getShoppingCart().getProducts());

        System.out.println(stocks.getMissingProducts(customerAdministration.getCustomer(1).getShoppingCart()));

        System.out.println(stocks.getAvailableProducts(customerAdministration.getCustomer(1).getShoppingCart()));

        Ls ls = new Ls();
        ls.ls("/");
    }

    @NotNull
    private static Stocks generateStocks() {
        Stocks stocks = new Stocks();
        stocks.addProduct(new Book("The Lord of the Rings", 22.5, "J.R.R. Tolkien", "Allen & Unwin", 1216));
        stocks.addProduct(new Book("The Hobbit", 12.5, "J.R.R. Tolkien", "Allen & Unwin", 320));
        stocks.addProduct(new Book("Les Misérables", 15.5, "Victor Hugo", "Penguin", 1488));
        stocks.addProduct(new Book("The Count of Monte Cristo", 18.5, "Alexandre Dumas", "Penguin", 1352));
        stocks.addProduct(new Book("Les fleurs du mal", 10.5, "Charles Baudelaire", "Penguin", 432));

        return stocks;
    }
}