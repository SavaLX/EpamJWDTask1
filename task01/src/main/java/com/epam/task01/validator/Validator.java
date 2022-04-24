package com.epam.task01.validator;

import com.epam.task01.service.exception.WrongInputDataException;

import java.util.Scanner;

public class Validator {
    private static final String UNEXPECTED_VALUE = "Unexpected value";

    public boolean validateInputInteger(Scanner sc) throws WrongInputDataException {
        if (!sc.hasNextInt()) {
            throw new WrongInputDataException(UNEXPECTED_VALUE);
        }
        return true;
    }

    public boolean validateInputDouble(Scanner sc) throws WrongInputDataException {
        if (!sc.hasNextDouble()) {
            throw new WrongInputDataException(UNEXPECTED_VALUE);
        }
        return true;
    }

    public boolean validateInputStrings(Scanner sc) throws WrongInputDataException {
        if (!sc.hasNextLine()) {
            throw new WrongInputDataException(UNEXPECTED_VALUE);
        }
        return true;
    }
}
