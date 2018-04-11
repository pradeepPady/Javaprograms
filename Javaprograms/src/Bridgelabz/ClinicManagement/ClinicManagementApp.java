package Bridgelabz.ClinicManagement;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

import org.codehaus.jackson.map.ObjectMapper;
import org.codehaus.jackson.type.TypeReference;

import AddressBook.Person;

public class ClinicManagementApp {
	static ArrayList<Docter>doctersList=new ArrayList<Docter>();
	static ArrayList<Patient>pationtList=new ArrayList<Patient>();
	 File docterFile=new File("/home/bridgeit/ClinicManagement/doctersList.json");
	 File patientFile=new File("/home/bridgeit/ClinicManagement/patientList.json");
	ObjectMapper mapper=new ObjectMapper();
	Scanner scanner=new Scanner(System.in);
	public void addDetails() 
	{
		boolean flag=true;
		while(flag)
		{
		System.out.print("\t\t\t _____________Add-Details_____________\n");
		System.out.print("\t\t\t|       1: Add Docter                |\n");
		System.out.print("\t\t\t|       2: Add Patent                |\n");
		System.out.print("\t\t\t|       3: Exit                      |\n");
		System.out.print("\t\t\t|____________________________________|\n");
		System.out.print("\t\t\tEnter your choice\n");
		int choice = scanner.nextInt();
		switch (choice) 
		{
		case 1:Docter docter=new Docter();
			  System.out.print("\t\t\tEnter Docter Name\n");
			  docter.setName(scanner.next());
			  System.out.print("\t\t\tEnter Docter Id\n");
			  docter.setId(scanner.nextInt());
			  System.out.print("\t\t\tEnter Docter Specilization\n");
			  docter.setSpcilization(scanner.next());
			  System.out.print("\t\t\tEnter Docter avalability\n");
			  docter.setAvalability(scanner.next());
			  doctersList.add(docter);
			  break;

		case 2:Patient patient=new Patient();
		       System.out.print("\t\t\tEnter Patient Name\n");
		       patient.setName(scanner.next());
		       System.out.print("\t\t\tEnter Patient Id\n");
		       patient.setId(scanner.nextInt());
		       System.out.print("\t\t\tEnter Patient Mobile number\n");
		       patient.setMobileNumber(scanner.nextInt());
		       System.out.print("\t\t\tEnter Patient Age\n");
		       patient.setAge(scanner.nextInt());
		       pationtList.add(patient);
			   break;
		case 3:flag=false;
		       break;
		}
		}
	}

	public void searchDetails()
	{
		
		
	}

	public void displyDetails()
	{
		
		
	}

	public void appointment() 
	{
		
		
	}

	public void getAppointment() 
	{
		
		
	}
	public void save () throws FileNotFoundException
	{
		BufferedReader bufferedReader=new BufferedReader(new FileReader(docterFile));
		String jsonArray;
		ArrayList<Docter>arrayList=new ArrayList<Docter>();

		try {
			if((jsonArray=bufferedReader.readLine())!=null)
			{
				System.out.print(jsonArray+"\n");
				TypeReference<ArrayList<Docter>> typeReference = new TypeReference<ArrayList<Docter>>() {};
				arrayList = mapper.readValue(jsonArray, typeReference);
				
			}
			doctersList.addAll(arrayList);
		} catch (IOException e1) {
			e1.printStackTrace();
		}
		try {
			mapper.writeValue(new FileOutputStream(docterFile), doctersList);
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	public void savePatient() throws FileNotFoundException {
		
		BufferedReader bufferedReader=new BufferedReader(new FileReader(patientFile));
		String jsonArray;
		ArrayList<Patient>arrayList=new ArrayList<Patient>();

		try {
			if((jsonArray=bufferedReader.readLine())!=null)
			{
				System.out.print(jsonArray+"\n");
				TypeReference<ArrayList<Docter>> typeReference = new TypeReference<ArrayList<Docter>>() {};
				arrayList = mapper.readValue(jsonArray, typeReference);
				
			}
			pationtList.addAll(arrayList);
		} catch (IOException e1) {
			e1.printStackTrace();
		}
		try {
			mapper.writeValue(new FileOutputStream(patientFile), pationtList);
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	

}
