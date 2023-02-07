package com.kafejo.enterprise.humans;

import java.util.UUID;

public class Client extends Human {

    private int money;

    private String uuid;

    private Client(String name, int age, Gender gender, int money) {
        super(name, age, gender);
        this.money = money;
        this.uuid = UUID.randomUUID().toString();
    }

    public static Client createClient(String name, int age, Gender gender, int money) {
        return new Client(name, age, gender, money);
    }

    public int getMoney() {
        return money;
    }

    public void setMoney(int money) {
        this.money = money;
    }

    public String getUuid() {
        return uuid;
    }

    public void setUuid(String uuid) {
        this.uuid = uuid;
    }

    @Override
    public void work() {
        System.out.println("I'm working!");
    }

    @Override
    public void eat() {
        System.out.println("I'm eating!");
    }

    @Override
    public void sleep() {
        System.out.println("I'm sleeping!");
    }

    @Override
    public void play() {
        System.out.println("I'm playing!");
    }

    @Override
    public void relax() {
        System.out.println("I'm relaxing!");
    }
}
