package com.devattom.ThymeleafSpring.model;

import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Pattern;
import jakarta.validation.constraints.Size;

import java.util.List;

public class Student {
    private String firstName;
    private String lastName;
    private String country;
    private String postalCode;
    private String favoriteLanguage;
    private List<String> favoriteSystem;

    public Student() {}

    public String getFirstName() {
        return firstName;
    }

    @NotNull(message = "is required")
    @Size(min = 1, message = "is required")
    public String getLastName() {
        return lastName;
    }

    @Pattern(regexp = "^[0-9]{5}", message = "postal code must contains 5 digits")
    public String getPostalCode() {
        return postalCode;
    }

    public void setPostalCode(String postalCode) {
        this.postalCode = postalCode;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public String getFavoriteLanguage() {
        return favoriteLanguage;
    }

    public void setFavoriteLanguage(String favoriteLanguage) {
        this.favoriteLanguage = favoriteLanguage;
    }

    public List<String> getFavoriteSystem() {
        return favoriteSystem;
    }

    public void setFavoriteSystem(List<String> favoriteSystem) {
        this.favoriteSystem = favoriteSystem;
    }
}
