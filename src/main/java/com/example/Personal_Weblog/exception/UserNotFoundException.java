package com.example.Personal_Weblog.exception;

public class UserNotFoundException extends RuntimeException{

    private final String username;
    public UserNotFoundException(String username) {
        this.username = username;
    }

}
