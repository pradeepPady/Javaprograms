
/*************************************************************************************************************
 * Purpose:Converting Decimal number 
 *        
 * @author bridgeit
 * 
 * Date: 22/02/18
 * 
 **************************************************************************************************************/
package com.bridgeit.algorithms;

import java.util.Arrays;

import com.bridgeit.utility.Utility;

public class NibbleSwap {
	public static void main(String[] args) 
	{
		Utility utility=new Utility();
		System.out.println("enter the number");
		int number=utility.IntegerInput();
		int array[]=utility.binaryConvertion(number);
		String binaryNumber= Arrays.toString(array).replaceAll("\\[|\\]|,|\\s", "");
		StringBuilder sb=new StringBuilder(binaryNumber).reverse();
		binaryNumber=sb.toString();
		System.out.println(binaryNumber);
		String str1=binaryNumber.substring(0, 4);
		String str2=binaryNumber.substring(4, 8);
		binaryNumber=str2+str1;
		System.out.println(binaryNumber);
		int number1=Integer.parseInt(binaryNumber,2);
		System.out.println(number1);
	}
}
