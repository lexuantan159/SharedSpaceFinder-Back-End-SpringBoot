package com.example.sharedspacefinder.models;

import com.fasterxml.jackson.annotation.JsonIgnore;

import javax.persistence.*;
import java.sql.Date;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

@Entity
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "userID")
    private Integer id;
    @Column(name = "userName", length = 50)
    private String name;
    @Column(name = "gender")
    private Boolean gender;
    @Column(name = "dateOfBirth")
    private Date dateOfBirth;
    @Column(name = "phone", length = 11)
    private String phone;
    @Column(name = "email",unique = true,nullable = false)
    private String email;
    @Column(name = "avatarId")
    private String avatarId;
    @Column(name = "avatar")
    private String avatar;
    @Column(name = "province")
    private String province;
    @Column(name = "district")
    private String district;
    @Column(name = "ward")
    private String ward;
    @Column(name = "address")
    private String address;
    @Column(name = "password",nullable = false)
    @JsonIgnore
    private String password;
    @Column(name = "refreshToken")
    @JsonIgnore
    private String refreshToken;

    @ManyToMany(fetch = FetchType.EAGER )
    @JoinTable(name = "users_role", joinColumns = @JoinColumn(name = "users_id"), inverseJoinColumns = @JoinColumn(name = "role_id"))
    private Set<Role> roles = new HashSet<>();

    @OneToMany(mappedBy = "user", orphanRemoval = true)
    @JsonIgnore
    private List<Favourite> favourites = new ArrayList<>();

    @OneToMany(mappedBy = "ownerId", orphanRemoval = true, cascade = CascadeType.ALL)
    @JsonIgnore
    private List<Space> spaces = new ArrayList<>();

    public User() {
    }

    public User(Integer id, String name, Boolean gender) {
        this.id = id;
        this.name = name;
        this.gender = gender;
        this.dateOfBirth = dateOfBirth;
        this.phone = phone;
        this.email = email;
        this.password = password;
        this.avatar = avatar;
        this.province = province;
        this.district = district;
        this.ward = ward;
        this.address = address;
        this.roles = roles;
    }

    public User(Integer id, String name, Boolean gender, String phone, String email, String password, String province, String district, String ward, String address, Set<Role> roles) {
        this.id = id;
        this.name = name;
        this.gender = gender;
        this.phone = phone;
        this.email = email;
        this.password = password;
        this.province = province;
        this.district = district;
        this.ward = ward;
        this.address = address;
        this.roles = roles;
    }

    public User(String name, String email, String password, String province, String district, String ward, String address) {
        this.name = name;
        this.email = email;
        this.password = password;
        this.province = province;
        this.district = district;
        this.ward = ward;
        this.address = address;
    }


    public List<Space> getSpaces() {
        return spaces;
    }

    public void setSpaces(List<Space> spaces) {
        this.spaces = spaces;
    }

    public List<Favourite> getFavourites() {
        return favourites;
    }

    public void setFavourites(List<Favourite> favourites) {
        this.favourites = favourites;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Boolean getGender() {
        return gender;
    }

    public void setGender(Boolean gender) {
        this.gender = gender;
    }

    public Date getDateOfBirth() {
        return dateOfBirth;
    }

    public void setDateOfBirth(Date dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getAvatarId() {
        return avatarId;
    }

    public void setAvatarId(String avatarId) {
        this.avatarId = avatarId;
    }

    public String getAvatar() {
        return avatar;
    }

    public void setAvatar(String avatar) {
        this.avatar = avatar;
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

    public String getRefreshToken() {
        return refreshToken;
    }

    public void setRefreshToken(String refreshToken) {
        this.refreshToken = refreshToken;
    }

    public Set<Role> getRoles() {
        return roles;
    }

    public void setRoles(Set<Role> roles) {
        this.roles = roles;
    }
}
