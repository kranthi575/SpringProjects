package com.example.onlinefoodapp.dao;

import com.example.onlinefoodapp.model.UserLogin;
import org.springframework.data.jpa.repository.JpaRepository;

public interface LoginUserRepo extends JpaRepository<UserLogin,Long> {
}
