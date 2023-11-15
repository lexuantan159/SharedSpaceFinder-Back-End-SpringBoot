package com.example.sharedspacefinder.dto.request;

import javax.validation.constraints.NotNull;

public class RefreshTokenForm {

    @NotNull
    String refreshToken;

    public RefreshTokenForm() {
    }

    public RefreshTokenForm(String refreshToken) {
        this.refreshToken = refreshToken;
    }

    public String getRefreshToken() {
        return refreshToken;
    }

    public void setRefreshToken(String refreshToken) {
        this.refreshToken = refreshToken;
    }
}
