package com.bridgeit.ObjectOrientedPrograms;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.text.ParseException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Date;
import java.util.Iterator;
import java.util.Map;

import com.bridgeit.utility.Utility;
import com.bridgeit.utility.Utility2;
public class Main
{
					ArrayList<DoctersModel> doctorList;
					ArrayList<PatientModel> patientsList;
					@SuppressWarnings("rawtypes")
					Utility2 utility;
					
					public Main()
					{
						utility=new Utility2();
						doctorList=new ArrayList<DoctersModel>();
						patientsList=new ArrayList<PatientModel>();
					}
					
	public static void main(String args[]) throws ParseException, IOException, org.json.simple.parser.ParseException
	{
		Main mainObject=new Main();
		String exit;

		do
		{
			System.out.println("Menu");
			System.out.println("1: Enter Doctors Detials");
			System.out.println("2: Enter Patients Detils");
			System.out.println("3: Search Patients Detils");
			System.out.println("4: Search Doctors Detils");
			System.out.println("5: Display all Doctors detils");
			System.out.println("6: Display all Patient detils");
			System.out.println("7: Take Appoientment");
			System.out.println("8: Print Appoientment");
			System.out.println("Enter Your Choice");
			mainObject.menuChoice(mainObject.utility.IntegerInput());
			System.out.println("Enter E to Exit");
			exit=mainObject.utility.StringInput();
		}
		while(!exit.equalsIgnoreCase("E"));
		
	}

	@SuppressWarnings("unchecked")
	public void menuChoice(int choice) throws ParseException, IOException, org.json.simple.parser.ParseException
	{
		System.out.println();
		switch(choice){
			case 1: System.out.println("Enter Name: ");
					String name=utility.StringInput();
					System.out.print("Enter Id: ");
					String id=utility.StringInput();
					System.out.println();
					System.out.print("Enter specialization: ");
					String specialization=utility.StringInput();
					System.out.println();
					System.out.print("Enter availability (1:AM 2:PM 3:both)");
					String availability=utility.StringInput();
					System.out.println();
					doctorList.add(new DoctersModel(name,id,specialization,availability));
		break; 
		
			case 2: System.out.println("Enter Patients Details ...");
					System.out.print("Enter Id: ");
					String patientId=utility.StringInput();
					System.out.println();
					System.out.print("Enter Mobile Number: ");
					String mobileNumber=utility.StringInput();
					System.out.println();
					System.out.print("Enter age: ");
					int age=utility.IntegerInput();
					System.out.println();
					patientsList.add(new PatientModel(patientId,mobileNumber,age));
		break;
		
		case 3:     searchPatientMenu();
		break;
		
		case 4:     searchDoctorsMenu();
		break;
		
		case 5:     DoctersModel.disply();
		break;
		
		case 6:     PatientModel.disply();
					System.out.println();
		break;
		
		case 7:     takeAppoientment();
		break;
		
		case 8:    DoctersModel.appointmentDisply();
		break;
		
		}

	}
		public void searchPatientMenu() throws FileNotFoundException, IOException, org.json.simple.parser.ParseException
		{
				System.out.println("Search Patient By");
				System.out.println("1 Mobile Number");
				System.out.println("2 Id");
				System.out.println("3 Age");
				System.out.println("Enter Your Choice");
				searchPatient(utility.IntegerInput());
		}
		public void searchDoctorsMenu() throws FileNotFoundException, IOException, org.json.simple.parser.ParseException
		{
				System.out.println("Search Doctors By");
				System.out.println("1 Name");
				System.out.println("2 Id");
				//System.out.println("3 Specialization");
				System.out.println("3 Availability");
				System.out.println("Enter Your Choice");
				searchDoctors(utility.IntegerInput());
		}
		
			public void searchDoctors(int choice) throws FileNotFoundException, IOException, org.json.simple.parser.ParseException
			{
				System.out.println();
				switch(choice)
				{
						case 1: System.out.println("Enter Name of Doctor");
						      
						        DoctersModel.searchByName(utility.StringInput());
					break;
					
						case 2: System.out.println("Enter Id of Doctor");
						        DoctersModel.searchById(utility.StringInput());
					break;
					
						case 3:System.out.println("Enter Availability of Doctor");
				                DoctersModel.searchByAvailability(utility.StringInput());
						break;
						
				}
			}
				public void searchPatient(int choice) throws FileNotFoundException, IOException, org.json.simple.parser.ParseException
				{
					System.out.println();
					switch(choice)
					{
						case 1: System.out.println("Enter Id of Patient");
						        PatientModel.searchByMobileNUmber(patientsList,utility.StringInput());
						       
					break;
					
						case 2: System.out.println("Enter Id of Patient");
						        PatientModel.searchById(patientsList,utility.StringInput());
					break;
					
						case 3: System.out.println("Enter Age of Patient");
						PatientModel.searchByAge(patientsList,utility.IntegerInput());
					break; 
					
					}
				}

	@SuppressWarnings({ "unchecked", "unused" })
	public void takeAppoientment() throws ParseException, IOException, org.json.simple.parser.ParseException
	{
		System.out.println("Enter Doctor Id");
		String docorId=utility.StringInput();
		int count=DoctersModel.search(docorId);
		if(count>1)
			{
					System.out.println("There are "+count+" Number of Docters with a id "+docorId);
					System.out.println("Please.....enter the Doctore name");
					String name=utility.StringInput();
					System.out.println("Enter Date of Appoientmentd (XX/YY/ZZZZ):");
					Date date=utility.stringToDate(utility.StringInput());
					String date1=date.toString();

				    if(date==null)
					System.out.println("Date format is not correct");
					else
					{	
						DoctersModel.upDateAppointmentIntoFile(date1,docorId,count,name);	
					}
				
			}
		else if(count==1)
		{
			System.out.println("Enter Date of Appoientmentd (01/05/2016):");
			Date date=utility.stringToDate(utility.StringInput());
			String date1=date.toString();
			if(date==null)
			       System.out.println("Date format is not correct");
			else
			{
				System.out.println("Please enter.... Doctore name..");
				String name=utility.StringInput();
				DoctersModel.upDateAppointmentIntoFile(date1,docorId,count,name);
			}
		}
		
			else
			{
				 System.out.println("Invalid Doctor Id");
			}
		 
	}
}
	   
	