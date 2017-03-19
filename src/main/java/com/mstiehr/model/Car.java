package com.mstiehr.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Car
{
    @Id
    @Column(name = "ID")
    private long id;

    @Column(name = "POSITION")
    private Position position;

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
}
