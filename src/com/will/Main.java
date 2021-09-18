package com.will;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Checking check1 = new Checking("Will Brown", "293849585", 1500);
        Savings save1 = new Savings("Sam Mas", "573928465", 3000);
        check1.showInfo();
        save1.compound();
        check1.deposit(400);
        check1.transfer("venmo",50);
        System.out.println("**************");



    }
}
