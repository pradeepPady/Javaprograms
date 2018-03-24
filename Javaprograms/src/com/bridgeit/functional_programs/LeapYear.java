/***********************************************************************************
 * Purpose:finding the given year is leap year or not
 * 
 * @author bridgeit
 * 
 * Date: 22/02/18
 ***********************************************************************************/
package com.bridgeit.functional_programs;
import com.bridgeit.utility.Utility;

public class LeapYear {

	public static void main(String[] args) {
		Utility utility=new Utility();
		System.out.println("Enter the Year");
		int year=utility.IntegerInput();
		boolean yasOrNo=utility.isFourDigitNumber(year);
		if(yasOrNo)
		{
			boolean LeapYearOrNot = utility.cheakLeapYear(year);
			if(LeapYearOrNot)
			{
				System.out.println("LeapYear");

			}
			else
			{
				System.out.println("Not a LeapYear");

			}
		}
		else
			System.out.println("Enter the Correct Year");
	}

}
