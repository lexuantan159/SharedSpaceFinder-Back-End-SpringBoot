package com.example.sharedspacefinder.dto.response.favoutite;

import com.example.sharedspacefinder.models.Favourite;

public class FavoriteResponse {

    private Integer error;
    private String message;
    private Boolean isSaved;
    private Favourite favorite;
    private Integer status;

    public FavoriteResponse() {
    }

    public FavoriteResponse(Integer error, String message,Boolean isSaved, Favourite favorite, Integer statusCode) {
        this.error = error;
        this.message = message;
        this.isSaved = isSaved;
        this.favorite = favorite;
        this.status = statusCode;
    }

    public FavoriteResponse(Integer error, String message,Boolean isSaved,  Integer statusCode) {
        this.error = error;
        this.message = message;
        this.isSaved = isSaved;
        this.status = statusCode;
    }


    public Boolean getSaved() {
        return isSaved;
    }

    public void setSaved(Boolean saved) {
        isSaved = saved;
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

    public Favourite getFavorite() {
        return favorite;
    }

    public void setFavorite(Favourite favorite) {
        this.favorite = favorite;
    }

    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }
}
