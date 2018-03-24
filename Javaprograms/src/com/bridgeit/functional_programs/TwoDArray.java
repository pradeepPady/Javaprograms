/************************************************************************************************************************
 * Purpose:finding the distinct coupon numbers
 * 
 * @author bridgeit
 * 
 * Date: 22/02/18
 ************************************************************************************************************************/
package com.bridgeit.functional_programs;
import com.bridgeit.utility.Utility;
public class TwoDArray {
	
	public static void main(String args[])
	{
		System.out.println("enter the Rows and Columns");
		 Utility utility=new Utility();
		int row=utility.IntegerInput();
		int col=utility.IntegerInput();
		int[][] array=utility.takeInput(row,col);
		utility.print(array,row,col);
		

	}
}
