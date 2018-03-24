package com.bridgeit.algorithms;

import java.util.Scanner;

import com.bridgeit.algorithms.utility.Utility1;

public class VendingMachine {
	private static Scanner scan;

	public static void main(String args[])
	{
		scan = new Scanner(System.in);
		System.out.println("enter the total Ammount");
		int ammount=scan.nextInt();
		Utility1 utility=new Utility1();
		int ammountCount=utility.vendingMachine(ammount);
		System.out.println("Total Count:"+ammountCount);
	}

}
