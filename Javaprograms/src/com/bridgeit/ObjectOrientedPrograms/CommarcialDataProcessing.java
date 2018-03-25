


package com.bridgeit.ObjectOrientedPrograms;
import com.bridgeit.utility.*;
import com.bridgeit.utility.Utility;
public class CommarcialDataProcessing {

	public static void main(String[] args) throws Exception {
		Utility utility = new Utility();

		while (true) {
			System.out.println("Enter your choice:");
			System.out.println("1. Create user");
			System.out.println("2. Buy Share");
			System.out.println("3. Sale Share");
			System.out.println("4. Display Details");
			System.out.println("5. Exit");
			int choice = utility.IntegerInput();
			switch (choice) {
			case 1:
				utility.createAcc();
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
			default:
				return;
			}
		}

	}

}
