package com.epam.task01.service;

import com.epam.task01.entity.ComfortTariff;
import com.epam.task01.service.comparator.SubscriptionFeeComparator;

import java.util.Collections;
import java.util.Comparator;
import java.util.List;

/**
 * Class for sorting the comfort tariffs by subscription fee with comparator
 */
public class SortComfortTariffs {
    /**
     * Method that sorts comfort tariffs in collection List.
     * Method use specified comparator for sorting.
     *
     * @param tariffs is the list of comfort tariffs which need to be sorted by subscription fee.
     * @see SubscriptionFeeComparator#compare(ComfortTariff, ComfortTariff)
     */
    public void sortComfortTariffsByFee(List<ComfortTariff> tariffs) {
        Comparator<ComfortTariff> subFeeComparator = new SubscriptionFeeComparator();
        Collections.sort(tariffs, subFeeComparator);
    }
}
