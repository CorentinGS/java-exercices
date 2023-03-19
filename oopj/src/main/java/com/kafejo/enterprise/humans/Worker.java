package com.kafejo.enterprise.humans;

public class Worker extends Human {

    private int salary;

    protected Worker(String name, int age, Gender gender) {
        super(name, age, gender);
    }

    private Worker(String name, int age, Gender gender, int salary) {
        super(name, age, gender);
        this.salary = salary;
    }

    public static Worker createWorker(String name, int age, Gender gender, int salary) {
        return new Worker(name, age, gender, salary);
    }


    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
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
