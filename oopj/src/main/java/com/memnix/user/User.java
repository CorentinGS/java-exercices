package com.memnix.user;

public class User {
    private final String username;
    private final String email;
    private final long id; // primary key in database

    public User(String username, String email, int id) {
        this.username = username;
        this.email = email;
        this.id = id;
    }

    public String getUsername() {
        return username;
    }

    public String getEmail() {
        return email;
    }

    public long getId() {
        return id;
    }

    @Override
    public String toString() {
        return "User{" + "username=" + username + ", email=" + email + ", id=" + id + '}';
    }
}
