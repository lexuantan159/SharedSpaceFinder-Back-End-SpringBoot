package com.example.sharedspacefinder.models;

import javax.persistence.*;
import java.math.BigDecimal;

@Entity
public class Booking {
    @Id
    @Column(name = "bookingId")
    private Integer id;
    @ManyToOne
    @JoinColumn(name = "userId")
    private  User userId;
    @ManyToOne
    @JoinColumn(name = "spaceId")
    private  Space spaceId;
    @Column(name = "totalPrice")
    private BigDecimal totalPrice;
    @Column(name = "status")
    private  boolean status;
    @Column(name = "ownerId")
    private Integer ownerId;

    public Booking() {
    }

    public Booking(Integer id, User userId, Space spaceId, BigDecimal totalPrice, boolean status, Integer ownerId) {
        this.id = id;
        this.userId = userId;
        this.spaceId = spaceId;
        this.totalPrice = totalPrice;
        this.status = status;
        this.ownerId = ownerId;
    }
}
