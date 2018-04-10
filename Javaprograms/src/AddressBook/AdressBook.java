package AddressBook;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;
public class AdressBook {
	Scanner scanner=new Scanner(System.in);
	AdressBookManager adressBookManager=new AdressBookManager();
	ArrayList<Person>arraylist;
	public void adressBookOperation(ArrayList<Person> arrayList2, File file1) throws IOException {
		
		System.out.print("\t\t\t============Menu==============\n\n");
		System.out.print("\t\t\tEdit                  Enter 1:\n");
		System.out.print("\t\t\tAdd an entry to book  Enter 2:\n");
		System.out.print("\t\t\tSort all entries      Enter 3:\n");
		System.out.print("\t\t\tDisply file Data      Enter 4:\n\n");
		System.out.print("\t\t\tDelete Person         Enter 5:\n");
		System.out.print("\t\t\t===============================\n");
		int choice=scanner.nextInt();
		switch (choice) 
		{
		case 1:arraylist=editMenu(arrayList2);

		break;
		case 2:System.out.println(arrayList2);
		arraylist=adressBookManager.addPerson(arrayList2);

		break;
		case 3:arraylist=sortMenu(arrayList2);

		break;
		case 4:diplyData(arrayList2);
		default:
		case 5:deleteData(arrayList2);
			break;
		}
	}

	private void deleteData(ArrayList<Person> arrayList2) 
	{
		System.out.println("\t\t\tEnter the Person First name and Last name to delete from file");
		String firstName=scanner.next();
		String lastName=scanner.next();
		for(int i=0;i<arrayList2.size();i++)
		{
			if((arrayList2.get(i).getFirstName().equals(firstName))&&(arrayList2.get(i).getLastName().equals(lastName)))
			{
				arrayList2.remove(i);
				System.out.println("\t\t\tData removed sucsessfully");
				break;
			}
		}
		System.out.println("\t\t\tSave the data before Disply...");
	}

	private void diplyData(ArrayList<Person> arrayList2)
	{
		System.out.println("\t\t\t*******Disply********");
		for(int i=0;i<arrayList2.size();i++)
		{
			System.out.println("\t\t\t========Data "+(i+1)+"========");

			System.out.println("\t\t\tFirst name :"+arrayList2.get(i).getFirstName());
			System.out.println("\t\t\tLast name  :"+arrayList2.get(i).getLastName());
			System.out.println("\t\t\tAddress    :"+arrayList2.get(i).getAddress());
			System.out.println("\t\t\tCity       :"+arrayList2.get(i).getCity());
			System.out.println("\t\t\tZip-Code   :"+arrayList2.get(i).getZip());
			System.out.println("\t\t\t=======================\n\n\n");


		}
		System.out.println("\t\t\t=======================");

	}

	private ArrayList<Person> sortMenu(ArrayList<Person> arrayList2) {
		System.out.println("\t\t\tSort by name Enter 1:");
		System.out.println("\t\t\tSort by Zip  Enter 2:");
		int choice=scanner.nextInt();
		switch (choice) 
		{
		case 1:Collections.sort(arrayList2, new Comparator<Person>() 
		    {
			    public int compare(Person one, Person other) 
			    {
			        return one.getFirstName().compareTo(other.getFirstName());
			     }
		   });
		System.out.println("\t\t\tData sorted by Name sucsessfully...");
		return arrayList2;
		case 2:Collections.sort(arrayList2, new Comparator<Person>() 
	    {
		    public int compare(Person one, Person other) 
		    {
		        return (String.valueOf(one.getZip()).compareTo(String.valueOf(other.getZip())));
		     }
	   }); 
		System.out.println("\t\t\tData sorted by Zip-Code sucsessfully...");

	return arrayList2;

		default:
			break;
		}
		return arrayList2;
		
	}

	public ArrayList<Person> editMenu(ArrayList<Person> arrayList2) 
	{
		System.out.println("\t\t\tEnter the First name and Last Name Which You want to edit");
		String firstName=scanner.next();
		String lastName=scanner.next();
	    System.out.println("\t\t\tEnter the mobile number");
	    int  mobilenumber=scanner.nextInt();
		System.out.println("\n\n");
		System.out.print("\t\t\t========Menu=======\n\n");


		System.out.print("\t\t\tAddress?   Enter 1:\n");
		System.out.print("\t\t\tState?     Enter 2:\n");
		System.out.print("\t\t\tZip-code?  Enter 3:\n");
		System.out.print("\t\t\tCity?      Enter 4:\n");
		System.out.println("\t\t\tEnter your choice   ");
		System.out.print("\t\t\t==================\n\n");

		int choice=scanner.nextInt();
		switch (choice) 
		{
		case 1:System.out.println("\t\t\tEnter the new Adress ");
		       String adress=scanner.next();
		       editAddress(firstName,lastName,mobilenumber,arrayList2,adress);
		       
		break;
	   case 2:System.out.println("\t\t\tEnter the new state name ");
              String state=scanner.next();
              editState(firstName,lastName,mobilenumber,arrayList2,state);
              break;
	   case 3:System.out.println("\t\t\tEnter the new Zip-code ");
              int zipCode=scanner.nextInt();
              editZip(firstName,lastName,mobilenumber,arrayList2,zipCode);
       break;
	   case 4:System.out.println("\t\t\tEnter the new City ");
              String city=scanner.next();
              editCity(firstName,lastName,mobilenumber,arrayList2,city);
              break;
		default:
			break;
		}
		return arrayList2;

	}

	private void editCity(String firstName, String lastName, int mobilenumber, ArrayList<Person> arrayList2,
			String city) {
		for(int i=0;i<arrayList2.size();i++)
		{
			if((arrayList2.get(i).getFirstName().equals(firstName))&&(arrayList2.get(i).getLastName().equals(lastName))&&((arrayList2.get(i).getPhoneNumber()==mobilenumber)))
			{
				arrayList2.get(i).setCity(city);
				break;
			}
		}
		
	}

	private void editZip(String firstName, String lastName, int mobilenumber, ArrayList<Person> arrayList2,
			int zipCode) {
		for(int i=0;i<arrayList2.size();i++)
		{
			if((arrayList2.get(i).getFirstName().equals(firstName))&&(arrayList2.get(i).getLastName().equals(lastName))&&((arrayList2.get(i).getPhoneNumber()==mobilenumber)))
			{
				arrayList2.get(i).setZip(zipCode);
				break;
			}
		}
		
	}

	private void editState(String firstName, String lastName, int mobilenumber, ArrayList<Person> arrayList2,
			String state) {
		for(int i=0;i<arrayList2.size();i++)
		{
			if((arrayList2.get(i).getFirstName().equals(firstName))&&(arrayList2.get(i).getLastName().equals(lastName))&&((arrayList2.get(i).getPhoneNumber()==mobilenumber)))
			{
				arrayList2.get(i).setState(state);
				break;
			}
		}
		
	}

	private void editAddress(String firstName, String lastName, int mobilenumber, ArrayList<Person> arrayList2,String adress) 
	{
		for(int i=0;i<arrayList2.size();i++)
		{
			if((arrayList2.get(i).getFirstName().equals(firstName))&&(arrayList2.get(i).getLastName().equals(lastName))&&((arrayList2.get(i).getPhoneNumber()==mobilenumber)))
			{
				arrayList2.get(i).setAddress(adress);
				break;
			}
		}
		
	}

}
