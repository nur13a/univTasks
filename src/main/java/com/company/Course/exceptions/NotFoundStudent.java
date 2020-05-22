package com.company.Course.exceptions;

public class NotFoundStudent extends Exception {
    private static final String message="Not Found Student. Please try again";
    public NotFoundStudent(){
        super(message);
    }
}
