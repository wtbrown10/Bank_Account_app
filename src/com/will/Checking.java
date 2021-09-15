package com.will;

public class Checking extends Account{
    // List properties specific to checking accounts
    private int debitCard;
    private int pin;

    public Checking(String name, String sSN, double initDeposit) {
        super(name, sSN, initDeposit);
        System.out.println("New Checking Account!");

    }


    //call the constructor to initialize checking account properties

    // List any methods specific to the checking account

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
