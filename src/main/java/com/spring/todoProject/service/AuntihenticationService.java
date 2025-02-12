package com.spring.todoProject.service;

import org.springframework.stereotype.Service;

import java.security.PublicKey;

@Service
public class AuntihenticationService {

    public boolean authenticate (String userName, String userPassword){
        boolean isUserNameValid = userName.equalsIgnoreCase("dummy");
        boolean isPasswordValid = userPassword.equalsIgnoreCase("dummy");

        return isUserNameValid && isPasswordValid;
    }
}
