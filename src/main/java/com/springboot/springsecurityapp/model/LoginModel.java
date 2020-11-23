package com.springboot.springsecurityapp.model;

import javax.persistence.*;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Size;

@Entity
@Table(name = "user_login")
public class LoginModel {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "login_id")
    private int loginId;
    @Column(unique = true)
    @NotBlank(message = "UserName can not be empty!!")
    @Size(min = 3,max = 12,message = "User name must be between 3 - 12 characters !!")
    private String userName;
    @Column
    private String password;

   /* @OneToOne(mappedBy = "loginModel", cascade = CascadeType.ALL,
            fetch = FetchType.LAZY, optional = false)
    private PersonalDetailsModel details;*/

   /* @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "personal_id")
    private PersonalDetailsModel details; */

    public LoginModel() {
    }

    public LoginModel(@NotBlank(message = "UserName can not be empty!!") @Size(min = 3, max = 12, message = "User name must be between 3 - 12 characters !!") String userName, String password) {
        this.userName = userName;
        this.password = password;
    }

    public int getLoginId() {
        return loginId;
    }

    public void setLoginId(int loginId) {
        this.loginId = loginId;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }




    @Override
    public String toString() {
        return "LoginModel{" +
                "loginId=" + loginId +
                ", userName='" + userName + '\'' +
                ", password='" + password + '\'' +
                '}';
    }
}

