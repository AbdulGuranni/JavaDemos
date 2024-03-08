package com.userapp.service;

import com.userapp.exception.NameExistsException;
import com.userapp.exception.TooLongException;
import com.userapp.exception.TooShortException;

public class ValidationServiceImpl implements IValidationService {

    @Override
    public boolean validatePassword(String password) throws TooShortException, TooLongException {
        if(password.length()<6){
            throw new TooShortException("Password is too short");
        } else if (password.length()>15) {
            throw new TooLongException("Password is too long");
        }else{
            return true;
        }
    }

    @Override
    public boolean validateUsername(String username) throws NameExistsException {
        String[] usernames = {"Abdul", "Gokul", "Hitaishi", "Divya"};
        for ( String usernamee : usernames) {
            if (usernamee.equals(username)) {
                throw new NameExistsException("Name already exists");
            }
        }
        return true;
    }
}
