package com.example.onlinefoodapp.dao;
import com.example.onlinefoodapp.model.UserRegister;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@EnableJpaRepositories
public interface RegisterUserRepo extends JpaRepository<UserRegister, Long>{


}
