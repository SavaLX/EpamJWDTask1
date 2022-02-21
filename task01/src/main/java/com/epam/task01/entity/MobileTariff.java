package com.epam.task01.entity;

public abstract class MobileTariff {

    private double subscriptionFee;
    private int numberOfClients;
    private static final String COMPANY = "A1";

    public MobileTariff(double subscriptionFee, int numberOfClients) {
        this.subscriptionFee = subscriptionFee;
        this.numberOfClients = numberOfClients;
    }

    public MobileTariff() {

    }

    public abstract void install();

    public double getSubscriptionFee() {
        return subscriptionFee;
    }

    public void setSubscriptionFee(double subscriptionFee) {
        this.subscriptionFee = subscriptionFee;
    }

    public int getNumberOfClients() {
        return numberOfClients;
    }

    public void setNumberOfClients(int numberOfClients) {
        this.numberOfClients = numberOfClients;
    }

    public String getCompany() {
        return COMPANY;
    }

}
