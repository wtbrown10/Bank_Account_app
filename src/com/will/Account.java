package com.will;

public abstract class Account implements IBaseRate {
    //List common properties for savings and checking accounts
    private String name;
    private String sSN;
    private double balance;
    private int accountNumber;
    private double rate;

    //Constructor to set base properties and initialize the account

    public Account(String name, String sSN, double initDeposit) {
//        System.out.println("NAME: " + name);
//        System.out.println("NEW ACCOUNT: ");
        this.name = name;
        this.sSN = sSN;
        balance = initDeposit;
        System.out.println("Name: " + name + " ssn: " + sSN + " balance: " + balance);
    }


    // List common methods
    abstract void deposit();
    abstract void withdraw();
    abstract void transfer();
    abstract void showInfo();

}
