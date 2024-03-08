package com.userapp.client;
import com.userapp.exception.NameExistsException;
import com.userapp.exception.TooLongException;
import com.userapp.exception.TooShortException;
import com.userapp.service.IValidationService;
import com.userapp.service.ValidationServiceImpl;

import java.util.Scanner;
public class Registration {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter username");
        String username = sc.next();
        IValidationService validationService = new ValidationServiceImpl();
        try {
            if (validationService.validateUsername(username)) {
                System.out.println("Welcome " + username + "You are registered");
                System.out.println("Enter password");
                String password = sc.next();
                if (validationService.validatePassword(password)) {
                    System.out.println("You have entered correct password");
                }
            }
        }
//        }catch (TooLongException | TooShortException e){
//            System.out.println(e.getMessage());
//            e.printStackTrace();
//        }
        catch (Exception e){
            System.out.println(e.getMessage());
            e.printStackTrace();
        }
    }
}
