package com.springboot.springsecurityapp.model;


import com.springboot.springsecurityapp.model.LoginModel;

import javax.persistence.*;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Size;

@Entity
@Table(name = "personal_details")
public class PersonalDetailsModel {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column
    private int personal_id;
    @Column(name = "name")
    private String name;
    @Column(name = "account_number")
    private String accountNumber;
    @Column(name = "account_balance")
    private String accountBalance;
    @Column(unique = true)
    @NotBlank(message = "UserName can not be empty!!")
    @Size(min = 3,max = 12,message = "User name must be between 3 - 12 characters !!")
    private String userName;

   /* @OneToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "login_id")
    private LoginModel loginModel;*/


   /* @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "login_id")
    private LoginModel loginModel;*/


    public PersonalDetailsModel() {
    }

    public PersonalDetailsModel(String name, String accountNumber, String accountBalance, @NotBlank(message = "UserName can not be empty!!") @Size(min = 3, max = 12, message = "User name must be between 3 - 12 characters !!") String userName) {
        this.name = name;
        this.accountNumber = accountNumber;
        this.accountBalance = accountBalance;
        this.userName = userName;
    }

    public int getPersonal_id() {
        return personal_id;
    }

    public void setPersonal_id(int personal_id) {
        this.personal_id = personal_id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAccountNumber() {
        return accountNumber;
    }

    public void setAccountNumber(String accountNumber) {
        this.accountNumber = accountNumber;
    }

    public String getAccountBalance() {
        return accountBalance;
    }

    public void setAccountBalance(String accountBalance) {
        this.accountBalance = accountBalance;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }



    @Override
    public String toString() {
        return "PersonalDetailsModel{" +
                "personal_id=" + personal_id +
                ", name='" + name + '\'' +
                ", accountNumber='" + accountNumber + '\'' +
                ", accountBalance='" + accountBalance + '\'' +
                ", userName='" + userName + '\'' +
                '}';
    }
}
