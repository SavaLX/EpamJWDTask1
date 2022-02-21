package com.epam.task01.view;

import com.epam.task01.entity.ComfortTariff;
import com.epam.task01.service.exception.WrongInputDataException;
import com.epam.task01.validator.Validator;

import java.util.Scanner;

public class IOData {

    Validator validator = new Validator();
    Scanner sc = new Scanner(System.in);

    public void printInfoForUser(String str) {
        System.out.print(str);
    }

    public void printInfoForUserNextLine(String str) {
        System.out.println(str);
    }

    public void skipLine() {
        System.out.println();
    }

    public void printInfoAboutClass(ComfortTariff tariff) {
        System.out.println(tariff);
    }

    public int inPutIntegerFromUser() {
        try {
            validator.validateInputInteger(sc);
        } catch (WrongInputDataException e) {
            e.printStackTrace();
        }
        return sc.nextInt();
    }

    public double inPutDoubleFromUser() {
        try {
            validator.validateInputDouble(sc);
        } catch (WrongInputDataException e) {
            e.printStackTrace();
        }
        return sc.nextDouble();
    }

    public String inPutStringFromUser() {
        try {
            validator.validateInputStrings(sc);
        } catch (WrongInputDataException e) {
            e.printStackTrace();
        }
        return sc.nextLine();
    }
}
