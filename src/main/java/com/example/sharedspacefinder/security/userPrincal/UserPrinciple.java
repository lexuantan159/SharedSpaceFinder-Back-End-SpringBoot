package com.example.sharedspacefinder.security.userPrincal;

import com.example.sharedspacefinder.models.User;
import com.fasterxml.jackson.annotation.JsonIgnore;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;

import java.util.Collection;
import java.util.Date;
import java.util.List;
import java.util.stream.Collectors;

public class UserPrinciple implements UserDetails {

    private Integer id;
    private String name;
    private Boolean gender;
    private Date dateOfBirth ;
    private String email;
    private String phone;
    private String avatar;
    private String province;
    private String district;
    private String ward;
    private String address;
    private Collection<? extends  GrantedAuthority> role;
    @JsonIgnore
    private String password;

    @Override
    public Collection<? extends GrantedAuthority> getAuthorities() {
        return role;
    }

    public UserPrinciple(Integer id, String name, Boolean gender, Date dateOfBirth, String email, String phone, String password, String avatar, String province, String district, String ward, String address, Collection<? extends GrantedAuthority> role) {
        this.id = id;
        this.name = name;
        this.gender = gender;
        this.dateOfBirth = dateOfBirth;
        this.email = email;
        this.phone = phone;
        this.password = password;
        this.avatar = avatar;
        this.province = province;
        this.district = district;
        this.ward = ward;
        this.address = address;
        this.role = role;
    }

    public UserPrinciple(String email, Collection<? extends GrantedAuthority> role) {

        this.email = email;
        this.role = role;
    }

    public static UserPrinciple build(User user) {
        // convert set  to list syntax
        List<GrantedAuthority> authorities = user.getRoles().stream().map(role -> new SimpleGrantedAuthority(role.getRoleValue())).collect(Collectors.toList());
        return new UserPrinciple(
                user.getId(),
                user.getName(),
                user.getGender(),
                user.getDateOfBirth(),
                user.getEmail(),
                user.getPhone(),
                user.getPassword(),
                user.getAvatar(),
                user.getProvince(),
                user.getDistrict(),
                user.getWard(),
                user.getAddress(),
                authorities
        );
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    @Override
    public String getPassword() {
        return password;
    }

    @Override
    public String getUsername() {
        return email;
    }

    @Override
    public boolean isAccountNonExpired() {
        return true;
    }

    @Override
    public boolean isAccountNonLocked() {
        return true;
    }

    @Override
    public boolean isCredentialsNonExpired() {
        return true;
    }

    @Override
    public boolean isEnabled() {
        return true;
    }
}
