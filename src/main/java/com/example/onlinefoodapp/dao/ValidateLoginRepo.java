package com.example.onlinefoodapp.dao;

import com.example.onlinefoodapp.model.UserLogin;
import com.example.onlinefoodapp.model.UserRegister;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.data.repository.query.Param;

@EnableJpaRepositories
public interface ValidateLoginRepo extends JpaRepository<UserRegister,Long> {

    public UserRegister findByEmail(String email);

    default void check(String email){
        System.out.println("Email passed to repo:"+email);
    }
}
