/***********************************************************************************
 * Purpose:replacing the user name in the given pattern
 * 
 * @author bridgeit
 * 
 * Date: 22/02/18
 * 
 ***********************************************************************************/
package com.bridgeit.functional_programs;
import com.bridgeit.utility.Utility;
public class StringReplace {
	public static final String GIVENPATTERN="Hello <<Username>>, How are You?";
	public static void main(String[] args) {
		Utility utility = new Utility();
		System.out.println("Enter the User name");
		String userName=utility.StringInput();
		boolean trueOrFalse=utility.userName(userName);
		if(trueOrFalse)
		{

			System.out.println(utility.replacing(userName,GIVENPATTERN));

		}
		else
		{
			System.out.println("enter the correct UserName");
		}

	}

}
