package com.springboot.springsecurityapp.controller;

import com.springboot.springsecurityapp.model.LoginModel;
import com.springboot.springsecurityapp.model.PersonalDetailsModel;
import com.springboot.springsecurityapp.model.TransactionDetailsModel;
import com.springboot.springsecurityapp.repository.LoginRepo;
import com.springboot.springsecurityapp.service.LoginService;
import com.springboot.springsecurityapp.service.PersonalDetailsService;
import com.springboot.springsecurityapp.service.TransactionDetailsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;


import java.util.List;


@RestController
public class LoginController {


    @Autowired
    LoginService loginService;

    @Autowired
    PersonalDetailsService personalDetailsService;

    @Autowired
    TransactionDetailsService transactionDetailsService;

    @Autowired
    LoginRepo loginRepo;




   @RequestMapping("/login")
    public ModelAndView login() {
        ModelAndView mv = new ModelAndView("login");
        return mv;
    }



      @RequestMapping("/details")
      public ModelAndView userDetails(@RequestParam String userName, @RequestParam String password) {

        ModelAndView mv = new ModelAndView();
        String accountNumber = "";
        String name = "";
        String uname = "";
        String accNumber = "";
        LoginModel loginModel = new LoginModel();
        PersonalDetailsModel personalDetailsModel = new PersonalDetailsModel();
        TransactionDetailsModel transactionDetailsModel = new TransactionDetailsModel();
        List<LoginModel> loginModels = loginService.findByUname(userName);
        System.out.println(loginModels);
        for (LoginModel logind : loginModels) {
            LoginModel loginDetail = (LoginModel) logind;
            name = loginDetail.getUserName();
            System.out.println(name);
        }
        List<PersonalDetailsModel> detailsModels = personalDetailsService.findByUname(userName);

        System.out.println(detailsModels);


        StringBuffer personalDetails = new StringBuffer();

        for (PersonalDetailsModel personl : detailsModels) {
            PersonalDetailsModel personalDetail = (PersonalDetailsModel) personl;
            uname = personalDetail.getUserName();
            accountNumber = personalDetail.getAccountNumber();
            System.out.println(accountNumber);

            personalDetails.append("<td>"+personl.getName()+"<td>");
            personalDetails.append("<td>"+personl.getAccountNumber()+"<td>");
            personalDetails.append("<td>"+personl.getAccountBalance()+"<td>");


        }
        List<TransactionDetailsModel> transactionDetailsModels = transactionDetailsService.findByAccNumber(accountNumber);
        System.out.println(transactionDetailsModels);
        StringBuffer transactionDetails = new StringBuffer();

        for (TransactionDetailsModel transDetail : transactionDetailsModels) {
            TransactionDetailsModel transaDetail = (TransactionDetailsModel) transDetail;
            accNumber = transaDetail.getAccountNumber();
            System.out.println(accNumber);

            transactionDetails.append("<td>"+transDetail.getTransactionNumber()+"<td>");
            transactionDetails.append("<td>"+transDetail.getDiscription()+"<td>");
            transactionDetails.append("<td>"+transDetail.getTransactionDate()+"<td>");

        }


        if (name.equals(uname)) {
            if (accNumber.equals(accountNumber)) {
                mv.addObject("personalDetails", personalDetails.toString());
                mv.addObject("transactionDetails", transactionDetails.toString());
                 mv.setViewName("personalDetails");
            }
        } else {
              mv.setViewName("registration");

        }

        return mv;
    }
}

