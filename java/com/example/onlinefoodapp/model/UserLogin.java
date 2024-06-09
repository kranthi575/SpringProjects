package com.example.onlinefoodapp.model;


import java.util.UUID;

public class UserLogin {

    //default constructor
    public UserLogin(){
        this.id=UUID.randomUUID();
    }
    private UUID id;
    private String userName;
    private  String userPassword;

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getUserPassword() {
        return userPassword;
    }

    public void setUserPassword(String userPassword) {
        this.userPassword = userPassword;
    }
    public UUID getId() {
        return id;
    }

    public void setId(UUID id) {
        this.id = id;
    }
}
