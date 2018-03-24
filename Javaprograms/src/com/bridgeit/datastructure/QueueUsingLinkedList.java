package com.bridgeit.datastructure;

public class QueueUsingLinkedList {
 Node2 front=null;
 Node2 rear=null;
 public void insert(int item)
 {
	 Node2 node=new Node2();
	 node.data=item;
	 node.next=null;
	 if(rear==null)
	 {
		 front=node;
		 rear=node;
	 }
	 else
	 {
		 rear.next=node;
		 rear=node;
	 }
	 
 }
 public void deleteFront()
 {
	 if(front!=null)
	 {
	 Node2 temp=front;
	 front=front.next;
	 temp=null;
	 }
 }
 public void deleteRear()
 {
	 Node2 temp=rear;
	 if(front!=null)
	 {
		 while(temp.next!=rear)
		 {
			 temp=temp.next;
		 }
		 rear=null;
		 rear=temp;
	 }
	 
 }
 public void disply()
 {
	 Node2 temp=front;
	 while(temp!=null)
	 {
		 System.out.print("["+temp.data+"-->"+temp.next.data+"]");
		 System.out.println();
		 temp=temp.next.next;
	 }
 }
}
class Node2
{
	int data;
	Node2 next;
}