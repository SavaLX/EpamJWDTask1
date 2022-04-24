package com.epam.task01.entity;

import java.util.Objects;

public class ComfortL extends ComfortTariff {

    private double discountValue;

    public ComfortL(double subscriptionFee, int numberOfClients, int internetGB, double discountValue) {
        super(subscriptionFee, numberOfClients, internetGB);
        this.discountValue = discountValue;
    }

    public ComfortL() {
    }

    public double getDiscountValue() {
        return discountValue;
    }

    public void setDiscountValue(double discountValue) {
        this.discountValue = discountValue;
    }

    @Override
    public void isInstall() {
        System.out.println("Tariff 'Comfort L' is installed on mobile");
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;

        if (o == null || getClass() != o.getClass()) return false;

        ComfortL comfortL = (ComfortL) o;
        if (this.getInternetGB() != comfortL.getInternetGB()) return false;
        if (this.discountValue != comfortL.getDiscountValue()) return false;
        if (this.getSubscriptionFee() != comfortL.getSubscriptionFee()) return false;
        return this.getCompany().equals(comfortL.getCompany());
    }

    @Override
    public int hashCode() {
        return Objects.hash(discountValue, getCompany(), getInternetGB(), getSubscriptionFee());
    }

    @Override
    public String toString() {
        return "ComfortL{" + "subscriptionFee = " + getSubscriptionFee() + ", numberOfClients = " + getNumberOfClients()
                + ", company = " + getCompany() + ", internetGB = " + getInternetGB()
                + ", discountValue = " + discountValue + "}";
    }
}
