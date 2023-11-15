package com.example.sharedspacefinder.dto.response.category;

import java.util.List;

public class CategoriesResponse {
    private Integer error;
    private String message;
    private List<CategoryItem> listCategories;
    private Integer status;


    public CategoriesResponse() {
    }

    public CategoriesResponse(Integer error, String message, List<CategoryItem> listCategories, Integer status) {
        this.error = error;
        this.message = message;
        this.listCategories = listCategories;
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

    public List<CategoryItem> getListCategories() {
        return listCategories;
    }

    public void setListCategories(List<CategoryItem> listCategories) {
        this.listCategories = listCategories;
    }

    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }
}
