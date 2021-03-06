
package com.bridgeit.datastructure;
public class UserDefinedDeQueue<T> {
	public Deque<T>front=null;
	public Deque<T>rear=null;
	int size=0;
	public void addFront(T item)
	{
		if(front==null)
		{
			Deque<T> node=new Deque<T>();
			node.data=item;
			node.next=null;
			front=node;
			rear=front;
		}
		else
		{
			Deque<T> node=new Deque<T>();
			node.data=item;
			node.next=null;
			node.next=front;
			front=node;

		}
		size++;
	}

	public T removeFront()
	{ 
		T value=null;
		if(front!=null)
		{
			Deque<T>temp=front;
			value=front.data;
			front=front.next;
		}
		size--;
		return value;
	}

	@SuppressWarnings("unchecked")
	public T removeRear()
	{
		T value=null;
		if(rear!=null)
		{
			value=rear.data;
			rear.next=null;
			Deque<T>temp=front;
			while((temp.next.next!=null)&&temp!=null)
			{
				temp=temp.next;
			}
			rear=temp;
			size--;
			return value;
		}

		else
		{
			return null;
		}
	}

	public int sizeReturn()
	{
		return size;
	}

	public boolean isEmpty()
	{
		if(front==null)
		{
			return true;
		}
		else
		{
			return false;
		}
	}

	@SuppressWarnings("unused")
	public void add(T item) {
		Deque<T>temp=rear;
		Deque<T> node=new Deque<T>();
		node.data=item;
		node.next=null;
		rear.next=node;
		rear=node;
		
	}

}
class Deque<T>
{

	public T data;
	public Deque next;
}
