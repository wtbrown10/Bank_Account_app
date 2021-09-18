package com.will;

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

        // read csv file then create new accounts based on that data
        String file = "C:\\Users\\HP\\Documents\\NewBankAccounts.csv";
        List<String[]> newAccountHolder = utilities.CSV.read(file);
        for (String [] accountHolder : newAccountHolder) {
            System.out.println("NEW ACCOUNT");
            System.out.println(accountHolder[0]);
            System.out.println(accountHolder[1]);
            System.out.println(accountHolder[2]);
            System.out.println(accountHolder[3]);
            System.out.println("************");

        }
    }
}
