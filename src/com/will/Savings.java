package com.will;

public class Savings extends Account {
    // list props specific to the savings account
    private int safetyDepositBoxID;
    private int safetyDepositBoxKey;

    // constructor to initialize settings for the savings prop
    public Savings(String name, String sSN, double initDeposit) {
        super(name, sSN, initDeposit);
//        System.out.println("New Savings Account!");
        accountNumber = "1" + accountNumber;
//        System.out.println("ACCOUNT NUMBER: " + this.accountNumber);
        setSafetyDepositBox();

    }

    @Override
    public void setRate() {
        rate = getBaseRate() - .25;
    }

    // list any methods specific to savings account

    private void setSafetyDepositBox(){
        safetyDepositBoxID = (int)(Math.random() * Math.pow(10,3));
        safetyDepositBoxKey = (int)(Math.random() * Math.pow(10,4));
    }

    @Override
    public void showInfo() {
        System.out.println("ACCOUNT TYPE: Savings");
        super.showInfo();
        System.out.println("YOUR SAVINGS ACCOUNT FEATURES" + "\nSafety Deposit Box ID: " + safetyDepositBoxID +
                        "\nSafety Deposit Box Key: " + safetyDepositBoxKey
        );
    }
}
