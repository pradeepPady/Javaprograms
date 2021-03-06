/**************************************************************************************************************************
 * Purpose:Disply the calendar of particular  date and month
 * 
 * @author bridgeit
 * 
 * Date: 22/02/18
 **************************************************************************************************************************/
package com.bridgeit.datastructure;

import com.bridgeit.utility.Utility;

public class Calendar { 
	public static void main(String[] args) {
		Utility utility=new Utility();
		System.out.println("Enter the Date:");
		int month = utility.IntegerInput();
		int year = utility.IntegerInput();
			String[] months = {
					"",                             
					"January", "February", "March",
					"April", "May", "June",
					"July", "August", "September",
					"October", "November", "December"
			};
			int[] days = {
					0, 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31
			};

		if (month == 2 && utility.LeapYear(year)) days[month] = 29;

		System.out.println("        " +months[month] +" " +year  );
		System.out.println("   S   M   Tu    W   Th    F    S");
		System.out.println("----------------------------------");
		int d = utility.day(month, 1, year);
		for (int i = 0; i < d; i++)
			System.out.print("     ");
		for (int i = 1; i <= days[month]; i++) {
			System.out.printf("%4d ", i);
			if (((i + d) % 7 == 0) || (i == days[month])) System.out.println();
			

		}

	}
}