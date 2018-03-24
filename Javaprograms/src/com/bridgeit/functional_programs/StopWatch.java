/****************************************************************************************************************
 * Purpose:program to implement the stop watch
 * 
 * @author bridgeit
 * 
 * Date: 22/02/18
 ****************************************************************************************************************/
package com.bridgeit.functional_programs;
import com.bridgeit.utility.Utility;
public class StopWatch {
	public static void main(String args[]) throws Exception
	{
		Utility utility=new Utility();
		System.out.println("Stop Watch");
		long startTime;
		System.out.println("do you want to start 1/0 ");
		int choice=utility.IntegerInput();
		for(int i=1;i<=3;i++)
		{
			System.out.println(i+"...");
			Thread.sleep(1000);
		}
		System.out.println("started.....");
		do {

			startTime=System.currentTimeMillis();
			System.out.println("do you want to stop 0/1");
			choice=utility.IntegerInput();
		}while(choice==1);
		long endTime=System.currentTimeMillis();
		float elapsedTime=(endTime-startTime)%100;
		System.out.println("Elased Time :"+" "+elapsedTime+"seconds");

	}

}
