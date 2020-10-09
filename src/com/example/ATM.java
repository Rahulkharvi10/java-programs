package com.example;

import java.util.Scanner;

public class ATM {
	public static void main(String[] args) {
		int pin=1123;
		long balance=23500;
		int ePin;
		boolean a=true;
		while(a) {
			System.out.println("Welcome to Kutumeshwara Bank ATM MACHINE...");
			System.out.println("select 1 for bankbalance:");
			System.out.println("select 2 for withdrawal:");
			System.out.println("select 3 for send money:");
			System.out.println("select 4 for exit:");
			Scanner sc=new Scanner(System.in);
			int choice=sc.nextInt();
		
			switch(choice) {
				case 1:
					System.out.println("enter the pin num:");
					ePin=sc.nextInt();
					if(pin==ePin) {
						System.out.println("right pin entered");
						System.out.println("balance in your account:" +balance);
					} else {
						System.out.println("wrong pin entered");
					}
					break;
				case 2:
					System.out.println("enter the pin num:");
					ePin=sc.nextInt();
					if(pin==ePin) {
						System.out.println("right pin entered");
						System.out.println("enter the amount to withdraw:");
						long eBalance=sc.nextLong();
						if (eBalance%100 == 0) {
							if(eBalance<=20000) {
								if(balance <500) {
									System.out.println("not enough balance....");
								} else {
									if(balance-eBalance>=500) {
										 System.out.println("enough balace....");
										 balance=balance-eBalance;
										 System.out.println("balance left in your account: " +balance); 
										 System.out.println("Thank you for banking with us");
									} else {
										System.out.println(" dont have sufficient balance your balance is :"+balance);
									}
								}
							} else {
								System.out.println("maximum withdraw amount is 20000");
							}
						} else {
							System.out.println("amount should be multiple of 100");
						}
					} else {
						System.out.println("wrong pin entered");
					}
					break;
				case 3:
				case 4:a=false;
					break;
				default:
					System.out.println("wrong choice");
			  } 
		}
	}      
}
		