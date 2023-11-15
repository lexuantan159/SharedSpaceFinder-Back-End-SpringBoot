package com.example.sharedspacefinder.dto.response.user;

import com.example.sharedspacefinder.models.User;

import java.util.List;

public class ListUsersResponse {

    private Integer error;
    private String message;
    private List<User> listUsers;
    private Integer status;

    public ListUsersResponse() {
    }

    public ListUsersResponse(Integer error, String message, List<User> listUsers, Integer status) {
        this.error = error;
        this.message = message;
        this.listUsers = listUsers;
        this.status = status;
    }

    public Integer getError() {
        return error;
    }

    public void setError(Integer error) {
        this.error = error;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public List<User> getListUsers() {
        return listUsers;
    }

    public void setListUsers(List<User> listUsers) {
        this.listUsers = listUsers;
    }

    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }
}
