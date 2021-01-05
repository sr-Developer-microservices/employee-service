package com.employeemanagement.rohit.exception;

public class ValidationException extends Exception {

    private final String msg;

    public ValidationException(String msg) {
        super(msg);
        this.msg = msg;
    }

    public String getMessage() {
        String result;

        if (this.msg != null && !this.msg.isEmpty()) {
            result = this.msg;
        } else {
            result = super.getMessage();
        }

        return result;
    }
}
