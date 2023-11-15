package com.example.sharedspacefinder.dto.response.user;

import com.example.sharedspacefinder.models.User;

public class UpdateAnDeleteUserResponse {
    private Integer error;
    private String message;
    private User user;
    private Integer status;

    public UpdateAnDeleteUserResponse() {
    }

    public UpdateAnDeleteUserResponse(Integer error, String message, User user, Integer status) {
        this.error = error;
        this.message = message;
        this.user = user;
        this.status = status;
    }

    public UpdateAnDeleteUserResponse(Integer error, String message, Integer status) {
        this.error = error;
        this.message = message;
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

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }
}
