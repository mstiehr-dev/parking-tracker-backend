package com.mstiehr.model;

import java.util.UUID;

/**
 * Created by maltin on 18.03.17.
 */
public class Driver
{
    private UUID id; // should ORM take care of an id?
    private String username;
    private String email;
    private String password; // probably hash of an passphrase

    public Driver() {
    }

    public Driver(UUID id, String username, String email, String password) {
        this.id = id;
        this.username = username;
        this.email = email;
        this.password = password;
    }

    public UUID getId() {
        return id;
    }

    public void setId(UUID id) {
        this.id = id;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}
