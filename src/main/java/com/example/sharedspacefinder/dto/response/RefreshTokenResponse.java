package com.example.sharedspacefinder.dto.response;

public class RefreshTokenResponse {

    private String message;
    private String newAccessToken;

    public RefreshTokenResponse(String message, String newAccessToken) {
        this.message = message;
        this.newAccessToken = newAccessToken;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public String getNewAccessToken() {
        return newAccessToken;
    }

    public void setNewAccessToken(String newAccessToken) {
        this.newAccessToken = newAccessToken;
    }
}
