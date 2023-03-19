package com.corentings.ex6;

public class Main {

    public static void main(String[] args) {
        Person human = new Person("Max", "Smith", "12.02.1984");
        Person human2 = new Person(human);

        System.out.println(human2);
    }
}
