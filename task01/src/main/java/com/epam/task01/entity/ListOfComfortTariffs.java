package com.epam.task01.entity;

import java.util.ArrayList;
import java.util.List;

public class ListOfComfortTariffs {

    private final List<ComfortTariff> comfortTariffs = new ArrayList<>();

    public ListOfComfortTariffs() {
    }

    public List<ComfortTariff> getComfortTariffs() {
        return comfortTariffs;
    }

    public void addTariff(ComfortTariff comfortTariff) {
        comfortTariffs.add(comfortTariff);
    }


}
