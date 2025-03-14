package com.fiji.exceptionhandler.handler;

import lombok.Getter;
import org.springframework.http.HttpStatus;

import static org.springframework.http.HttpStatus.*;

public enum BusinessErrorCodes {

    NO_CODE(0, NOT_IMPLEMENTED, "No code"),
    ACCOUNT_LOCKED(302, FORBIDDEN, "Account locked"),
    ACCOUNT_DISABLED(303, FORBIDDEN, "Account disabled"),
    BAD_CREDENTIALS(304, FORBIDDEN, "Login and/or password is incorrect"),
    NEW_PASSWORD_DOESNT_MATCH(301, BAD_REQUEST, "New password does not match"),
    INCORRECT_CURRENT_PASSWORD(300, BAD_REQUEST, "Current password is incorrect"),
    ;
    @Getter
    final private int code;
    @Getter
    final private String description;
    @Getter
    final private HttpStatus httpStatus;

    BusinessErrorCodes(int code, HttpStatus httpStatus, String description) {
        this.code = code;
        this.description = description;
        this.httpStatus = httpStatus;
    }
}
