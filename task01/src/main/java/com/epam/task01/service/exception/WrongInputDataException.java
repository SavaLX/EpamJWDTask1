package com.epam.task01.service.exception;

/**
 * Class - exception which use when user input wrong data
 */
public class WrongInputDataException extends Exception {

    public WrongInputDataException() {
    }

    public WrongInputDataException(String message) {
        super(message);
    }

    public WrongInputDataException(String message, Throwable cause) {
        super(message, cause);
    }

    public WrongInputDataException(Throwable cause) {
        super(cause);
    }

    public WrongInputDataException(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
        super(message, cause, enableSuppression, writableStackTrace);
    }
}
