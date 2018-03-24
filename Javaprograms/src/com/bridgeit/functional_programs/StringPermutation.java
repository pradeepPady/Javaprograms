/***********************************************************************************
 * Purpose:finding the permutations of given string
 * 
 * @author bridgeit
 * 
 * Date: 22/02/18
 ***********************************************************************************/
package com.bridgeit.functional_programs;
import com.bridgeit.utility.Utility;
public class StringPermutation {
	public static void main(String[]args)
	{
		System.out.println("enter the string");
		Utility utility=new Utility();
		String string=utility.StringInput();
		int low=0,high=string.length()-1;
		utility.permute(string,low,high);
	}

}
