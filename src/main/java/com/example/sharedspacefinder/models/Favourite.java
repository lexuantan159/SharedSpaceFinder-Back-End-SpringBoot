package com.example.sharedspacefinder.models;

import javax.persistence.*;

@Entity
public class Favourite {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "favouriteId")
    private Integer id;
    @ManyToOne
    @JoinColumn(name = "spaceId", referencedColumnName = "spaceId",foreignKey = @ForeignKey(name = "fk_favourite_space"))
    private Space space;
    @ManyToOne
    @JoinColumn(name = "userId",referencedColumnName = "userId",foreignKey = @ForeignKey(name = "fk_favourite_user"))
    private User user;

    public Favourite() {
    }
    public Favourite( Space space, User user) {
        this.space = space;
        this.user = user;
    }

    public Favourite(Integer id, Space space, User user) {
        this.id = id;
        this.space = space;
        this.user = user;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Space getSpace() {
        return space;
    }

    public void setSpace(Space space) {
        this.space = space;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }
}
