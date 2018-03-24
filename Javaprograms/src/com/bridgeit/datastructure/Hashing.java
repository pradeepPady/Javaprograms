/**************************************************************************************************************************
 * Purpose: hashing fun implementation
 * 
 * @author bridgeit
 * 
 * Date: 22/02/18
 **************************************************************************************************************************/
package com.bridgeit.datastructure;
import com.bridgeit.utility.Utility;
public class Hashing
{
	public static void main(String args[]) throws Exception
	{

		UserDefinedLinkedList ud[]=new UserDefinedLinkedList[11];
		Utility utility=new Utility();
		String stringArray[]=utility.fileReading();
		int intArray[]=new int[stringArray.length];
		for(int i=0;i<stringArray.length;i++)
		{
			intArray[i]=Integer.parseInt(stringArray[i]);
		}
		for(int i=0;i<intArray.length;i++)
		{
			int rem=intArray[i]%11;
			if(ud[rem]==null)
			{
				ud[rem]=new UserDefinedLinkedList();
				ud[rem].add(intArray[i]);
			}
			else
			{
				ud[rem].add(intArray[i]);
			}
		}
	}



}
