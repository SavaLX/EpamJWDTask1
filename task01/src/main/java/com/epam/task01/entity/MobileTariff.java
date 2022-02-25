package com.epam.task01.entity;

public abstract class MobileTariff {

    private static final String COMPANY = "A1";
    private double subscriptionFee;
    private int numberOfClients;

    public MobileTariff(double subscriptionFee, int numberOfClients) {
        this.subscriptionFee = subscriptionFee;
        this.numberOfClients = numberOfClients;
    }

    public MobileTariff() {

    }

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

    public abstract void isInstall();

}
