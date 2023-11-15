package com.example.sharedspacefinder.dto.response.space;

import com.example.sharedspacefinder.models.Space;

public class SpaceResponse {

    private Integer error;
    private String message;
    private Space space;
    private Integer status;

    public SpaceResponse() {
    }

    public SpaceResponse(Integer error, String message, Integer status) {
        this.error = error;
        this.message = message;
        this.status = status;
    }

    public SpaceResponse(Integer error, String message, Space space, Integer status) {
        this.error = error;
        this.message = message;
        this.space = space;
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

    public Space getSpace() {
        return space;
    }

    public void setSpace(Space space) {
        this.space = space;
    }

    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }
}
