package com.example.sharedspacefinder.dto.request;

import javax.validation.constraints.Min;
import javax.validation.constraints.NotNull;
import java.math.BigDecimal;

public class SpaceForm {
    @NotNull
    private String title;
    @NotNull
    private String description;
    @NotNull
    @Min(1)
    private BigDecimal price;
    @NotNull
    @Min(1)
    private Float area;
    @NotNull
    private Integer bedroomsNumber;
    @NotNull
    private Integer bathroomsNumber;
    @NotNull
    private Integer peopleNumber;
    @NotNull
    private String province;
    @NotNull
    private String district;
    @NotNull
    private String ward;
    @NotNull
    private String address;
    @NotNull
    private Integer categoryId;
    private Integer ownerId;


    public SpaceForm() {
    }

    public SpaceForm(String title, String description, BigDecimal price, Float area, Integer bedroomsNumber, Integer bathroomsNumber, Integer peopleNumber, String province, String district, String ward, String address, Integer categoryId, Integer ownerId) {
        this.title = title;
        this.description = description;
        this.price = price;
        this.area = area;
        this.bedroomsNumber = bedroomsNumber;
        this.bathroomsNumber = bathroomsNumber;
        this.peopleNumber = peopleNumber;
        this.province = province;
        this.district = district;
        this.ward = ward;
        this.address = address;
        this.categoryId = categoryId;
        this.ownerId = ownerId;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public BigDecimal getPrice() {
        return price;
    }

    public void setPrice(BigDecimal price) {
        this.price = price;
    }

    public Float getArea() {
        return area;
    }

    public void setArea(Float area) {
        this.area = area;
    }

    public Integer getBedroomsNumber() {
        return bedroomsNumber;
    }

    public void setBedroomsNumber(Integer bedroomsNumber) {
        this.bedroomsNumber = bedroomsNumber;
    }

    public Integer getBathroomsNumber() {
        return bathroomsNumber;
    }

    public void setBathroomsNumber(Integer bathroomsNumber) {
        this.bathroomsNumber = bathroomsNumber;
    }

    public Integer getPeopleNumber() {
        return peopleNumber;
    }

    public void setPeopleNumber(Integer peopleNumber) {
        this.peopleNumber = peopleNumber;
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

    public Integer getCategoryId() {
        return categoryId;
    }

    public void setCategoryId(Integer categoryId) {
        this.categoryId = categoryId;
    }

    public Integer getOwnerId() {
        return ownerId;
    }

    public void setOwnerId(Integer ownerId) {
        this.ownerId = ownerId;
    }
}
