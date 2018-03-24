package com.bridgeit.ObjectOrientedPrograms;

import java.io.IOException;
import java.util.Scanner;

import org.json.simple.parser.ParseException;

import com.bridgeit.utility.Utility;

public class AddressBook3 {
    public static void main(String[] args) throws IOException, ParseException
    {
    	
            Utility utility=new Utility();
            Entrys entrys =new Entrys();
            while(true)
            {
            System.out.println("\t\t===>\t   Select an option!\n");
            System.out.println("\t\t===>\t1. Add an entry     \n");
            System.out.println("\t\t===>\t2. Remove an entry  \n");
            System.out.println("\t\t===>\t3. Edit an entry    \n");
            System.out.println("\t\t===>\t4. Sort all entries \n");
            System.out.println("\t\t===>\t7. Exit the menu    \n");
            System.out.print("\t\t\t--------------------->\n");
            int selection = utility.IntegerInput();
            String first, last, address,city,mobilenumber;
            int Zip;
            switch(selection){
            case 1: 
	                System.out.print("\t\t===>\tFirst name?  \n");
	                first = utility.StringInput();
	                System.out.print("\t\t===>\tLast name?   \n");
	                last = utility.StringInput();
	                System.out.print("\t\t===>\tAddress?     \n");
	                address = utility.StringInput();
	                System.out.print("\t\t===>\tCity?     \n");
	                city = utility.StringInput();
	                System.out.print("\t\t===>\tMobile number?     \n");
	                mobilenumber = utility.StringInput();
	                System.out.print("\t\t===>\tZip?         \n");
	                Zip = utility.IntegerInput();
	                entrys.addingToJsonFile(first,last,address,Zip,city,mobilenumber);
                break;
            case 2: System.out.println("\n\t\t===>\tEnter the First Name and last name to Remove from entry\n");
                    entrys.removeAnEntry(utility.StringInput(),utility.StringInput());
                    System.out.println("\t\t\tRemoved data sucsessfully.....");
                break;
            case 3:
		                System.out.print("\t\t===>\tEdit which entry?\n");
		                System.out.print("\t\t===>\t1:First name? \n");
		                
		                System.out.print("\t\t===>\t2:Last name? \n");
		               
		                System.out.print("\t\t===>\t3:Address?   \n");
		                
		                System.out.print("\t\t\t4:Zip-code?  \n");
                        int whichEntry = utility.IntegerInput();
					               switch (whichEntry) 
					               {
								 case 1:System.out.println("\t\t===>\tEnter the name  \n");
									   String first1=utility.StringInput() ; 
								       entrys.editEntry1(first1);
									  break;
									
					             case 2:System.out.println("\t===>\t\tEnter the Last name  \n");
					            	    String last1=utility.StringInput() ;
					                    entrys.editEntry2(last1);
									   break;
									
					             case 3:System.out.println("\t\t===>\tEnter the adress   \n");
					            	 String address1=utility.StringInput() ;
					                 entrys.editEntry3(address1);
						                 break;
						          
					             case 4:System.out.println("\t\t===>\tEnter the Zip-Code   \n");
					            	    int zip=utility.IntegerInput() ;
					                    entrys.editEntry4(zip);
					                    break;
					               } 
					               System.out.println("\t\t\tData Edited sucsessfully.....\n");
					               break;
		             
					   case 4: System.out.print("\t===>\t\tSort by which entry?\n");
				               System.out.print("\t===>\t\t1:First name? \n");
				               System.out.print("\t===>\t\t2:Zip-code?  \n");
				               System.out.println("\t===>\t\tEnter your choice:");
		                       int whichEntry1 = utility.IntegerInput();
		                       entrys.sorting(whichEntry1);
		                
						}
			    }
               
                
             
            }

        }
    

