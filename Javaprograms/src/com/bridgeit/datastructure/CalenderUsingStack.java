package com.bridgeit.datastructure;

import java.util.Stack;

import com.bridgeit.utility.Utility;

		
public class CalenderUsingStack {

	public static void main(String[] args) {

		Utility utility = new Utility();
		System.out.println("Enter the month");
		int month = utility.IntegerInput();
		System.out.println("Enter the year");
		int year = utility.IntegerInput();
		utility.calenderStack(month, year);
	}

}