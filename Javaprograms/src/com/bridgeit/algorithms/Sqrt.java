/***********************************************************************************
 * Purpose:finding Squqre of a number using newtons method
 * 
 * @author bridgeit
 * 
 * Date: 22/02/18
 ***********************************************************************************/
package com.bridgeit.algorithms;
import com.bridgeit.utility.Utility;
public class Sqrt {

	public static void main(String[] args) {
       System.out.println("Enter the number");
       Utility utility=new Utility();
       double number=utility.doubleInput1();
       boolean flag=utility.isNonZeroNumber(number);
       if(flag)
       {
    	  double result =utility.sqrtUsingNewtonsMethod(number);
    	  System.out.println(result);
       }
       else
       {
    	   System.out.println("Enter the Non Zero Number");
       }
       
      }

}
