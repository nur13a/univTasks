package com.company.Course.exceptions;

public class NotFoundGroup extends Exception {
    private static final String message="Not Found Group. Please try again";
    public NotFoundGroup(){
        super(message);
    }
}
