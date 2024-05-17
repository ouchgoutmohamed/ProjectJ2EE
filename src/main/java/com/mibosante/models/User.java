package com.mibosante.models;


import com.mibosante.DAO.LoginDAO;

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
        this.name = LoginDAO.currentUserName;
    }

    public void setEmail(String email) {
        this.email = LoginDAO.currentUserEmail;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}
