package com.example.sharedspacefinder.models;

import javax.persistence.*;

@Entity
public class Feedback {
    @Id
    @Column(name = "feedBackId")
    private Integer id;
    @ManyToOne(cascade = CascadeType.REMOVE)
    @JoinColumn(name = "userSendFeedBackId")
    private User userSendFeedBackId;
    @ManyToOne(cascade = CascadeType.REMOVE)
    @JoinColumn(name = "userReceiveFeedBackId")
    private User userReceiveFeedBackId;
    @Column(name = "rate")
    private String rate;
    @Column(name = "comment")
    private String comment;
}
