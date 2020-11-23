package com.springboot.springsecurityapp.service;

import com.springboot.springsecurityapp.model.LoginModel;
import com.springboot.springsecurityapp.model.UserDetailsImp;
import com.springboot.springsecurityapp.repository.LoginRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class MyUserDetailsService implements UserDetailsService {

    @Autowired
    LoginRepo loginRepo;
    @Override
    public UserDetails loadUserByUsername(String userName) throws UsernameNotFoundException {
        Optional<LoginModel> loginModel= loginRepo.findByUserName(userName);

        loginModel.orElseThrow(()->new UsernameNotFoundException("not found" + userName));
        /* if(loginModel==null)
              throw new UsernameNotFoundException("user not found" + loginModel);*/

        return loginModel.map(UserDetailsImp::new).get();
        //return new UserDetailsImp(loginModel);
    }
}
