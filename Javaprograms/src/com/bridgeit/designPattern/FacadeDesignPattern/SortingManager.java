package com.bridgeit.designPattern.FacadeDesignPattern;

public class SortingManager 
{
			BubbleSortForInteger bubbleSortForInteger;
			BubbleSortForString bubbleSortForString;
			InsertionSortForInteger insertionSortForInteger;
			InsertionSortForString insertionSortForString;
			public SortingManager()
			{
				bubbleSortForInteger=new BubbleSortForInteger();
				bubbleSortForString=new BubbleSortForString();
				insertionSortForInteger=new InsertionSortForInteger();
				insertionSortForString=new InsertionSortForString();
			}
			public void bubbleSortForIntegerFromSortinManager()
			{
				this.bubbleSortForInteger.sort();
			}
			public void bubbleSortForStringFromSortinManager()
			{
				this.bubbleSortForString.sort();
			}
			public void insertionSortForIntegerFromSortinManager()
			{
				this.insertionSortForInteger.sort();
			}
			public void  insertionSortStringFromSortinManager()
			{
				this.insertionSortForString.sort();
			}
}
