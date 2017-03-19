package com.mstiehr.model;

public class Car
{
    private long id;
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
