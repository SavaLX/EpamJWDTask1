package com.epam.task01.entity;

import java.util.Objects;

public class ComfortM extends ComfortTariff {

    private int minutesInTheNetwork;

    public ComfortM(double subscriptionFee, int numberOfClients, int internetGB, int minutesInTheNetwork) {
        super(subscriptionFee, numberOfClients, internetGB);
        this.minutesInTheNetwork = minutesInTheNetwork;
    }

    public ComfortM() {

    }

    @Override
    public void install() {
        System.out.println("Tariff 'Comfort M' is installed on mobile");
    }

    public int getMinutesInTheNetwork() {
        return minutesInTheNetwork;
    }

    public void setMinutesInTheNetwork(int minutesInTheNetwork) {
        this.minutesInTheNetwork = minutesInTheNetwork;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;

        if (o == null || getClass() != o.getClass()) return false;

        ComfortM comfortM = (ComfortM) o;
        if (this.getInternetGB() != comfortM.getInternetGB()) return false;
        if (this.minutesInTheNetwork != comfortM.getMinutesInTheNetwork()) return false;
        if (this.getSubscriptionFee() != comfortM.getSubscriptionFee()) return false;
        return this.getCompany().equals(comfortM.getCompany());
    }

    @Override
    public int hashCode() {
        return Objects.hash(minutesInTheNetwork, getCompany(), getInternetGB(), getSubscriptionFee());
    }

    @Override
    public String toString() {
        return "ComfortM{" + "subscriptionFee = " + getSubscriptionFee() + ", numberOfClients = " + getNumberOfClients()
                + ", company = " + getCompany() + ", internetGB = " + getInternetGB()
                + ", minutesInTheNetwork = " + minutesInTheNetwork + "}";
    }
}
