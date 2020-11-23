package com.springboot.springsecurityapp.service;

import com.springboot.springsecurityapp.model.TransactionDetailsModel;
import com.springboot.springsecurityapp.repository.TransactionDetailsRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TransactionDetailsService {

    @Autowired
    TransactionDetailsRepo transactionDetailsRepo;



    public List<TransactionDetailsModel> findByAccNumber(String accountNumber)
    {
        return transactionDetailsRepo.findByAccountNumber(accountNumber);
    }
}
