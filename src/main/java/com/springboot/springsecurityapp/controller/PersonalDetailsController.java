package com.springboot.springsecurityapp.controller;


import com.springboot.springsecurityapp.model.PersonalDetailsModel;
import com.springboot.springsecurityapp.service.PersonalDetailsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class PersonalDetailsController {

    @Autowired
    PersonalDetailsService personalDetailsService;

   /* public void addUserDetail(PersonalDetailsModel personalDetailsModel){
        personalDetailsService.addUserDetails(personalDetailsModel);
    }*/
}
