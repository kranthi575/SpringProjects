package com.example.onlinefoodapp.services;

import com.example.onlinefoodapp.dao.RegisterUserRepo;
import com.example.onlinefoodapp.model.UserRegister;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class RegisterUserSrv implements IRegisterUser{

   private  final RegisterUserRepo registerUserRepo;

   @Autowired
    public RegisterUserSrv(RegisterUserRepo registerUserRepo) {
        this.registerUserRepo = registerUserRepo;

    }

    @Override
    public String registerUser(UserRegister userRegister) {
        System.out.println("RegisterUSer service");
       System.out.println(registerUserRepo.save(userRegister));
        return "User registered successfully!!";
    }
}
