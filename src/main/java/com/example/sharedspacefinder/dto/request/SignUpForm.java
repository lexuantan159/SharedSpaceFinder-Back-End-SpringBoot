package com.example.sharedspacefinder.dto.request;

import javax.validation.constraints.NotNull;

public class SignUpForm {

    @NotNull
    private String name;
    @NotNull
    private String email;
    @NotNull
    private String password;
    @NotNull
    private String province;
    @NotNull
    private String district;
    @NotNull
    private String ward;
    @NotNull
    private String address;


    public SignUpForm(String name, String email, String password, String province, String district, String ward, String address) {
        this.name = name;
        this.email = email;
        this.password = password;
        this.province = province;
        this.district = district;
        this.ward = ward;
        this.address = address;
    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
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

}
