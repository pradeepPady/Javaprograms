package com.bridgeit.algorithms;

import java.util.Arrays;

import com.bridgeit.utility.Utility;

public class DayOfWeek {
public static void main(String[] args) {
	    Utility utility=new Utility();
		System.out.println("Enter the year");
		String date=utility.StringLineInput();
		String stringArray[]=date.split("/");
		int m=Integer.valueOf(stringArray[0]);
		int d=Integer.valueOf(stringArray[1]);
		int y=Integer.valueOf(stringArray[2]);
		int y0 =( y -(14 -m) / 12);
		int x = (y0 + y0/4 -y0/100 + y0/400);
		int m0 = (m + 12 * ((14 - m) / 12) - 2);
		int d0 = (d + x + 31*m0 / 12) % 7;
		switch((d0))
		{
		case 0:System.out.println("Sunday");
		break;
		case 1:System.out.println("Monday");
		break;
		case 2:System.out.println("Tusday");
		break;
		case 3:System.out.println("Wednesday");
		break;
		case 4:System.out.println("thursday");
		break;
		case 5:System.out.println("Friday");
		break;
		case 6:System.out.println("Saturday");
		break;
		}

}
}
