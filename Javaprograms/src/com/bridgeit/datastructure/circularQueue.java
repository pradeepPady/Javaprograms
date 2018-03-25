
package com.bridgeit.datastructure;
public class circularQueue {
	int top=0,rear=-1;
	static int count;
	static int count1;
	static int size;
	   
	int queue[]=new int[size];
	public void insert(int data)
	{
		if(count==size)
		{
			System.out.println("Queue is full");
		}
		else if(count1==0)
		{
			System.out.println("\t\t\tPlease.. add the peoples into the queue");
		}
		else
		{
			count++;
			rear=rear++;
			queue[rear]=data;
			count1--;

		}
	}
	public void delete(int data) throws Exception
	{
		if(count==0||count1==0)
		{
			throw new Exception();
		}
		else
		{
			System.out.println(" person deleted from the queue");
			top=(top+1)%size;
			count--;
			count1--;
		}
	}
	public int size()
	{		return count1;
	}


}