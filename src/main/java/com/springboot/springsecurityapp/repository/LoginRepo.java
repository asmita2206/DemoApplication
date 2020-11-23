package com.springboot.springsecurityapp.repository;

import com.springboot.springsecurityapp.model.LoginModel;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public interface LoginRepo extends JpaRepository<LoginModel,Integer> {

    Optional<LoginModel> findByUserName(String userName);


     @Query("SELECT l FROM LoginModel l WHERE userName = ?1")
    List<LoginModel> findByUsername(String userName);

    // List<LoginModel> findAll();
}
