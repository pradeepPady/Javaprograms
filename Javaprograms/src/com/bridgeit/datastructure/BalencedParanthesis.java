/**************************************************************************************************************************
 * Purpose:Cheacking the exprestion whether balenced or not
 * 
 * @author bridgeit
 * 
 * Date: 22/02/18
 **************************************************************************************************************************/
package com.bridgeit.datastructure;
import com.bridgeit.utility.Utility;
public class BalencedParanthesis {

	public static void main(String[] args) {
		System.out.println(("Blenced paranthesiss"));
		Utility utility=new Utility();
		System.out.println("Enter the exprestion");
		String expstion=utility.StringInput();
		String result=utility.isBalenced(expstion);
		System.out.println(result);
	}

}
