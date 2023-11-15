package com.example.sharedspacefinder.models;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Role {
    @Id
    @Column(name = "roleCode" , length = 10)
    private String roleCode;
    @Column(name = "roleValue" , length = 10)
    private String roleValue;

    public Role() {
    }
    public Role(String roleCode, String roleValue) {
        this.roleCode = roleCode;
        this.roleValue = roleValue;
    }

    public String getRoleCode() {
        return roleCode;
    }

    public void setRoleCode(String roleCode) {
        this.roleCode = roleCode;
    }

    public String getRoleValue() {
        return roleValue;
    }

    public void setRoleValue(String roleValue) {
        this.roleValue = roleValue;
    }
}
