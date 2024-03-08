package com.voterapp.service;

import com.voterapp.exception.InvalidVoterIDException;
import com.voterapp.exception.LocalityNotFoundException;
import com.voterapp.exception.NotEligibleException;
import com.voterapp.exception.UnderAgeException;

public class ElectionBoothServiceImpl implements IElectionBoothService {
    @Override
    public boolean checkEligibility(int age, String locality, int vid) throws NotEligibleException{
        checkAge(age);
        checkLocality(locality);
        checkVoterID(vid);
        return false;
    }

    private boolean checkAge(int age) throws UnderAgeException {
        if(age<18)
            throw new UnderAgeException("Age is below 18");
        else
            return true;
    }

    private boolean checkLocality(String locality) throws LocalityNotFoundException {
        String[] localities = {"JP Nagar","ABC Nagar","Whitefield"};
        for(String myLocallity:localities){
            if(myLocallity.equals(locality)){
                System.out.println("Locality is available");
            }
            else
                throw new LocalityNotFoundException("No locality Available");
        }
        return true;
    }

    private boolean checkVoterID(int voterId) throws InvalidVoterIDException{
        if(voterId<1000 || voterId>9999)
            throw new InvalidVoterIDException("Invalid VoterId");
        else
            return true;
    }

}
