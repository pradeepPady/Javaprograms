package com.bridgeit.datastructure;

import com.bridgeit.utility.Utility;

public class BankApp {
	

		public static void main(String[] args) {
			Utility utility=new Utility();
			System.out.println("Current Bank Balence...?");
			int cash = utility.IntegerInput();
			System.out.println("Enter the no. of people");
			int people = utility.IntegerInput();
			utility.cashCounter(cash, people);
			

	}
}
