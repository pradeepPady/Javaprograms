/***********************************************************************************
 * Purpose:finding the sum of Nth harmonic
 * 
 * @author bridgeit
 * 
 * Date: 22/02/18
 ***********************************************************************************/
package com.bridgeit.functional_programs;
import com.bridgeit.utility.Utility;
public class HarmonicSerisSum
{
	public static void main(String args[])
	{
		Utility utility=new Utility();

		System.out.println("enter the value of N");
		int number=utility.IntegerInput();

		boolean nonZeroOrNot=utility.isNonZeroNumber(number);
		if(nonZeroOrNot)
		{
			double sum=utility.harmonicSum(number);
			System.out.println(sum);

		}
		else
		{
			System.out.println("enter the nonZero number");
		}
	}
}
