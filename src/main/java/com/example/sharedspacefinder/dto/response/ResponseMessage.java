package com.example.sharedspacefinder.dto.response;

import org.springframework.http.HttpStatus;

public class ResponseMessage {

    private  Integer error;
    private  String message;
    private  Integer statusCode;

    public ResponseMessage(String s, HttpStatus badRequest) {
    }

    public ResponseMessage(Integer error, String message, Integer statusCode) {
        this.error = error;
        this.message = message;
        this.statusCode = statusCode;
    }

    public Integer getError() {
        return error;
    }

    public void setError(Integer error) {
        this.error = error;
    }

    public Integer getStatusCode() {
        return statusCode;
    }

    public void setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }
}
