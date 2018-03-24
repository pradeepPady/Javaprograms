/**************************************************************************************************************************
 * Purpose:finding the frime numbers and Prime numbers that are Anagrams
 * 
 * @author bridgeit
 * 
 * Date: 22/02/18
 **************************************************************************************************************************/
package com.bridgeit.datastructure;
import java.util.ArrayList;
import com.bridgeit.utility.Utility;
public class PrimeAnagramsAndPalindromes {

		public static void main(String args[])
		{
			Utility utility=new Utility();
			ArrayList<Integer>al=utility.primeNumbers();
			int[]newArray=utility.primeAnagrams(al);
			utility.printAnagramInTwoD(newArray);
		}

}
