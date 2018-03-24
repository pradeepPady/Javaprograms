/*************************************************************************************************************************************************
 *  Purpose:storing prime numbers in 2D array and printing
 *         
 *  @author  bridgeit
 * 
 *  Date:    1/03/18
 *
 ************************************************************************************************************************************************/
package com.bridgeit.datastructure;
import java.util.ArrayList;

import com.bridgeit.utility.Utility;

public class PrimeNumbersTwoDArray {
	public static void main(String args[])
	{
		Utility utility=new Utility();
		
	    ArrayList<Integer>al=utility.primeNumbers();
	    int newArray[][]= utility.createTwoDArray();
	    utility.printPrimeNumbersIn2DArray(al,newArray);
		
	}

}
