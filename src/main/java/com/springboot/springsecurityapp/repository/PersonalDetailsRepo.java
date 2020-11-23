package com.springboot.springsecurityapp.repository;

import com.springboot.springsecurityapp.model.LoginModel;
import com.springboot.springsecurityapp.model.PersonalDetailsModel;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface PersonalDetailsRepo extends JpaRepository<PersonalDetailsModel,Integer> {

    @Query("SELECT p FROM PersonalDetailsModel p WHERE userName = ?1")
    List<PersonalDetailsModel> findByUsername(String userName);
}
