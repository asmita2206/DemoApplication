package com.springboot.springsecurityapp.model;

import javax.persistence.*;
import javax.validation.constraints.Email;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Size;

@Entity
@Table(name ="user_register" )
public class RegistrationModel {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column
    private Integer id;
    @Column
    @NotBlank(message = "Name can not be empty!!")
    private String uName;
    @Column
    @Email(regexp= "^[a-zA-Z0-9+_.-]+@[a-zA-Z0-9.-]+$")
    private String emailId;
    @Column
    @NotBlank(message = "city can not be empty!!")
    private String city;
    @Column(unique = true)
    @NotBlank(message = "UserName can not be empty!!")
    @Size(min = 3,max = 12,message = "User name must be between 3 - 12 characters !!")
    private String userName;
    @Column
    private String password;

    public RegistrationModel() {
    }

    public RegistrationModel(Integer id, @NotBlank(message = "Name can not be empty!!") String uName, @Email(regexp = "^[a-zA-Z0-9+_.-]+@[a-zA-Z0-9.-]+$") String emailId, @NotBlank(message = "city can not be empty!!") String city, @NotBlank(message = "UserName can not be empty!!") @Size(min = 3, max = 12, message = "User name must be between 3 - 12 characters !!") String userName, String password) {
        this.id = id;
        this.uName = uName;
        this.emailId = emailId;
        this.city = city;
        this.userName = userName;
        this.password = password;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getuName() {
        return uName;
    }

    public void setuName(String uName) {
        this.uName = uName;
    }

    public String getEmailId() {
        return emailId;
    }

    public void setEmailId(String emailId) {
        this.emailId = emailId;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
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
        return "RegistrationModel{" +
                "id=" + id +
                ", uName='" + uName + '\'' +
                ", emailId='" + emailId + '\'' +
                ", city='" + city + '\'' +
                ", userName='" + userName + '\'' +
                ", password='" + password + '\'' +
                '}';
    }
}
