package com.kafejo.enterprise.humans;

public abstract class Human {
    private static int nextId = 0;
    private final int id;
    private String name;
    private int age;
    private Gender gender;

    protected Human(String name, int age, Gender gender) {
        this.name = name;
        this.age = age;
        this.gender = gender;
        this.id = getNextId();
    }

    public static int getNextId() {
        return nextId++;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Human human)) return false;

        if (getAge() != human.getAge()) return false;
        if (getName() != null ? !getName().equals(human.getName()) : human.getName() != null) return false;
        return getGender() == human.getGender();
    }

    @Override
    public int hashCode() {
        int result = getName() != null ? getName().hashCode() : 0;
        result = 31 * result + getAge();
        result = 31 * result + (getGender() != null ? getGender().hashCode() : 0);
        return result;
    }

    @Override
    public String toString() {
        return "Human{" + "name='" + name + '\'' + ", age=" + age + ", gender=" + gender + ", id=" + id + '}';
    }

    public int getId() {
        return id;
    }

    public Gender getGender() {
        return gender;
    }

    public void setGender(Gender gender) {
        this.gender = gender;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public abstract void work();

    public abstract void eat();

    public abstract void sleep();

    public abstract void play();

    public abstract void relax();
}
