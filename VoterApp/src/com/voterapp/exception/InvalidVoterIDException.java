package com.voterapp.exception;

public class InvalidVoterIDException extends NotEligibleException{
    public InvalidVoterIDException() {
        super();
    }

    public InvalidVoterIDException(String message) {
        super(message);
    }
}
