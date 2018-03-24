package com.bridgeit.algorithms;

import com.bridgeit.utility.Utility;

public class GeussingNumber {

	public static void main(String[] args) {
      Utility utility=new Utility();
      System.out.println("Enter the number");
      int number=utility.IntegerInput();
      int newNumber=(int) Math.pow(2, number);
      System.out.println("Guess a number between "+0+" to "+(newNumber-1));
      try {
		Thread.sleep(1000);
	} catch (InterruptedException e) {
		e.printStackTrace();
	}
      int num=utility.findNumber(0,newNumber-1);
 
      System.out.println("Your number is "+num);
	}

}
