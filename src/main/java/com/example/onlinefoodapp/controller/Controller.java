package com.example.onlinefoodapp.controller;

import com.example.onlinefoodapp.model.UserLogin;
import com.example.onlinefoodapp.model.UserRegister;
import com.example.onlinefoodapp.services.IRegisterUser;
import com.example.onlinefoodapp.services.IUserLogin;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@CrossOrigin(origins = "http://localhost:1234/")
@RequestMapping("")
public class Controller {

  private final  IRegisterUser registerUserSrv;
  private final IUserLogin userLogin;

  @Autowired
    public Controller(IRegisterUser registerUserSrv,IUserLogin userLogin) {
        this.registerUserSrv = registerUserSrv;
        this.userLogin=userLogin;
    }



    @PostMapping("/login")
    public ResponseEntity<UserLogin>  login(@RequestBody UserLogin user){

        System.out.println("Data from react app:");
        System.out.println("Usrname from react app:"+user.getUserName());
        System.out.println("UserPasswprd from react app,"+user.getUserPassword());

        return userLogin.validateUser(user)
                .map(user1-> new ResponseEntity(user1, HttpStatus.OK))
                .orElse(new ResponseEntity<>(HttpStatus.NOT_FOUND));
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
