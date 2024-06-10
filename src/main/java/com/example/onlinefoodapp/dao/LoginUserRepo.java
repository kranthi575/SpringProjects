package com.example.onlinefoodapp.dao;

import com.example.onlinefoodapp.model.UserLogin;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

import java.util.Optional;

public interface LoginUserRepo extends JpaRepository<UserLogin,Long> {

    Optional<UserLogin> findByEmail(String email);
}
