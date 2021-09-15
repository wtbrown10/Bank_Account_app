package com.will;

public class Savings extends Account {
    // list props specific to the savings account
    private int safetyDepositBoxID;
    private int safetyDepositBoxKey;

    public Savings(String name, String sSN, double initDeposit) {
        super(name, sSN, initDeposit);
        System.out.println("New Savings Account!");

    }
    // constructor to initialize settings for the savings prop

    // list any methods specific to savings account

    @Override
    void deposit() {

    }

    @Override
    void withdraw() {

    }

    @Override
    void transfer() {

    }

    @Override
    void showInfo() {

    }
}
