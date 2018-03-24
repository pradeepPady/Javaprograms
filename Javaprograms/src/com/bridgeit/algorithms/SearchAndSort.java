
/***********************************************************************************
 * Purpose:binary search for string and integer,
 *         bubble sort for integer and string,
 *         insertion sort for integer and string
 * 
 * @author bridgeit
 * 
 * Date: 22/02/18
 * 
 ***********************************************************************************/
package com.bridgeit.algorithms;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import java.util.TreeMap;
import com.bridgeit.utility.Utility;

public class SearchAndSort {

	public static void main(String[] args) {
		int t=6;
		Utility utility=new Utility();
		HashMap<String,Long>hm=new HashMap<String,Long>();
		while(t-->0)
		{
			System.out.println("*****************************");
			System.out.println("* Binery serch for Integer  *:  Enter 1");
			System.out.println("*****************************");
			System.out.println("* Binery serch for String   *:  Enter 2");
			System.out.println("*****************************");
			System.out.println("* Insertion sort forInteger *:  Enter 3");
			System.out.println("*****************************");
			System.out.println("* Insertin  sort for String *:  Enter 4");
			System.out.println("*****************************");
			System.out.println("* Buble  sort for String    *:  Enter 5");
			System.out.println("*****************************");
			System.out.println("* Buble  sort for Integer   *:  Enter 6");
			System.out.println("*****************************");
			System.out.println("* Press Any key to exit     *");
			System.out.println("*****************************");
			System.out.println();
			System.out.println("Enter your choice");
			int choice=utility.IntegerInput();
			long startTime=0;
			long elapsedTime=0;
			switch(choice)
			{
			/***********************************************************/
				case 1:System.out.println("BinarySearchForInteger"); System.out.println();
	
				startTime=System.currentTimeMillis();
	
				utility.BinarySearchForInteger();System.out.println();
	
				elapsedTime=(System.currentTimeMillis()-startTime)/1000;
	
				hm.put("BinarySearchForInteger", elapsedTime);
				break;

			/***********************************************************/
				case 2:System.out.println("BinarySearchForSting"); System.out.println();
	
				startTime=System.currentTimeMillis();
	
				utility.BinarySearchForSting();System.out.println();
	
				elapsedTime=(System.currentTimeMillis()-startTime)/1000;
	
				hm.put("BinarySearchForSting", elapsedTime);
				break;
			/***********************************************************/
				case 3:System.out.println("insertionSortForInteger"); System.out.println();
	
				startTime=System.currentTimeMillis();
	
				utility.insertionSortForInteger();System.out.println();
	
				elapsedTime=(System.currentTimeMillis()-startTime)/1000;
	
				hm.put("insertionSortForInteger", elapsedTime);
				break;
			/***********************************************************/
				case 4:System.out.println("insertionSortForString"); System.out.println();
	
				startTime=System.currentTimeMillis();
	
				utility.insertionSortForString();System.out.println();
	
				elapsedTime=(System.currentTimeMillis()-startTime)/1000;
	
				hm.put("insertionSortForString", elapsedTime);
				break;
			/***********************************************************/
				case 5:System.out.println("BubleSortForString"); System.out.println();
	
				startTime=System.currentTimeMillis();
	
				utility.bubleSortForString();System.out.println();
	
				elapsedTime=(System.currentTimeMillis()-startTime)/1000;
	
				hm.put("insertionSortForString", elapsedTime);
				break;


			/***********************************************************/
			case 6:System.out.println("BubleSortForInteger"); System.out.println();
			startTime=System.currentTimeMillis();

			utility.bubleSortForInteger();System.out.println();

			elapsedTime=(System.currentTimeMillis()-startTime)/1000;

			hm.put("BubleSortForInteger", elapsedTime);

			break;
			default:break;
			}

		}
		Map<String, Long> map = new TreeMap<String, Long>(hm); 
		Set<Entry<String, Long>> set2 = map.entrySet();
		Iterator<Entry<String, Long>> iterator2 = set2.iterator();
		while(iterator2.hasNext()) {
			@SuppressWarnings("rawtypes")
			Map.Entry me2 = (Map.Entry)iterator2.next();
			System.out.print(me2.getKey() + ": ");
			System.out.println(me2.getValue()+"seconds");
		}


	}

}
