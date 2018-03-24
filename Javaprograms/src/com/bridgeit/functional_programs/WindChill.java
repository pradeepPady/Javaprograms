/***********************************************************************************
 * Purpose:finding the wind chill
 * 
 * @author bridgeit
 * 
 * Date: 22/02/18
 ***********************************************************************************/
package com.bridgeit.functional_programs;
import com.bridgeit.utility.Utility;
public class WindChill {

	public static void main(String[] args) {
		Utility utility=new Utility();
		System.out.println("\t\tNational Weather Service");
		System.out.println("\t\t------------------------\n");
		System.out.println("temparature in Fahrenheit:");
		int temparature=utility.IntegerInput();
		System.out.println("wind speed in miles per hour:");
		int windSpeed=utility.IntegerInput();
		if(temparature<50&&(windSpeed>3&&windSpeed<120))
		{
			double result=utility.computeWindChill(temparature,windSpeed);
			System.out.println(result);
		}
		else
			System.out.println("Enter valid Input..");
	}

}
