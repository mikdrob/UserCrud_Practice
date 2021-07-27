package com.example.demo.dto;

import org.hibernate.validator.constraints.Length;

import javax.persistence.Column;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotNull;

public class UserDto {
    @NotNull(message = "username is required.")
    @Length(min=1, max=30)
    private String username;

    @Length(min=1, max=30)
    @NotNull(message = "first name is required.")
    private String firstName;


    @Length(min=1, max=30)
    @NotNull(message = "last name is required.")
    private String lastName;

    @Length(min=1, max=30)
    @NotNull(message = "email is required.")
    private String email;

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
}
