package com.mstiehr.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Position
{
    @Id
    @Column(name = "ID")
    private long id;

    @Column(name = "longitude")
    private long longitude;
    @Column(name = "latitude")
    private long latitude;

    public Position() {
    }

    public Position(long longitude, long latitude) {
        this.longitude = longitude;
        this.latitude = latitude;
    }

    public long getLongitude() {
        return longitude;
    }

    public void setLongitude(long longitude) {
        this.longitude = longitude;
    }

    public long getLatitude() {
        return latitude;
    }

    public void setLatitude(long latitude) {
        this.latitude = latitude;
    }
}
