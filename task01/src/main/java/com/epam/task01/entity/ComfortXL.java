package com.epam.task01.entity;

import java.util.Objects;

public class ComfortXL extends ComfortTariff {

    private String typeOfBonus;

    public ComfortXL(double subscriptionFee, int numberOfClients, int internetGB, String typeOfBonus) {
        super(subscriptionFee, numberOfClients, internetGB);
        this.typeOfBonus = typeOfBonus;
    }

    public ComfortXL() {

    }

    public String getTypeOfBonus() {
        return typeOfBonus;
    }

    public void setTypeOfBonus(String typeOfBonus) {
        this.typeOfBonus = typeOfBonus;
    }

    @Override
    public void isInstall() {
        System.out.println("Tariff 'Comfort XL' is installed on mobile");
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;

        if (o == null || getClass() != o.getClass()) return false;

        ComfortXL comfortXL = (ComfortXL) o;
        if (this.getInternetGB() != comfortXL.getInternetGB()) return false;
        if (!this.typeOfBonus.equals(comfortXL.getTypeOfBonus())) return false;
        if (this.getSubscriptionFee() != comfortXL.getSubscriptionFee()) return false;
        return this.getCompany().equals(comfortXL.getCompany());
    }

    @Override
    public int hashCode() {
        return Objects.hash(typeOfBonus, getCompany(), getInternetGB(), getSubscriptionFee());
    }

    @Override
    public String toString() {
        return "ComfortM{" + "subscriptionFee = " + getSubscriptionFee() + ", numberOfClients = " + getNumberOfClients()
                + ", company = " + getCompany() + ", internetGB = " + getInternetGB()
                + ", typeOfBonus = " + typeOfBonus + "}";
    }
}
