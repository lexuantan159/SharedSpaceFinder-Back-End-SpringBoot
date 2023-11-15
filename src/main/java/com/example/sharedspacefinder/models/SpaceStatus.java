package com.example.sharedspacefinder.models;

import javax.persistence.*;

@Entity
public class SpaceStatus {
    @Id
    @Column(name="statusId")
    private Integer id;
    @Column(name="status")
    private String status;


    public SpaceStatus() {
    }

    public SpaceStatus(Integer id, String status) {
        this.id = id;
        this.status = status;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }
}
