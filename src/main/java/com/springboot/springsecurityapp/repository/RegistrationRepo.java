package com.springboot.springsecurityapp.repository;

import com.springboot.springsecurityapp.model.RegistrationModel;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface RegistrationRepo extends JpaRepository<RegistrationModel,Integer> {

    // @Query("SELECT u FROM RegistrationModel u WHERE userName = ?1 AND password = ?2")
    // List<RegistrationModel> findByUsernameAndPassword(String userName, String password);

}
