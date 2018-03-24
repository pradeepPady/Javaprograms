
/***********************************************************************************
 * Purpose:finding the distinct coupon numbers
 * 
 * @author bridgeit
 * 
 * Date: 22/02/18
 ***********************************************************************************/
package com.bridgeit.algorithms;
import com.bridgeit.utility.Utility;
public class MonthlyPayment {
	public static void main(String args[])
	{
		Utility utility=new Utility();
		System.out.println("enter the Principle loan ammount");
		double p=utility.doubleInput1();
		System.out.println("enter the Interest");
		double r=utility.doubleInput1();
		System.out.println("enter the year");
		int y=utility.IntegerInput();
		double money=utility.monthlyPayment(p,r,y);
		System.out.println("Monthly payment"+money);
	}

}
