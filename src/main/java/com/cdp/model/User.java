package com.cdp.model;

public class User {
    private String phoneOrEmail;
    private String fullName;
    private String username;
    private String password;

    public User(String phoneOrEmail, String fullName, String username, String password){
        this.fullName = fullName;
        this.username = username;
        this.phoneOrEmail = phoneOrEmail;
        this.password = password;
    }


    public String getPhoneOrEmail() {
        return phoneOrEmail;
    }

    public void setPhoneOrEmail(String phoneOrEmail) {
        this.phoneOrEmail = phoneOrEmail;
    }

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}
