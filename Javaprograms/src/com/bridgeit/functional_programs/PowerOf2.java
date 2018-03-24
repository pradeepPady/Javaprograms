/***********************************************************************************
 * Purpose:printing the power's of 2
 * 
 * @author bridgeit
 * 
 * Date: 22/02/18
 ***********************************************************************************/
package com.bridgeit.functional_programs;
import com.bridgeit.utility.Utility;
public class PowerOf2
{
	public static void main(String args[])
	{
		Utility utility=new Utility();
		System.out.println("Enter the value of n");
		int n=utility.IntegerInput();
		utility.powerOf2Print(n);
	}
}

