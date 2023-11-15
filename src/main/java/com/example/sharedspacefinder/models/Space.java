package com.example.sharedspacefinder.models;



import com.fasterxml.jackson.annotation.JsonIgnore;

import javax.persistence.*;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;


@Entity
public class Space {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "spaceId")
    private Integer id;
    @Column(name = "title")
    private String title;
    @ManyToOne
    @JoinColumn(name = "statusId")
    private SpaceStatus status;
    @Column(name = "price")
    private BigDecimal price;
    @OneToMany(mappedBy = "spaceId")
    private List<Image> images;
    @Column(name = "description")
    private String description;
    @Column(name = "bathroomNumbers")
    private Integer bathroomNumbers;
    @Column(name = "bedroomNumbers")
    private Integer bedroomNumbers;
    @Column(name = "peopleNumbers")
    private Integer peopleNumbers;
    @Column(name = "area")
    private float area;
    @Column(name = "province")
    private String province;
    @Column(name = "district")
    private String district;
    @Column(name = "ward")
    private String ward;
    @Column(name = "address")
    private String address;
    @ManyToOne
    @JoinColumn(name = "categoryId")
    private CategorySpace categoryId;
    @ManyToOne
    @JoinColumn(name = "ownerId",referencedColumnName = "userId",foreignKey = @ForeignKey(name = "fk_space_user"))
    private User ownerId ;

    @OneToMany(mappedBy = "space", orphanRemoval = true)
    @JsonIgnore
    private List<Favourite> favourites = new ArrayList<>();

    public Space() {
    }

    public Space( String title, SpaceStatus status, BigDecimal price, String description, Integer bathroomNumbers, Integer bedroomNumbers, Integer peopleNumbers, float area, String province, String district, String ward, String address, CategorySpace categoryId, User ownerId) {
        this.title = title;
        this.status = status;
        this.price = price;
        this.description = description;
        this.bathroomNumbers = bathroomNumbers;
        this.bedroomNumbers = bedroomNumbers;
        this.peopleNumbers = peopleNumbers;
        this.area = area;
        this.province = province;
        this.district = district;
        this.ward = ward;
        this.address = address;
        this.categoryId = categoryId;
        this.ownerId = ownerId;
    }

    public Space(Integer id, String title, SpaceStatus status, BigDecimal price, List<Image> images, String description, Integer bathroomNumbers, Integer bedroomNumbers, Integer peopleNumbers, float area, String province, String district, String ward, String address, CategorySpace categoryId, User ownerId) {
        this.id = id;
        this.title = title;
        this.status = status;
        this.price = price;
        this.images = images;
        this.description = description;
        this.bathroomNumbers = bathroomNumbers;
        this.bedroomNumbers = bedroomNumbers;
        this.peopleNumbers = peopleNumbers;
        this.area = area;
        this.province = province;
        this.district = district;
        this.ward = ward;
        this.address = address;
        this.categoryId = categoryId;
        this.ownerId = ownerId;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public SpaceStatus getStatus() {
        return status;
    }

    public void setStatus(SpaceStatus status) {
        this.status = status;
    }

    public BigDecimal getPrice() {
        return price;
    }

    public void setPrice(BigDecimal price) {
        this.price = price;
    }

    public List<Image> getImages() {
        return images;
    }

    public void setImages(List<Image> images) {
        this.images = images;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Integer getBathroomNumbers() {
        return bathroomNumbers;
    }

    public void setBathroomNumbers(Integer bathroomNumbers) {
        this.bathroomNumbers = bathroomNumbers;
    }

    public Integer getBedroomNumbers() {
        return bedroomNumbers;
    }

    public void setBedroomNumbers(Integer bedroomNumbers) {
        this.bedroomNumbers = bedroomNumbers;
    }

    public Integer getPeopleNumbers() {
        return peopleNumbers;
    }

    public void setPeopleNumbers(Integer peopleNumbers) {
        this.peopleNumbers = peopleNumbers;
    }

    public float getArea() {
        return area;
    }

    public void setArea(float area) {
        this.area = area;
    }

    public String getProvince() {
        return province;
    }

    public void setProvince(String province) {
        this.province = province;
    }

    public String getDistrict() {
        return district;
    }

    public void setDistrict(String district) {
        this.district = district;
    }

    public String getWard() {
        return ward;
    }

    public void setWard(String ward) {
        this.ward = ward;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public CategorySpace getCategoryId() {
        return categoryId;
    }

    public void setCategoryId(CategorySpace categoryId) {
        this.categoryId = categoryId;
    }

    public User getOwnerId() {
        return ownerId;
    }

    public void setOwnerId(User ownerId) {
        this.ownerId = ownerId;
    }
}
