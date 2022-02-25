package com.epam.task01;

import com.epam.task01.entity.ComfortL;
import com.epam.task01.entity.ComfortM;
import com.epam.task01.entity.ComfortTariff;
import com.epam.task01.entity.ComfortXL;
import com.epam.task01.entity.ListOfComfortTariffs;
import com.epam.task01.service.ClientsCounter;
import com.epam.task01.service.SearchTariff;
import com.epam.task01.service.ComfortTariffsSorter;
import com.epam.task01.service.exception.WrongInputDataException;
import com.epam.task01.view.IOData;


public class Main {
    public static void main(String[] args) {

        IOData ioData = new IOData();
        ListOfComfortTariffs comfortTariffs = new ListOfComfortTariffs();
        ComfortTariffsSorter comfortTariffsSorter = new ComfortTariffsSorter();
        SearchTariff searchTariff = new SearchTariff();
        ClientsCounter totalNumberOfClients = new ClientsCounter();

        // Add 3 types of comfort tariff to list
        comfortTariffs.addTariff(new ComfortL(32.64, 90521, 25,
                8.99));
        comfortTariffs.addTariff(new ComfortM(22.81, 120024, 10,
                120));
        comfortTariffs.addTariff(new ComfortXL(10.56, 643245, 50,
                "package of TV"));

        // Output matching tariffs by input parameter
        searchTariff.searchTariffByParam(comfortTariffs.getComfortTariffs()); // Search matching tariffs by subscription fee
        ioData.skipLine();

        // Output total number of clients
        try {
            ioData.printInfoForUserNextLine("Total number of clients = "
                    + totalNumberOfClients.countTotalNumberOfClients(comfortTariffs.getComfortTariffs()));
        } catch (WrongInputDataException e) {
            e.printStackTrace();
        }
        ioData.skipLine();

        // Output sorted list of tariffs by subscription fee
        ioData.printInfoForUserNextLine("Sorted list of tariffs:");
        comfortTariffsSorter.sortComfortTariffsByFee(comfortTariffs.getComfortTariffs());
        for (ComfortTariff tariff : comfortTariffs.getComfortTariffs()) {
            ioData.printInfoForUserNextLine(tariff.toString());
        }
    }
}
