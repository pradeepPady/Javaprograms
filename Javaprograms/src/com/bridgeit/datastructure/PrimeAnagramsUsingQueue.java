/*************************************************************************************************************************************************
 *  Purpose: Printing the prime numbers that are anagrams storing in the queue using linked list and using queue reversing prime anagrams
 *         
 *
 *  @author  bridgeit
 * 
 *  Date:    1/03/18
 *
 ************************************************************************************************************************************************/
package com.bridgeit.datastructure;
import com.bridgeit.utility.Utility;
public class PrimeAnagramsUsingQueue {
	public static void main(String args[])
	{
		UserDefinedLinkedList<Integer>al=new UserDefinedLinkedList<Integer>();
		UserDefinedStack userDefinedStack=new UserDefinedStack();
		Utility utility=new Utility();
			for(int i=10;i<1000;i++)
			{
					boolean falg=utility.isPrime(i);
					if(falg)
					{
							StringBuilder stringBuilder=new StringBuilder(String.valueOf(i));
							stringBuilder=stringBuilder.reverse();
							String sb1=stringBuilder.toString();
							int a=Integer.valueOf(sb1);
							falg=utility.isPrime(Integer.valueOf(sb1));
								if(falg&&(a!=i))
								{
									al.add(i);
									al.add(Integer.valueOf(sb1));
								}
					}
			}
		Integer[] array = al.getElem();
		for(int i=array.length-1;i>=0;i--)
		{
			userDefinedStack.push(array[i]);
		}
		System.out.println("------------------------------------------------------:Prime numbers that are Anagrams in reverse order:-----------------------------------------------");
		System.out.println();
		System.out.print("(");
		for(int i=0;i<array.length;i++)
		{
			System.out.print(userDefinedStack.pop()+" ");
		}
		System.out.print(")");
	}
}
