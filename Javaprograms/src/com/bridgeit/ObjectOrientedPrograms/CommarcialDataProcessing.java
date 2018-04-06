
<<<<<<< HEAD
 *  @author  Pardeep
 *  @version 1.0
 *  @since   22-03-2018
 *
 ******************************************************************************/
=======


>>>>>>> 20706c570f531bca25d3c874919c814a39e2bdef
package com.bridgeit.ObjectOrientedPrograms;

import com.bridgeit.datastructure.UserDefinedLinkedList;
import com.bridgeit.utility.Utility;

public class CommarcialDataProcessing {

	public static void main(String[] args) throws Exception {
		Utility utility = new Utility();
		UserDefinedLinkedList<?> userDefinedLinkedList1=new UserDefinedLinkedList<>();
		UserDefinedLinkedList<?> userDefinedLinkedList2=new UserDefinedLinkedList<>();
		UserDefinedLinkedList<?> userDefinedLinkedList3=new UserDefinedLinkedList<>();
		String companyFile="/home/bridgeit/myPrograms/Javaprograms/CompanyShares1.json";
		while (true) 
		{
			System.out.println("Enter your choice:");
			System.out.println("1. Create user");
			System.out.println("2. Buy Share");
			System.out.println("3. Sale Share");
			System.out.println("4. Display Details");
			System.out.println("5. Company shares Management");
			System.out.println("7. Exit");
			int choice = utility.IntegerInput();
			switch (choice) {
			case 1:
				utility.createUserAccount();
				break;
			case 2:
				utility.buyShare();
				break;

			case 3:
				utility.saleShare();
				break;
			case 4:
				utility.display();
				break;
		    case 5:utility.companyShareManageMent(userDefinedLinkedList1,userDefinedLinkedList2,userDefinedLinkedList3,companyFile);
			          break;
		    case 6:utility.removeDataFromLinkedList(userDefinedLinkedList1,userDefinedLinkedList2,userDefinedLinkedList3,companyFile);
		    
		    default:
				
				
				
				return;
			}
		}

	}

}
