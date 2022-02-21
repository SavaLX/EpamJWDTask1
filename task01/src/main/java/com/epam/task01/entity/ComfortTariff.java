package com.epam.task01.entity;

public abstract class ComfortTariff extends MobileTariff {

    private int internetGB;

    public ComfortTariff(double subscriptionFee, int numberOfClients, int internetGB) {
        super(subscriptionFee, numberOfClients);
        this.internetGB = internetGB;
    }

    public ComfortTariff() {

    }

    @Override
    public abstract void install();

    public int getInternetGB() {
        return internetGB;
    }

    public void setInternetGB(int internetGB) {
        this.internetGB = internetGB;
    }

}
