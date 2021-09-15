package com.will;

public class Checking extends Account{
    // List properties specific to checking accounts
    private long debitCard;
    private int pin;

    public Checking(String name, String sSN, double initDeposit) {
        super(name, sSN, initDeposit);
//        System.out.println("New Checking Account!");
        accountNumber = "2" + accountNumber;
//        System.out.println("ACCOUNT NUMBER: " + this.accountNumber);
        setDebitCard();

    }


    //call the constructor to initialize checking account properties

    // List any methods specific to the checking account


    @Override
    public void setRate() {
        rate = getBaseRate() * .15;
    }

    private void setDebitCard(){
        debitCard = (long)(Math.random() * Math.pow(10,12));
        pin = (int)(Math.random() * Math.pow(10,4));
    }

    @Override
    public void showInfo() {
        System.out.println("ACCOUNT TYPE: Checking");
        super.showInfo();
        System.out.println("YOUR CHECKING ACCOUNT FEATURES" + "\nDebit Card Number: "
                            + debitCard + "\nDebit Card Pin: " + pin
        );
    }
}
