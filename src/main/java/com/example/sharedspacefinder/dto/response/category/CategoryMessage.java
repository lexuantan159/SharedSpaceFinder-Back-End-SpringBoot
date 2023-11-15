package com.example.sharedspacefinder.dto.response.category;

public class CategoryMessage {

    private  Integer error;
    private  String message;
    private CategoryItem categoryItem;
    private  Integer statusCode;

    public CategoryMessage() {
    }

    public CategoryMessage(Integer error, String message, CategoryItem categoryItem, Integer statusCode) {
        this.error = error;
        this.message = message;
        this.categoryItem = categoryItem;
        this.statusCode = statusCode;
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

    public CategoryItem getCategoryItem() {
        return categoryItem;
    }

    public void setCategoryItem(CategoryItem categoryItem) {
        this.categoryItem = categoryItem;
    }

    public Integer getStatusCode() {
        return statusCode;
    }

    public void setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
    }
}
