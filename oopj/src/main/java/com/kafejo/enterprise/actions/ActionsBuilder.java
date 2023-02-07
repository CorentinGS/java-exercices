package com.kafejo.enterprise.actions;

import com.kafejo.enterprise.humans.Client;
import com.kafejo.enterprise.humans.Worker;

public class ActionsBuilder {
    private String name;
    private String description;

    private Client client;

    private Worker worker;

    public ActionsBuilder setName(String name) {
        this.name = name;
        return this;
    }

    public ActionsBuilder setDescription(String description) {
        this.description = description;
        return this;
    }

    public ActionsBuilder setClient(Client client) {
        this.client = client;
        return this;
    }

    public ActionsBuilder setWorker(Worker worker) {
        this.worker = worker;
        return this;
    }

    public Actions createActions() {
        return new Actions(name, description, client, worker);
    }
}