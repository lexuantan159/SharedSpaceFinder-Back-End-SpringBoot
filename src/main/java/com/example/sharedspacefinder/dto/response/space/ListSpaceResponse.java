package com.example.sharedspacefinder.dto.response.space;


import com.example.sharedspacefinder.models.Space;

import java.util.List;

public class ListSpaceResponse {
    private Integer error;
    private String message;
    private Integer spaceQuantity;

    private List<Space> listSpaces;

    private Integer status;

    public ListSpaceResponse() {
    }


    public ListSpaceResponse(Integer error, String message, Integer spaceQuantity, Integer status) {
        this.error = error;
        this.message = message;
        this.spaceQuantity = spaceQuantity;
        this.status = status;
    }

    public ListSpaceResponse(Integer error, String message, Integer spaceQuantity, List<Space> listSpaces, Integer status) {
        this.error = error;
        this.message = message;
        this.spaceQuantity = spaceQuantity;
        this.listSpaces = listSpaces;
        this.status = status;
    }

    public Integer getSpaceQuantity() {
        return spaceQuantity;
    }

    public void setSpaceQuantity(Integer spaceQuantity) {
        this.spaceQuantity = spaceQuantity;
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

    public List<Space> getListSpaces() {
        return listSpaces;
    }

    public void setListSpaces(List<Space> listSpaces) {
        this.listSpaces = listSpaces;
    }

    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }
}
