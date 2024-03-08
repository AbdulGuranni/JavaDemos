package com.voterapp.client;
import com.voterapp.service.ElectionBoothServiceImpl;
import com.voterapp.service.IElectionBoothService;

import java.util.Scanner;
public class Voter {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the age");
        int age = sc.nextInt();
        System.out.println("Enter voterId");
        int vid = sc.nextInt();
        System.out.println("Enter locality");
        String locality = sc.next();

        IElectionBoothService electionBoothService = new ElectionBoothServiceImpl();
        try{
            if(electionBoothService.checkEligibility(age,locality,vid)){
                System.out.println("You are eligible to vote");
            }
        }catch (Exception e){
            System.out.println(e.getMessage());
        }
    }
}
