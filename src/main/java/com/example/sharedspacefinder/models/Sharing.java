package com.example.sharedspacefinder.models;

import javax.persistence.*;

@Entity
public class Sharing {
    @Id
    @Column(name = "sharingId")
    private Integer id;
    @ManyToOne
    @JoinColumn(name = "spaceId")
    private Space spaceId;
    @ManyToOne
    @JoinColumn(name = "userId")
    private User userId;
    @Column(name = "status")
    private Boolean status;
}
