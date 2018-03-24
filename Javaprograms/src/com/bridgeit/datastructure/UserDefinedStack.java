package com.bridgeit.datastructure;

public class UserDefinedStack

{
	private Object[] data;
	private int index = 0;
	private int size = 0;

	/**
	 * 
	 */
	public UserDefinedStack() 
	{
		super();
		this.size = 30; 
		data = new Object[this.size];
	}
	/**
	 * @param o
	 * @throws 
	 */
	public void push(Object o) {
		if (index >= size) {
			this.increaseSize();
		}
		this.data[index] = o;
		index++;
	}
	/**
	 * @return
	 */
	public Object pop() 
	{
		if (index != 0) {
			Object obj = data[index - 1];
			this.data[index - 1] = null; 
			index--;
			return obj;
		} else
			return null;
	}
	public Object peek() throws RuntimeException {
		if (index != 0)
			return this.data[index - 1];
		else
			return null;
	}
	
	public boolean isEmpty() {
		return index == 0 ? true : false;
	}

	public int getStackSize() {
		return index;
	}

	public void deleteStack() {
		if (index != 0) {
			for (int i = 0; i < index; i++) {
				this.data[i] = null;
			}
			index = 0;
			System.out.println("The Stack has been deleted");
		}
	}
	private void increaseSize() {
		Object[] temp = new Object[size];
		size = size * 2;
		for (int i = 0; i < index; i++) {
			temp[i] = this.data[i];
		}
		this.data = new Object[this.size];
		for (int i = 0; i < index; i++) {
			this.data[i] = temp[i];
		}
	}
}