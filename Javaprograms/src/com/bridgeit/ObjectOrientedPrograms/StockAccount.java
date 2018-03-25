package com.bridgeit.ObjectOrientedPrograms;

import java.io.IOException;

import org.json.simple.parser.ParseException;

import com.bridgeit.utility.Utility;

public class StockAccount {

	public static void main(String[] args) throws IOException, ParseException  {
		
	
		Utility utility = new Utility();
		int choice;
		System.out.println();
		System.out.println("***************** @ Share Market @ ************** ");
		System.out.println();
		do {
			System.out.println("Enter 1.create user");
			System.out.println("Enter 2.Buy");
			System.out.println("Enter 3.Sell");
			System.out.println("Enter 4.display");
			System.out.println("Enter 5.Exit");
			choice = utility.IntegerInput();
			String name, symbol;
			int amount;
			switch (choice) {
			case 1:
				System.out.println(" ***** Fill User Informatoion *****");
				System.out.println();
				utility.createUser();
				break;

			case 2:
				utility.Buy();
				break;

			case 3:
				utility.sell();
				break;

			case 4:
				Utility.display();
				break;
			case 5:
				System.exit(0);
				break;

			}
		} while (choice <= 4);

	}
	}