package bridgelabz.clinicmanagement;

import java.io.IOException;
import java.text.ParseException;
import java.util.Scanner;

import org.codehaus.jackson.JsonGenerationException;
import org.codehaus.jackson.map.JsonMappingException;

public class Clinic{
	public static void main(String[] args) throws ParseException, JsonGenerationException, JsonMappingException, IOException {
		
		ClinicManagementApp app = new ClinicManagementApp();
		Scanner scanner = new Scanner(System.in);
		boolean flag=true;
		while(flag)
		{
			System.out.print("\t\t\t _______________Menu__________________ \n");
			System.out.print("\t\t\t|                                     |\n");
			System.out.print("\t\t\t|       1: Add Detials                |\n");
			System.out.print("\t\t\t|       2: Search Detils              |\n");
			System.out.print("\t\t\t|       3: Display detils             |\n");
			System.out.print("\t\t\t|       4: Take Appoientment          |\n");
			System.out.print("\t\t\t|       5: Get famous docter          |\n");
			System.out.print("\t\t\t|       6: Exit                       |\n");
			System.out.print("\t\t\t|          Enter Your Choice          |\n");
			System.out.print("\t\t\t|_____________________________________|\n");
			System.out.print("\t\t\tEnter your choice\n");
			int choice = scanner.nextInt();
			
			switch (choice) {
			case 1:app.addDetails();
				break;
			case 2:app.searchDetails(); 
				break;
			case 3:app.displyDetails();

				break;
			case 4:app.appointment();

				break;
			case 5:app.getFamousDocter();

				//break;

			case 6:flag=false;
				break;
			}
		} 
		scanner.close();
		
		

	}

	
}
