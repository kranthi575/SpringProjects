package com.example.onlinefoodapp.services;

import com.example.onlinefoodapp.dao.ValidateLoginRepo;
import com.example.onlinefoodapp.model.UserLogin;
import com.example.onlinefoodapp.model.UserRegister;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ValidateLoginSrv implements IValidateLogin{


   private final ValidateLoginRepo validateLoginRepo;

   @Autowired
   public  ValidateLoginSrv(ValidateLoginRepo validateLoginRepo){
    this.validateLoginRepo=validateLoginRepo;
   }

    @Override
    public String validateLoginUser(UserLogin userLogin) {

       validateLoginRepo.check(userLogin.getUserName());
       UserRegister userRegister = validateLoginRepo.findByEmail(userLogin.getUserName());

       if(userRegister==null){
           return "User not found or invalid mail ID";
       }else{
           System.out.println(userRegister.getPassword()+"::"+userLogin.getUserPassword());
           if(userRegister.getPassword().equals(userLogin.getUserPassword())){
               return "Valid user";
           }else{
               return "invalid password";
           }
       }
    }
}
