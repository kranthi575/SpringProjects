package com.example.onlinefoodapp.services;

import com.example.onlinefoodapp.model.UserLogin;

import java.util.Optional;

public interface IUserLogin {

    public Optional<UserLogin> validateUser(UserLogin userLogin);

}
