/***********************************************************************************
 * Purpose:finding the factors of a given number
 * 
 * @author bridgeit
 * 
 * Date: 22/02/18
 ***********************************************************************************/
package com.bridgeit.functional_programs;
import com.bridgeit.utility.Utility;
public class Factors {
	public static void main(String args[])
	{
		System.out.println("enter the value of n");
		Utility utility=new Utility();
		int number=utility.IntegerInput();
		utility.primeFactors(number);
		
	}

}
