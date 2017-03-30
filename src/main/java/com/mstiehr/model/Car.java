package com.mstiehr.model;

import javax.persistence.*;
import java.util.List;

@Entity
public class Car
{
    @Id
    @GeneratedValue(strategy = GenerationType.TABLE)
    private long id;
    private String description;
    private double latitude;
    private double longitude;

    public Car() {
    }

    public Car(long id, double latitude, double longitude) {
        this.id = id;
        this.latitude = latitude;
        this.longitude = longitude;
    }

    public double getLatitude() {
        return latitude;
    }

    public void setLatitude(double latitude) {
        this.latitude = latitude;
    }

    public double getLongitude() {
        return longitude;
    }

    public void setLongitude(double longitude) {
        this.longitude = longitude;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
}
