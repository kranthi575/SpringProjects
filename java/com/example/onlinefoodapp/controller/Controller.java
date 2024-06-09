package com.example.onlinefoodapp.controller;

import com.example.onlinefoodapp.model.UserLogin;
import com.example.onlinefoodapp.model.UserRegister;
import com.example.onlinefoodapp.services.IRegisterUser;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@CrossOrigin(origins = "http://localhost:1234/")
@RequestMapping("")
public class Controller {

  private final  IRegisterUser registerUserSrv;

  @Autowired
    public Controller(IRegisterUser registerUserSrv) {
        this.registerUserSrv = registerUserSrv;
    }


    @PostMapping("/login")
    public String login(@RequestBody UserLogin user){

        System.out.println("Usrname from react app:"+user.getUserName());
        System.out.println("UserPasswprd from react app,"+user.getUserPassword());

        return "login successfull!!";

    }

    @PostMapping("/register")
    public String register(@RequestBody UserRegister userRegister){

        System.out.println("Data from React app::");
        System.out.println("UserName:"+userRegister.getName());
        System.out.println("UserEmail: "+userRegister.getEmail());
        System.out.println("UserPassword"+userRegister.getPassword());
        System.out.println("UserPhone"+userRegister.getPhone());

        return registerUserSrv.registerUser(userRegister);
    }
}
