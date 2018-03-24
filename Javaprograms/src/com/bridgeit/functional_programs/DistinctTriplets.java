/**************************************************************************************************************************
 * Purpose:finding the distinct triplets whose sum=0
 * 
 * @author bridgeit
 * 
 * Date: 22/02/18
 **************************************************************************************************************************/
package com.bridgeit.functional_programs;
import com.bridgeit.utility.Utility;
public class DistinctTriplets {

	public static void main(String[] args) {
		Utility utility=new Utility();
		System.out.println("enter the value of N");
		int number=utility.IntegerInput();
		System.out.println("Enter the elements");
		int a[]=utility.input(number);
		utility.tripletPrint(a,number);
	}

}
