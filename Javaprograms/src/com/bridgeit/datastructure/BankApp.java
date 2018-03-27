/**************************************************************************************************************************
 * Purpose:Bank cash counter
 * 
 * @author bridgeit
 * 
 * Date: 22/02/18
 **************************************************************************************************************************/
package com.bridgeit.datastructure;

import com.bridgeit.utility.Utility;

public class BankApp {
	
    
		public static void main(String[] args) {
			Utility utility=new Utility();
			System.out.println("\t\t\tCurrent Bank Balence...?");
			int cash = utility.IntegerInput();
			System.out.println("\t\t\tEnter the no. of people");
			int people = utility.IntegerInput();
			utility.cashCounter(cash, people);

	}
}
