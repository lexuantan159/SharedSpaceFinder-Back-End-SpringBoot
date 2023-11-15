package com.example.sharedspacefinder.dto.response.favoutite;

import com.example.sharedspacefinder.models.Favourite;

import java.util.List;

public class ListFavoriteResponse {
    private Integer error;
    private String message;
    private Integer totalFavourites;
    private List<Favourite> listFavourites;
    private Integer status;


    public ListFavoriteResponse() {
    }

    public ListFavoriteResponse(Integer error, String message, Integer totalFavourites, List<Favourite> listFavourites, Integer statusCode) {
        this.error = error;
        this.message = message;
        this.totalFavourites = totalFavourites;
        this.listFavourites = listFavourites;
        this.status = statusCode;
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

    public Integer getTotalFavourites() {
        return totalFavourites;
    }

    public void setTotalFavourites(Integer totalFavourites) {
        this.totalFavourites = totalFavourites;
    }

    public List<Favourite> getListFavourites() {
        return listFavourites;
    }

    public void setListFavourites(List<Favourite> listFavourites) {
        this.listFavourites = listFavourites;
    }

    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }
}
