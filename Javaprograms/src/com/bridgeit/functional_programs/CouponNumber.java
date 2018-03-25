
/***********************************************************************************
 * Purpose:finding the distinct coupon numbers
 * 
 * @author bridgeit
 * 
 * Date: 22/02/18
 ***********************************************************************************/
package com.bridgeit.functional_programs;
import com.bridgeit.utility.Utility;
public class CouponNumber {
	
	public static void main(String args[])
	{
		Utility utility=new Utility();
		System.out.println("enter the number of copan number do you want to generate");
		int coupen_number;
		coupen_number=utility.IntegerInput();
		
		utility.coupan(coupen_number);

	}

}