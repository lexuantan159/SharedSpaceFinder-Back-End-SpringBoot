package com.example.sharedspacefinder.models;

import javax.persistence.*;
import java.sql.Date;

@Entity
public class Payment {
    @Id
    @Column(name = "paymentId")
    private Integer id;
    @ManyToOne
    @JoinColumn(name = "userId")
    private User userId;
    @ManyToOne
    @JoinColumn(name = "bookingId")
    private Booking bookingId;
    @Column(name = "paymentDate")
    private Date date;
    @Column(name = "amount")
    private Integer amount;
    @Column(name = "paymentMethod")
    private String method;
}
