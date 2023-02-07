package com.kafejo.enterprise;

import com.kafejo.enterprise.actions.ActionsBuilder;
import com.kafejo.enterprise.humans.Client;
import com.kafejo.enterprise.humans.Gender;
import com.kafejo.enterprise.humans.Worker;

public class Enterprise {
    public static void main(String[] args) {
        System.out.println("Hello, Enterprise!");

        // Create a new client
        Client client = Client.createClient("Jane", 16, Gender.FEMALE, 100);

        // Create a new worker
        Worker worker = Worker.createWorker("John", 20, Gender.MALE, 1000);

        // Create a new action builder
        ActionsBuilder actionsBuilder = new ActionsBuilder();

        // Create a new action
        actionsBuilder.setName("Action 1").setDescription("Description 1").setClient(client).setWorker(worker);

        // Print the action
        System.out.println(actionsBuilder.createActions());
    }


}
