package com.springboot.springsecurityapp.service;

import com.springboot.springsecurityapp.model.LoginModel;
import com.springboot.springsecurityapp.model.PersonalDetailsModel;
import com.springboot.springsecurityapp.repository.PersonalDetailsRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PersonalDetailsService {

    @Autowired
    PersonalDetailsRepo personalDetailsRepo;

   /* public void addUserDetails(PersonalDetailsModel personalDetailsModel) {
        personalDetailsRepo.save(personalDetailsModel);
    }*/


    public List<PersonalDetailsModel> findByUname(String userName) {

        return personalDetailsRepo.findByUsername(userName);

    }
}
