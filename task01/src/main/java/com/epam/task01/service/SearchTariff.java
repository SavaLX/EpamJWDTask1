package com.epam.task01.service;

import com.epam.task01.entity.ComfortL;
import com.epam.task01.entity.ComfortM;
import com.epam.task01.entity.ComfortTariff;
import com.epam.task01.entity.ComfortXL;
import com.epam.task01.entity.ListOfComfortTariffs;
import com.epam.task01.service.exception.WrongInputDataException;
import com.epam.task01.validator.Validator;
import com.epam.task01.view.IOData;

import java.util.List;

/**
 * SearchTariff is a class for finding all matching tariffs based on user-specified parameters
 */
public class SearchTariff {
    /**
     * Method for finding all matching tariffs by input value of parameters by user.
     * Available parameters: internet, subscription fee, discount, minutes in the network, bonus.
     * When entering the "internet" parameter, the user must specify the maximum and minimum value.
     * When entering the "subscription fee" parameter, the user must specify the maximum and minimum value.
     * If the user enters a parameter that does not exist, he will receive a notification
     * that there are no matching tariffs with the entered parameter.
     *
     * @param tariffs the class which has list of all available comfort tariffs
     * @throws WrongInputDataException if entered data from user are incorrect
     * @see Validator
     * @see ListOfComfortTariffs#getComfortTariffs()
     */
    public void searchTariffByParam(List<ComfortTariff> tariffs) {
        IOData ioData = new IOData();
        ioData.printInfoForUser("Enter the parameter: ");
        String line = ioData.getInPutStringFromUser();


        switch (line) {
            case "internet" -> {
                ioData.printInfoForUserNextLine("Enter the max and min parameter range of internet");
                ioData.printInfoForUserNextLine("Max: ");
                int internetMaximum = ioData.getInPutIntegerFromUser();
                ioData.printInfoForUserNextLine("Min: ");
                int internetMinimum = ioData.getInPutIntegerFromUser();
                for (ComfortTariff tariff : tariffs) {
                    if (tariff.getInternetGB() >= internetMinimum && tariff.getInternetGB() <= internetMaximum) {
                        ioData.printInfoAboutTariff(tariff);
                    }
                }
            }
            case "subscription fee" -> {
                ioData.printInfoForUserNextLine("Enter the max and min parameter range of subscription fee");
                ioData.printInfoForUserNextLine("Max: ");
                double feeMaximum = ioData.getInPutDoubleFromUser();
                ioData.skipLine();
                ioData.printInfoForUserNextLine("Min: ");
                double feeMinimum = ioData.getInPutDoubleFromUser();
                ioData.skipLine();
                for (ComfortTariff tariff : tariffs) {
                    if (tariff.getSubscriptionFee() >= feeMinimum && tariff.getSubscriptionFee() <= feeMaximum) {
                        ioData.printInfoAboutTariff(tariff);
                    }
                }
            }
            case "discount" -> {
                for (ComfortTariff tariff : tariffs) {
                    if (tariff.getClass() == ComfortL.class) {
                        ioData.printInfoAboutTariff(tariff);
                    }
                }
            }
            case "minutes in the network" -> {
                for (ComfortTariff tariff : tariffs) {
                    if (tariff.getClass() == ComfortM.class) {
                        ioData.printInfoAboutTariff(tariff);
                    }
                }
            }
            case "bonus" -> {
                for (ComfortTariff tariff : tariffs) {
                    if (tariff.getClass() == ComfortXL.class) {
                        ioData.printInfoAboutTariff(tariff);
                    }
                }
            }
            default -> ioData.printInfoForUserNextLine("There aren't suitable tariff");
        }
    }
}
