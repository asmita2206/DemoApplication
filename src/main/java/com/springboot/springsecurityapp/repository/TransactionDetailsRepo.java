package com.springboot.springsecurityapp.repository;

import com.springboot.springsecurityapp.model.TransactionDetailsModel;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface TransactionDetailsRepo extends JpaRepository<TransactionDetailsModel,Integer> {

    List<TransactionDetailsModel> findByAccountNumber(String accountNumber);
}
