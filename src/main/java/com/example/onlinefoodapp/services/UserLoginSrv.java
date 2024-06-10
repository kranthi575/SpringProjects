package com.example.onlinefoodapp.services;

import com.example.onlinefoodapp.dao.LoginUserRepo;
import com.example.onlinefoodapp.model.UserLogin;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class UserLoginSrv implements IUserLogin{

    public LoginUserRepo loginUserRepo;


    @Override
    public Optional<UserLogin> validateUser(UserLogin userLogin) {

        Optional<UserLogin> user=loginUserRepo.findByEmail(userLogin.getUserName());
        return user;
    }
}
