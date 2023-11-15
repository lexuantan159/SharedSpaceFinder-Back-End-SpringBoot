package com.example.sharedspacefinder.models;

import javax.persistence.*;
import java.sql.Date;

@Entity
public class Invoice {
    @Id
    @Column(name = "invoiceId")
    private Integer id;
    @ManyToOne
    @JoinColumn(name = "userId")
    private User userId;
    @ManyToOne
    @JoinColumn(name = "bookingId")
    private Booking bookingId;
    @Column(name = "invoiceDate")
    private Date invoiceDate;
    @Column(name = "amount")
    private Integer amount;
    @Column(name = "paymentStatus")
    private boolean status;
}
