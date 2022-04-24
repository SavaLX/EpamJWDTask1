package com.epam.task01.service.comparator;

import com.epam.task01.entity.ComfortTariff;

import java.util.Comparator;

public class SubscriptionFeeComparator implements Comparator<ComfortTariff> {
    @Override
    public int compare(final ComfortTariff o1, final ComfortTariff o2) {
        return (int) (o1.getSubscriptionFee() - o2.getSubscriptionFee());
    }
}
