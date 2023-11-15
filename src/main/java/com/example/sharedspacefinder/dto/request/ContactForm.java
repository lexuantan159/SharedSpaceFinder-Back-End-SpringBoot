package com.example.sharedspacefinder.dto.request;

import javax.validation.constraints.NotNull;

public class ContactForm {
    @NotNull
    private  String lastName;
    @NotNull
    private String firstName;
    @NotNull
    private String email;
    @NotNull
    private String title;
    @NotNull
    private String content;

    public ContactForm() {
    }

    public ContactForm(String lastName, String firstName, String email, String title, String content) {
        this.lastName = lastName;
        this.firstName = firstName;
        this.email = email;
        this.title = title;
        this.content = content;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }
}
