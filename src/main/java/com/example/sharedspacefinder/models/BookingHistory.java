package com.example.sharedspacefinder.models;

import javax.persistence.*;
import java.math.BigDecimal;
import java.sql.Date;

@Entity
public class BookingHistory {
    @Id
    @Column(name = "historyBookingId")
    private Integer id;
    @ManyToOne
    @JoinColumn(name = "userId")
    private User userId;
    @ManyToOne
    @JoinColumn(name = "spaceId")
    private Space spaceId;
    @Column(name = "totalPrice")
    private BigDecimal totalPrice;
    @Column(name = "status")
    private boolean status;
    @Column(name = "bookingDate")
    private Date date;
    @ManyToOne
    @JoinColumn(name = "invoiceId")
    private Invoice invoiceId;
}
