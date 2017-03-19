package com.mstiehr.model;

import javax.persistence.*;
import java.util.List;

@Entity
public class Driver
{
    @Id
    @Column(name = "ID")
    private long id; // should ORM take care of an id?

    @Column(name = "username")
    private String username;

    @Column(name = "email")
    private String email;

    @Column(name = "password")
    private String password; // probably hash of an passphrase

    @ManyToMany
    @JoinTable(
            name = "DRIVER_CAR",
            joinColumns = @JoinColumn(name = "DRIVER_ID", referencedColumnName = "ID"),
            inverseJoinColumns = @JoinColumn(name = "CAR_ID", referencedColumnName = "ID"))
    private List<Car> cars;

    public Driver() {
    }

    public Driver(long id, String username, String email, String password) {
        this.id = id;
        this.username = username;
        this.email = email;
        this.password = password;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
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

    public List<Car> getCars() {
        return cars;
    }

    public void setCars(List<Car> cars) {
        this.cars = cars;
    }
}
