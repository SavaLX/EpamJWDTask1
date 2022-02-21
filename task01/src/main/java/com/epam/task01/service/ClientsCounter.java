package com.epam.task01.service;

import com.epam.task01.entity.ComfortTariff;
import com.epam.task01.entity.ListOfComfortTariffs;
import com.epam.task01.service.exception.WrongInputDataException;

import java.util.List;

/**
 * Class for calculation of the total number of client comfort tariffs
 */
public class ClientsCounter {
    /**
     * Calculate the total number of clients comfort tariffs
     * If number of clients of one of the tariff less the 0 the method throw Exception
     *
     * @param tariffs the list of comfort tariffs
     * @return result - the total number of clients of comfort tariffs
     * @see ListOfComfortTariffs#getComfortTariffs()
     */
    public long countTotalNumberOfClients(List<ComfortTariff> tariffs) throws WrongInputDataException {
        long result = 0;
        for (ComfortTariff number : tariffs) {
            if (number.getNumberOfClients() < 0) {
                throw new WrongInputDataException("The number of clients cannot be less 0");
            }
            result += number.getNumberOfClients();
        }
        return result;
    }
}
