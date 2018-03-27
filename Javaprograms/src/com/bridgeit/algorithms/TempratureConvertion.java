package com.bridgeit.algorithms;

import java.util.Scanner;

import com.bridgeit.algorithms.utility.Utility1;

public class TempratureConvertion {

	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		Utility1 utility=new Utility1();
		while(true)
		{
				System.out.println("\t\t--:Temprature Convertion:--\t");
				System.out.println("\t\t1:Celsius to Fahrenheit\t"+"Enter------ >1");
				System.out.println("\t\t1:Fahrenheit to Celsius\t"+"Enter------->2");
				int choice=scanner.nextInt();
				
			if(choice==1)
			{
					System.out.println("\tEnter temperature in celsius");
					int input=scanner.nextInt();
					@SuppressWarnings("static-access")
					int result=utility.farenheattemperaturConversion(input);
					System.out.println("\ttemperature in Fahrenheit "+result);
			}
			else 
			{
					System.out.println("\tEnter temperature in Fahrenheit");
					int input=scanner.nextInt();
					@SuppressWarnings("static-access")
					int result=utility.celciustemperaturConversion(input);
					System.out.println("\ttemperature in Celsius "+result);
			}
		}
	}

}
