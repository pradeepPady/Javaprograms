package AddressBook;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;
public class AdressBookManager 
{
	static String firstName,lastName,address,state,city;
	static int phoneNumber,zip;
	static String filename="";
	static File file;
	
	static BufferedReader bufferedReader;
	static ArrayList<Person> arrayList;
	static Person person;
	static Scanner scanner=new Scanner(System.in);
	static String path1="/home/bridgeit/AdressBookData";
	public static void newBoook() throws IOException
	{
		File filePath=new File("/home/bridgeit/AdressBookData");
		 System.out.print("\t\t\tEnter file name\n");
		 filename=scanner.next();
		 file=new File(filePath+filename+".json");
		 file.createNewFile();
		 arrayList=new ArrayList<Person>();
		 System.out.println("\t\t\tFile created in the Directry...");
	}
	
	public static  void addPerson()
	{
		System.out.print("\t\t\tEnter First Name\n");
		firstName=scanner.next();
		System.out.print("\t\t\tEnter Last Name\n");
		lastName=scanner.next();
		System.out.print("\t\t\tEnter Adress\n");
		address=scanner.next();
		System.out.print("\t\t\tEnter city\n");
		city=scanner.next();
		System.out.print("\t\t\tEnter the state\n");
		state=scanner.next();
		System.out.print("\t\t\tEnter the Zip-code\n");
		zip=scanner.nextInt();
		System.out.print("\t\t\tEnter phone number\n");
		phoneNumber=scanner.nextInt();
		arrayList.add(new Person(firstName,lastName,address,state,city,zip,phoneNumber));
	}
  
	public static  void open() throws IOException
	{
		File filePath=new File("/home/bridgeit/AdressBookData");
	    File mylist[]=filePath.listFiles();
	    System.out.println("\t\t\tExisting files in the Directry");
	    System.out.print("\t\t\t================================\n");
	    for(int i=0;i<mylist.length;i++)
	    {
	    	System.out.println("\t\t\t"+(i+1)+": "+mylist[i].getName());
	    }
	    System.out.print("\t\t\t================================\n");
	    System.out.print("\t\t\tEnter the file name to open.....\n");
	    String name=scanner.next()+".json";	    
	    File file=new File(path1+name);
	    bufferedReader=new BufferedReader(new FileReader(file));
	    if(bufferedReader.readLine()!=null)
	    {
         	    	
	    }
	   
	}

	public static void save()
	{
			
	}
}
