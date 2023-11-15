package com.example.sharedspacefinder.models;

import com.fasterxml.jackson.annotation.JsonIgnore;

import javax.persistence.*;

@Entity
public class Image {
    @Id
    @Column(name = "image_id", length = 50)
    private String imageId;
    @Column(name = "imageUrl")
    private String imageUrl;
    @ManyToOne
    @JoinColumn(name = "spaceId")
    @JsonIgnore
    private Space spaceId;

    public Image() {
    }

    public Image(String imageId) {
        this.imageId = imageId;
    }

    public Image(String imageId, String imageUrl, Space spaceId) {
        this.imageId = imageId;
        this.imageUrl = imageUrl;
        this.spaceId = spaceId;
    }

    public String getImageId() {
        return imageId;
    }

    public void setImageId(String imageId) {
        this.imageId = imageId;
    }

    public String getImageUrl() {
        return imageUrl;
    }

    public void setImageUrl(String imageUrl) {
        this.imageUrl = imageUrl;
    }

    public Space getSpaceId() {
        return spaceId;
    }

    public void setSpaceId(Space spaceId) {
        this.spaceId = spaceId;
    }
}
