/***********************************************************************************
 * Purpose:finding the roots of the quaderatic equatation
 * 
 * @author bridgeit
 * 
 * Date: 22/02/18
 ***********************************************************************************/
package com.bridgeit.functional_programs;
import com.bridgeit.utility.Utility;
public class Quadaritic {

	public static void main(String[] args) {
		Utility utility=new Utility();
		System.out.println("Roots of equation:"+"ax^2+bx+c");
		System.out.println("Enter the value of a,b&c");
		int a=utility.IntegerInput();
		int b=utility.IntegerInput();
		int c=utility.IntegerInput();
		double result=utility.Compute(a,b,c);//compute b^2-4*a*c
		if(result>0) 
		{
			double sqrt=Math.sqrt(result);
			double root1=((-b+(sqrt))/(2*a));
			double root2=((-b-(sqrt))/(2*a));
			System.out.println("Root1 of x :"+" "+root1);
			System.out.println("Root2 of x :"+" "+root2);
		}
	}

}
