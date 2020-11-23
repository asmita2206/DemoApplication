package com.springboot.springsecurityapp.controller;

import com.springboot.springsecurityapp.model.LoginModel;
import com.springboot.springsecurityapp.model.RegistrationModel;
import com.springboot.springsecurityapp.service.LoginService;
import com.springboot.springsecurityapp.service.RegistrationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class RegistrationController {

    @Autowired
    RegistrationService registrationService;

    @Autowired
    LoginService loginService;

    @RequestMapping("/register")
    public ModelAndView registration() {
        ModelAndView mav = new ModelAndView("registration");
        mav.addObject("RegistrationModel", new RegistrationModel());
        return mav;
    }

    @RequestMapping("/password")
    public ModelAndView addUsers( RegistrationModel registrationModel) {
        ModelAndView mav = new ModelAndView("password");
        LoginModel loginModel=new LoginModel();
        String pass = registrationService.generatePassword(8);
        registrationModel.setPassword(pass);
        registrationService.addUser(registrationModel);
        mav.addObject("RegistrationModel",new RegistrationModel());

        String uname=registrationModel.getUserName();
        String password=registrationModel.getPassword();
        loginModel.setUserName(uname);
        loginModel.setPassword(password);
        loginService.addLoginUser(loginModel);
        mav.addObject("LoginModel",new LoginModel());

        return mav;
    }


   /* @RequestMapping("/home")
    public String loginVerify(@RequestParam String userName, @RequestParam String password)
    {
        //ModelAndView mv=new ModelAndView();
        List<UserRegistrationModel> userRegistrationModel =userRegistrationService.findByUnamePassword(userName, password);
        System.out.println( userRegistrationModel);
        //mv.addObject(userRegistration);
        if (userRegistrationModel==null)
        {
            //ModelAndView mod = new ModelAndView("registration");
            return "registration";
            //System.out.println("done");
        }
        else
        {
            // ModelAndView mod = new ModelAndView("home")

            // System.out.println("error");
            return "home";
        }
    }*/

}
