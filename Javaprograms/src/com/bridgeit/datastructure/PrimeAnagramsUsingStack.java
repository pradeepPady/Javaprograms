/*************************************************************************************************************************************************
 *  Purpose: Printing the prime numbers that are anagrams storing in the stack using linked list and using stack reversing prime anagrams
 *         
 *  @author  bridgeit
 * 
 *  Date:    1/03/18
 *
 ************************************************************************************************************************************************/
package com.bridgeit.datastructure;

import com.bridgeit.utility.Utility;

public class PrimeAnagramsUsingStack {
	public static void main(String[] args) {
		Utility utility=new Utility();
		QueueUsingLinkedList userQueue=new QueueUsingLinkedList();

		for(int i=10;i<1000;i++)
		{
			boolean falg=utility.isPrime(i);
			if(falg)
			{
				StringBuilder sb=new StringBuilder(String.valueOf(i));
				sb=sb.reverse();
				String sb1=sb.toString();
				int a=Integer.valueOf(sb1);
				falg=utility.isPrime(Integer.valueOf(sb1));
				if(falg&&(a!=i))
				{
					userQueue.insert(i);
					userQueue.insert(Integer.valueOf(sb1));
				}
			}
		}
		userQueue.disply();
	}
}
