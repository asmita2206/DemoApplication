package com.springboot.springsecurityapp.controller;

import com.springboot.springsecurityapp.model.PersonalDetailsModel;
import com.springboot.springsecurityapp.model.TransactionDetailsModel;
import com.springboot.springsecurityapp.service.TransactionDetailsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.parameters.P;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import java.util.List;

@Controller
public class TransactionDetailsController {


    @Autowired
    TransactionDetailsService transactionDetailsService;

   /* @RequestMapping("/home")
    public String transactionDetails(Model m){
        TransactionDetailsModel transactionDetailsModel=new TransactionDetailsModel();
        PersonalDetailsModel personalDetailsModel=new PersonalDetailsModel();
        String accountNumber=personalDetailsModel.getAccountNumber();
        System.out.println(accountNumber);
        List<TransactionDetailsModel> transactionDetailsModels= transactionDetailsService.findByAccNumber(accountNumber);
        m.addAttribute("transactionDetailsModels",transactionDetailsModels);
        System.out.println(transactionDetailsModels);
         String accNum= transactionDetailsModel.getAccountNumber();
         System.out.println(accNum);

         return "home";

        if(accountNumber==accNum)
         {

         }

    }*/


}
