package com.springboot.springsecurityapp.service;

import com.springboot.springsecurityapp.model.LoginModel;
import com.springboot.springsecurityapp.repository.LoginRepo;
import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class LoginService {

    @Autowired
    LoginRepo loginRepo;

    public void addLoginUser(LoginModel loginModel) {
        loginRepo.save(loginModel);
    }


    public List<LoginModel> findByUname(String userName) {

        return loginRepo.findByUsername(userName);

    }
}