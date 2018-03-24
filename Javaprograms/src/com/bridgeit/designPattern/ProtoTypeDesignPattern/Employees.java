package com.bridgeit.designPattern.ProtoTypeDesignPattern;

import java.awt.List;
import java.util.ArrayList;

public class Employees implements Cloneable
{

		private ArrayList<String> empList;
		
		public Employees()
		{
			empList = new ArrayList<String>();
		}
		
		public Employees(ArrayList<String> list)
		{
			this.empList=list;
		}
		public void loadData()
		{
			
			empList.add("Pankaj");
			empList.add("Raj");
			empList.add("David");
			empList.add("Lisa");
		}
		
		public ArrayList<String> getEmpList()
		{
			return empList;
		}
		public Object clone() throws CloneNotSupportedException
		{
				ArrayList<String> temp = new ArrayList<String>();
				for(String s : this.getEmpList())
				{
					temp.add(s);
				}
				return new Employees(temp);
		}
		
	}
