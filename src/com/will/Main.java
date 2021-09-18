package com.will;

import java.util.LinkedList;
import java.util.List;
import java.util.SplittableRandom;

public class Main {

    public static void main(String[] args) {
	// write your code here

//        Checking check1 = new Checking("Will Brown", "293849585", 1500);
//        Savings save1 = new Savings("Sam Mas", "573928465", 3000);
//        check1.showInfo();
//        save1.compound();
//        check1.deposit(400);
//        check1.transfer("venmo",50);
//        System.out.println("**************");

        List<Account> accounts = new LinkedList<Account>();


        // read csv file then create new accounts based on that data
        String file = "C:\\Users\\HP\\Documents\\NewBankAccounts.csv";
        List<String[]> newAccountHolder = utilities.CSV.read(file);
        for (String [] accountHolder : newAccountHolder) {
//            System.out.println("NEW ACCOUNT");
            String name = accountHolder[0];
            String sSN = accountHolder[1];
            String accountType = accountHolder[2];
            double initDeposit = Double.parseDouble(accountHolder[3]);
//            System.out.println(name + " " + sSN + " " + accountType + " $" + initDeposit);
            if (accountType.equals("Savings")) {
//                System.out.println("OPEN A SAVINGS ACCOUNT");
                accounts.add(new Savings(name, sSN, initDeposit));
            } else if (accountType.equals("Checking")) {
//                System.out.println("OPEN A CHECKING ACCOUNT");
                accounts.add(new Checking(name, sSN, initDeposit));
            } else {
                System.out.println("ERROR READING ACCOUNT TYPE");
            }
//            System.out.println("************");
        }
        // see 1 specific account
        accounts.get(5).showInfo();
        // see all accounts
        for (Account acc : accounts) {
            System.out.println("\n**************");
            acc.showInfo();
        }
    }


}
