package com.company.Course.exceptions;

public class NotFoundTeacher extends Exception {
    private static final String message = "Not Found Teacher. PLease try again";

    public NotFoundTeacher() {
        super(message);
    }
}
