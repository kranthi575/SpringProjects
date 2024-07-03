package com.example.onlinefoodapp.controller;

import com.example.onlinefoodapp.model.UserLogin;
import com.example.onlinefoodapp.model.UserRegister;
import com.example.onlinefoodapp.services.IRegisterUser;
import com.example.onlinefoodapp.services.IValidateLogin;
import com.example.onlinefoodapp.services.RegisterUserSrv;
import com.example.onlinefoodapp.services.ValidateLoginSrv;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@CrossOrigin(origins = "http://localhost:1234/" )
@RequestMapping("")
public class Controller {


  private IRegisterUser registerUserSrv;
  private  IValidateLogin validateLoginSrv;

  @Autowired
  public Controller(RegisterUserSrv registerUserSrv,ValidateLoginSrv validateLoginSrv){

      this.registerUserSrv=registerUserSrv;
      this.validateLoginSrv=validateLoginSrv;
  }


    @PostMapping("/register")
    public String register(@RequestBody UserRegister userRegister){

        System.out.println("Data from React app::");
        System.out.println("UserName:"+userRegister.getName());
        System.out.println("UserEmail: "+userRegister.getEmail());
        System.out.println("UserPassword"+userRegister.getPassword());
        System.out.println("UserPhone"+userRegister.getPhone());
        UserRegister userReg=registerUserSrv.registerUser(userRegister);
        return "registered successfully!";
//        if(userReg!=null){
//        return ResponseEntity.ok("Registered successfully! Redirecting to login page.");
//        } else {
//            return ResponseEntity.badRequest().body("Registration failed.");
//        }
    }

    @PostMapping("/login")
    public String validateLogin(@RequestBody UserLogin userLogin){


      System.out.println("UserLogin::Data");
      System.out.println("UserName:"+userLogin.getUserName());
      System.out.println("UserPassword:"+userLogin.getUserPassword());

      String validateMsg=validateLoginSrv.validateLoginUser(userLogin);
      System.out.println(validateMsg);
      return validateMsg;
    }
}
