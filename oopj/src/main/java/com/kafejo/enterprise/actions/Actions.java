package com.kafejo.enterprise.actions;

import com.kafejo.enterprise.humans.Client;
import com.kafejo.enterprise.humans.Worker;

public class Actions {

    private static int nextId = 1;
    private final int id;
    private String name;

    private String description;

    private Client client;

    private Worker worker;

    public Actions(String name, String description) {
        this.id = nextId++;
        this.name = name;
        this.description = description;
    }

    public Actions(String name, String description, Client client, Worker worker) {
        this.name = name;
        this.description = description;
        this.client = client;
        this.worker = worker;
        this.id = nextId++;
    }

    @Override
    public String toString() {
        return "Actions{" + "id=" + id + ", name='" + name + '\'' + ", description='" + description + '\'' + ", client=" + client + ", worker=" + worker + '}';
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Client getClient() {
        return client;
    }

    public void setClient(Client client) {
        this.client = client;
    }

    public Worker getWorker() {
        return worker;
    }

    public void setWorker(Worker worker) {
        this.worker = worker;
    }

}
