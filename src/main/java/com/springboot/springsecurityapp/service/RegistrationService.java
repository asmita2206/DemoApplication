package com.springboot.springsecurityapp.service;

import com.springboot.springsecurityapp.model.RegistrationModel;
import com.springboot.springsecurityapp.repository.RegistrationRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Random;

@Service
public class RegistrationService {

    @Autowired
    RegistrationRepo registrationRepo;

    public void addUser(RegistrationModel registrationModel) {

        registrationRepo.save(registrationModel);

    }

    public static String generatePassword(int length) {
        String capitalCaseLetters = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
        String lowerCaseLetters = "abcdefghijklmnopqrstuvwxyz";
        String specialCharacters = "!@#$";
        String numbers = "1234567890";
        String combinedChars = capitalCaseLetters + lowerCaseLetters + specialCharacters + numbers;
        Random random = new Random();
        char[] password = new char[length];

        password[0] = lowerCaseLetters.charAt(random.nextInt(lowerCaseLetters.length()));
        password[1] = capitalCaseLetters.charAt(random.nextInt(capitalCaseLetters.length()));
        password[2] = specialCharacters.charAt(random.nextInt(specialCharacters.length()));
        password[3] = numbers.charAt(random.nextInt(numbers.length()));

        for (int i = 4; i < length; i++) {
            password[i] = combinedChars.charAt(random.nextInt(combinedChars.length()));
        }
        String string = String.valueOf(password);
        return string;
    }


   /* public List<RegistrationModel> findByUnamePassword(String userName, String password) {

        return registrationRepo.findByUsernameAndPassword(userName, password);

    } */

}
