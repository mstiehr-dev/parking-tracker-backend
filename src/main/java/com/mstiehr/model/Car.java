package com.mstiehr.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import java.util.List;

@Entity
public class Car
{
    @Id
    @Column(name = "ID")
    private long id;

    @Column(name = "POSITION")
    private Position position;

    @ManyToMany(mappedBy = "carsList")
    private List<Driver> drivers;

    public Car() {
    }

    public Car(long id, Position position) {
        this.id = id;
        this.position = position;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public Position getPosition() {
        return position;
    }

    public void setPosition(Position position) {
        this.position = position;
    }

    public List<Driver> getDrivers() {
        return drivers;
    }

    public void setDrivers(List<Driver> drivers) {
        this.drivers = drivers;
    }
}
