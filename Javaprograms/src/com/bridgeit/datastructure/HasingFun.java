/*************************************************************************************************************************************************
 *  Purpose: Reading numbers from the file,storing the numbers according to hashing function and
 *          searching if word found then remove it else add to list
 *
 *  @author  bridgeit
 * 
 *  Date:    1/03/18
 *
 ************************************************************************************************************************************************/
package com.bridgeit.datastructure;
import java.io.IOException;
import com.bridgeit.utility.Utility;
public class HasingFun {
	public static void main(String args[]) throws IOException
	{
		
		Utility utility=new Utility();
		String arrray[]=utility.hashinFileReading();
		utility.hasingImplimentation(arrray);
	}
}
