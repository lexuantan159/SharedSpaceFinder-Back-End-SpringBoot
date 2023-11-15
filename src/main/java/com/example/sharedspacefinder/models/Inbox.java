package com.example.sharedspacefinder.models;

import javax.persistence.*;


@Entity
public class Inbox {
    @Id
    @Column(name = "inboxId")
    private Integer id;
    @ManyToOne
    @JoinColumn(name = "senderId")
    private User senderId;
    @ManyToOne
    @JoinColumn(name = "receiveId")
    private User receiveId;
    @Column(name = "inboxName")
    private String name;
}
