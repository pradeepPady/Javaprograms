package com.bridgeit.algorithms;

import java.util.Scanner;

import com.bridgeit.algorithms.utility.Utility1;

public class ToBinary {
	public static void main(String arrgs[])
	{
		Scanner scanner=new Scanner(System.in);
		System.out.println("\t\t,<--Decimal To Binary-->\t\t");
		System.out.println("\t\tEnter the Decimal value:-->\t\t");
		int decimalInput=scanner.nextInt();
		Utility1 utility=new Utility1();
		String result=utility.tobinary(decimalInput);
		System.out.println("\t\tBinary OutPut:"+result);

	}

}
