package com.bridgeit.ObjectOrientedPrograms;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;

import org.json.simple.JSONObject;
import org.json.simple.parser.ParseException;

import com.bridgeit.utility.Utility;

@SuppressWarnings("unused")
public class InventeryManagement {
	@SuppressWarnings("rawtypes")
	public static void main(String args[]) throws Exception
	{
		
	Utility utility = new Utility();
	Transaction transaction=new Transaction();
	ArrayList al=new ArrayList();
	int choice;
	System.out.println();
	System.out.println("\t\t\t==============Share Market==============\n");
	System.out.println();
	do {
		System.out.println("\t\t\tEnter 1.create user                        \n");
		System.out.println("\t\t\tEnter 2.Buy                                \n");
		System.out.println("\t\t\tEnter 3.Sell                               \n");
		System.out.println("\t\t\tEnter 4.display                            \n");
		System.out.println("\t\t\tEnter 5.Add companyshares to Linkedlist    \n");
		System.out.println("\t\t\tEnter 6.Exit                               \n");
		choice = utility.IntegerInput();
		int amount;
		switch (choice)
		{
		case 1:
			   System.out.println("\t\t\t==============User Detailes==============\n");
		       System.out.println("\t\t\t Enter your...Name            \n");
		       String userName=utility.StringInput();
		       System.out.println("\t\t\t Enter........Number of Shares\n");
			   int numberOfShares=utility.IntegerInput();
			   System.out.println("\t\t\t Enter your...ammount          \n");
			   int ammount=utility.IntegerInput();
		       al.add(new Transaction(userName,numberOfShares,ammount));
        	   System.out.println();
			
			break;

		case 2:transaction.disply();
			System.out.println("\t\t\t==============Stock Detailes==============\n");
		       System.out.println("\t\t\tEnter company name: \n");
		       String companyName=utility.StringInput();
		       System.out.println("\t\t\tStock Symbol of Company "+companyName);
		       String symbol=utility.StringInput();
		       System.out.println("\t\t\tEnter the number of shares you want to buy ");
		       int number=utility.IntegerInput();
			  transaction.buy(companyName,symbol,number);
			break;

		case 3:
			//utility.selling();
			break;

		case 4:
			//utility.display();
			break;
		case 5://transaction.addingCompanyShares();
			
			break;
		case 6:System.exit(0);
		break;

		}
	} while (choice <= 1);

}
}
