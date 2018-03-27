package com.bridgeit.algorithms.utility;

import java.util.*;

public class Utility1 {
	/************************************************************************************/
	/**
	 * 
	 */
	Scanner scan = new Scanner(System.in);

	public static int[] integerInput() {

		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the lenth of array");
		int number = scan.nextInt();

		int array[] = new int[number];
		System.out.println("enter your elements");
		for (int i = 0; i < number; i++) {
			array[i] = scan.nextInt();
		}
		return array;
	}

	/************************************************************************************/
	/**
	 * Method for String input
	 * 
	 * @return
	 */
	public static String[] stringInput() {
		Scanner scan = new Scanner(System.in);

		System.out.println("Enter the lenth of array");
		int number = scan.nextInt();

		String array[] = new String[number];
		System.out.println("enter your elements");

		for (int i = 0; i < number; i++) {
			array[i] = scan.next();
		}
		return array;
	}

	/************************************************************************************/
	public void BinarySearchForSting() {

		String array[] = stringInput();
		int length = array.length;

		System.out.println("enter the key to search");
		String key = scan.next();

		Arrays.sort(array);

		boolean flag = binarySearch(array, 0, length - 1, key);

		if (flag) {
			System.out.println("Element found");
		} else {
			System.out.println("Element not found");
		}

	}

	/***************************************************************/

	public boolean binarySearch(String[] array, int low, int high, String key) {

		if (low == high) {
			if (array[low] == key)
				return true;
			else
				return false;
		}

		else {

			if (low <= high) {

				int mid = (low + high) / 2;
				System.out.println("mid=" + mid);

				if (array[mid].compareTo(key) == 0) {
					return true;
				}

				else if (array[mid].compareTo(key) > 0) {
					return binarySearch(array, low, mid - 1, key);
				}

				else {
					return binarySearch(array, mid + 1, high, key);
				}

			}
			return false;

		}

	}

	/***********************************************************************************/
	public void BinarySearchForInteger() {

		int array[] = integerInput();
		int length = array.length;
		System.out.println("enter the key to search");
		int key = scan.nextInt();

		Arrays.sort(array);

		boolean flag = binarySearch(array, 0, length - 1, key);

		if (flag) {
			System.out.println("Element found");
		} else {
			System.out.println("Element not found");
		}

	}

	/**************************************************************************************/

	public boolean binarySearch(int[] array, int low, int high, int key) {

		if (low == high) {
			if (array[low] == key)
				return true;
			else
				return false;
		}

		else {

			if (low <= high) {

				int mid = (low + high) / 2;

				if (array[mid] == key) {
					return true;
				}

				else if (array[mid] > key) {
					return binarySearch(array, low, mid - 1, key);
				}

				else {
					return binarySearch(array, mid + 1, high, key);
				}

			}
			return false;

		}

	}

	/**********************************************************************************/

	public void insertionSortForInteger() {
		int array[] = integerInput();
		int length = array.length;
		for (int i = 0; i < length; i++) {
			int key = array[i];
			int j = i - 1;
			while ((j >= 0) && (array[j] > key)) {
				array[j + 1] = array[j];
				j = j - 1;
			}
			array[j + 1] = key;
		}
		System.out.println("Elements ofter insertion sort");
		for (int i = 0; i < length; i++) {
			System.out.print(array[i] + " ");
		}

	}

	/************************************************************************************/
	public void insertionSortForString() {
		String array[] = stringInput();
		int length = array.length;
		for (int i = 0; i < length; i++) {
			String key = array[i];
			int j = i - 1;
			while ((j >= 0) && (array[j].compareTo(key) > 0)) {
				array[j + 1] = array[j];
				j = j - 1;
			}
			array[j + 1] = key;
		}
		System.out.println("Elements ofter insertion sort");
		for (int i = 0; i < length; i++) {
			System.out.print(array[i] + " ");
		}

	}

	/**********************************************************************************/
	public void bubleSortForString() {
		String array[] = stringInput();
		int length = array.length;
		for (int i = 0; i < length; i++) {
			for (int j = 0; j < length - i - 1; j++) {

				if ((array[j].compareTo(array[j + 1])) > 0) {
					String temp = array[j];
					array[j] = array[j + 1];
					array[j + 1] = temp;
				}
			}
		}
		System.out.println("Elements ofter buble sort");
		for (int i = 0; i < length; i++) {
			System.out.print(array[i] + " ");
		}

	}

	/********************************************************************************/
	public void bubleSortForInteger() {
		int array[] = integerInput();
		int length = array.length;
		for (int i = 0; i < length; i++) {
			for (int j = 0; j < length - i - 1; j++) {
				if (array[j] > array[j + 1]) {
					int temp = array[j];
					array[j] = array[j + 1];
					array[j + 1] = temp;
				}
			}
		}
		System.out.println("Elements ofter buble sort");
		for (int i = 0; i < length; i++) {
			System.out.print(array[i] + " ");
		}
	}

	/**
	 * @param string2)
	 * @param string1
	/ ******************************************************************************/
	public boolean anagram(String string1, String string2) {
		char[] char1 = string1.toCharArray();
		char[] char2 = string2.toCharArray();
		Arrays.sort(char1);
		Arrays.sort(char2);

		String anagram1 = String.valueOf(char1);
		String anagram2 = String.valueOf(char2);

		if (anagram1.equals(anagram2))
			return true;
		return false;
	}

	/**
	 * this method is check the prime numbers are anagrams or not
	 * 
	 */
	/*********************************************************************************/
	public void primeAndAnagram() {
		ArrayList<String> al = new ArrayList<String>();
		al.add("2");
		al.add("3");
		int count = 0;
		for (int i = 4; i <= 1000; i++) {
			count = 0;
			for (int j = 2; j < i; j++) {
				if (i % j == 0) {
					count++;
					break;
				}
			}
			if (count == 0) {
				al.add(Integer.toString(i));
			}

		}
		System.out.print("Prime numbers:");
		System.out.println(al);
		String[] strArray = new String[al.size()];
		strArray = al.toArray(strArray);
		System.out.println("**************************************");		
		System.out.println("Prime numbers that are Anagrams:");
		for (int i = 0; i < strArray.length; i++) {
			for (int j = i + 1; j < strArray.length; j++) {
				if (anagram(strArray[i], strArray[j])) {
					System.out.println(strArray[i] + "->" + strArray[j]);
				}
			}
		}
		System.out.println();
		System.out.println("Prime numbers that are Palendroms:");

		for (int i = 0; i < strArray.length; i++) 
		{
			String temparary=new StringBuffer(strArray[i]).reverse().toString();
			if(temparary.equals(strArray[i]))
			{
				System.out.print(strArray[i]+" ");
			}
		}
	}
	/**
	 * @return ************************************************************************/

	public static int vendingMachine(int ammount) {
        int ammountCount = 0;
        while(ammount>0)
        {
        	if(ammount>=1000)
        	{
        		ammountCount=ammountCount+ammount/1000;
        		System.out.println("Nouber of 1000 Rupes Notes: "+ammount/1000);
        		ammount=ammount%1000;
        	}
        	else if(ammount>=500)
        	{
        		ammountCount=ammountCount+ammount/500;
        		System.out.println("Nouber of 500 Rupes Notes: "+ammount/500);
        		ammount=ammount%500;
        	}
        	else if(ammount>=100)
        	{
        	ammountCount=ammountCount+ammount/100;
    		System.out.println("Nouber of 100 Rupes Notes: "+ammount/100);
    		ammount=ammount%100;
        	}
        	else if(ammount>=20)
        	{
        	ammountCount=ammountCount+ammount/20;
    		System.out.println("Nouber of 20 Rupes Notes: "+ammount/20);
    		ammount=ammount%20;
        	}
        	else if(ammount>=10)
        	{
        	ammountCount=ammountCount+ammount/10;
    		System.out.println("Nouber of 10 Rupes Notes: "+ammount/10);
    		ammount=ammount%10;
        	}
        	else if(ammount>=5)
        	{
        	ammountCount=ammountCount+ammount/5;
    		System.out.println("Nouber of 5 Rupes Notes: "+ammount/5);
    		ammount=ammount%5;
        	}
        	else if(ammount>=2)
        	{
        	ammountCount=ammountCount+ammount/2;
    		System.out.println("Nouber of 2 Rupes Notes: "+ammount/2);
    		ammount=ammount%2;
        	}
        	else if(ammount>=1)
        	{
        	ammountCount=ammountCount+ammount/1;
    		System.out.println("Nouber of 1 Rupes Notes: "+ammount);
    		ammount=ammount%1;
        	}
        }
        return ammountCount;
	}
	public static int farenheattemperaturConversion(int input)
	{
			int farenheat=(input*9/5)+32;
			return farenheat;
		
		
	}
	
	public static int celciustemperaturConversion(int input)
	{
			int celcius=(input-32)*(9/5);
			return celcius;
		
		
	}
	public String tobinary(int decimalInput) {
		
		if(decimalInput==0)
			return "0";
		else
		{
			String result=" ";
			while(decimalInput>0)
			{
				if(decimalInput%2==0)
				{
					result="0"+result;
				}
				else if(decimalInput%2!=0)
				{
					result="1"+result;
				}
				decimalInput=decimalInput/2;
			}
			return "0"+result;
		}

	}

	public double sqrtUsingNewtonsMethod(double number) {
		double newNumber=number;
		double epsilon=1E-15;
		while((Math.abs(newNumber-number/newNumber)>epsilon*newNumber))
		{
			newNumber=((number/newNumber)+newNumber)/2.0;
		}
		return newNumber;
    		
	}

	public double monthlyPayment(double p, double rateOfInterst, int y) {
		double n=12*y;
		double r1=rateOfInterst/(12*100);
		double payment;
		double a=1-Math.pow((1+r1),-n);
		payment=(p*r1/(1-a));
		return payment;
	}

}
