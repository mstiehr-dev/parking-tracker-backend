package com.mstiehr.model;

import javax.persistence.*;
import java.util.List;

@Entity
public class Car
{
    @Id
    @Column(name = "ID")
    private long id;

    @Column(name = "POSITION")
    private long position;

    @ManyToMany
    @JoinTable(
            name = "CAR_DRIVER",
            joinColumns = @JoinColumn(name = "DRIVER_ID", referencedColumnName = "ID"),
            inverseJoinColumns = @JoinColumn(name = "CAR_ID", referencedColumnName = "ID"))
    private List<Driver> drivers;

    public Car() {
    }

    public Car(long id, long position) {
        this.id = id;
        this.position = position;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public long getPosition() {
        return position;
    }

    public void setPosition(long position) {
        this.position = position;
    }

    public List<Driver> getDrivers() {
        return drivers;
    }

    public void setDrivers(List<Driver> drivers) {
        this.drivers = drivers;
    }
}
