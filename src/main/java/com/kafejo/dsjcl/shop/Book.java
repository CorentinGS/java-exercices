package com.kafejo.dsjcl.shop;

public class Book extends Product {

    private String author;
    private String publisher;
    private int numberOfPages;

    public Book(String name, double price) {
        super(name, price);
    }

    public Book(String name, double price, String author, String publisher, int numberOfPages) {
        super(name, price);
        this.author = author;
        this.publisher = publisher;
        this.numberOfPages = numberOfPages;
    }

    public void setNumberOfPages(int numberOfPages) {
        this.numberOfPages = numberOfPages;
    }

    public int getNumberOfPages() {
        return numberOfPages;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getAuthor() {
        return author;
    }

    public void setPublisher(String publisher) {
        this.publisher = publisher;
    }

    public String getPublisher() {
        return publisher;
    }

    @Override
    public String toString() {
        return "Book: " + getName() + ", price: " + getPrice() + ", author: " + getAuthor() + ", publisher: " + getPublisher() + ", number of pages: " + getNumberOfPages();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Book book)) return super.equals(o);

        if (getNumberOfPages() != book.getNumberOfPages()) return false;
        if (getAuthor() != null ? !getAuthor().equals(book.getAuthor()) : book.getAuthor() != null) return false;
        return getPublisher() != null ? getPublisher().equals(book.getPublisher()) : book.getPublisher() == null;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = getAuthor() != null ? getAuthor().hashCode() : 0;
        result = prime * result + (getPublisher() != null ? getPublisher().hashCode() : 0);
        result = prime * result + getNumberOfPages();
        return result;
    }
}
