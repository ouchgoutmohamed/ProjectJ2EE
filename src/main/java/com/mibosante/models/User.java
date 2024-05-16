package com.mibosante.models;



public class User {
    private String name;
    private String email;
    private String password;

    // Getters
    public String getName() {
        return name;
    }

    public String getEmail() {
        return email;
    }

    public String getPassword() {
        return password;
    }

    // Setters
    public void setName(String name) {
        this.name = Login.currentUserName;
    }

    public void setEmail(String email) {
        this.email = Login.currentUserEmail;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}