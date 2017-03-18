package com.mstiehr.model;

import java.util.UUID;

/**
 * Created by maltin on 18.03.17.
 */
public class Car
{
    private UUID id;
    private Position position;

    public Car() {
    }

    public Car(UUID id, Position position) {
        this.id = id;
        this.position = position;
    }

    public UUID getId() {
        return id;
    }

    public void setId(UUID id) {
        this.id = id;
    }

    public Position getPosition() {
        return position;
    }

    public void setPosition(Position position) {
        this.position = position;
    }
}
