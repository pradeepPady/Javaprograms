package com.bridgeit.algorithms;
import com.bridgeit.utility.Utility;
public class stringAnagramDetection {

	public static void main(String[] args) {
		Utility utility = new Utility();
		System.out.println("String Anangram");
		System.out.println("Enter first String");
		String string1 = utility.StringInput();
		System.out.println("Enter first String");
		String string2 = utility.StringInput();
		boolean flag1 = utility.anagram(string1, string2);
		if (flag1 == true)
		{
			System.out.println("Strings are anagrams");
		System.out.println();
		}
		else
		{
			System.out.println("Strings are Not anagrams");
			System.out.println();
		}
		System.out.println("Printing prime number 1 to 1000 and checking that are anagrams and palindrome");
		System.out.println();
		utility.primeAndAnagram();
	}
}
