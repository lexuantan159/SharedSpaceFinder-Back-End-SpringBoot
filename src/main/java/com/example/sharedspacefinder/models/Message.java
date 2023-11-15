package com.example.sharedspacefinder.models;

import javax.persistence.*;
import java.sql.Date;

@Entity
public class Message {
    @Id
    @Column(name = "messageId")
    private Integer id;
    @Column(name = "conversationId")
    private String conversationId;
    @Column(name = "messageContent")
    private String messageContent;
    @Column(name = "sendDate")
    private Date sendDate;
}
