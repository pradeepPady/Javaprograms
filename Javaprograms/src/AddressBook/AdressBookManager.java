package AddressBook;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;
import org.codehaus.jackson.JsonGenerationException;
import org.codehaus.jackson.map.JsonMappingException;
import org.codehaus.jackson.map.ObjectMapper;
import org.codehaus.jackson.type.TypeReference;
import org.json.simple.parser.ParseException;
public class AdressBookManager 
{
	String firstName,lastName,address,state,city;
	int phoneNumber,zip;
	String filename="";
	static File file;

	BufferedReader bufferedReader;
	Person person;
	Scanner scanner=new Scanner(System.in);
	String path1="/home/bridgeit/AdressBookData/";
	ObjectMapper mapper=new ObjectMapper();
	static ArrayList<Person>arrayList=new ArrayList<Person>();
	public  ArrayList<Person> getList()
	{

		return arrayList;
	}
	public  ArrayList<Person> addPerson(ArrayList<Person> arrayList) throws IOException
	{
		Person person=new Person();
		System.out.print("\t\t\tEnter First Name\n");
		firstName=scanner.next();
		person.setFirstName(firstName);
		System.out.print("\t\t\tEnter Last Name\n");
		lastName=scanner.next();
		person.setLastName(lastName);
		System.out.print("\t\t\tEnter Adress\n");
		address=scanner.next();
		person.setAddress(address);
		System.out.print("\t\t\tEnter city\n");
		city=scanner.next();
		person.setCity(city);
		System.out.print("\t\t\tEnter the state\n");
		state=scanner.next();
		person.setState(state);
		System.out.print("\t\t\tEnter the Zip-code\n");
		zip=scanner.nextInt();
		person.setZip(zip);
		System.out.print("\t\t\tEnter phone number\n");
		phoneNumber=scanner.nextInt();
		person.setPhoneNumber(phoneNumber);
		arrayList.add(person);
		return arrayList;
	}

	public  ArrayList<Person> open(ArrayList<Person> arrayList) throws IOException, ParseException
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
		file=new File(path1+name);
		bufferedReader=new BufferedReader(new FileReader(file));
		String jsonArray;

		if((jsonArray=bufferedReader.readLine())!=null)
		{
			System.out.println(jsonArray);
			TypeReference<ArrayList<Person>> typeReference = new TypeReference<ArrayList<Person>>() {};
			arrayList = mapper.readValue(jsonArray, typeReference);
			System.out.println(arrayList);

		}
		else
		{
			System.out.println("\t\t\tNo data to disply...\n");
		}
		AdressBook adressBook=new AdressBook();
		adressBook.adressBookOperation(arrayList,file);
		return arrayList;

	}

	public  void save(ArrayList<Person> arrayList) throws JsonGenerationException, JsonMappingException, FileNotFoundException, IOException
	{
		System.out.println(arrayList);
		mapper.writeValue(new FileOutputStream(file), arrayList);
		System.out.print("Data added sucsessfully......\n");
	}

	public void newBoook() throws IOException {
		System.out.print("\t\t\tEnter file name\n");
		filename=scanner.next();
		file=new File(path1+filename+".json");
		file.createNewFile();
		System.out.println("\t\t\tFile created in the Directry...");
	}
}
