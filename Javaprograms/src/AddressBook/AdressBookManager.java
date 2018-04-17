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
	String filename="";
	static File file;
	BufferedReader bufferedReader;
	Scanner scanner=new Scanner(System.in);
	String path1="/home/bridgeit/AdressBookData/";
	ObjectMapper mapper=new ObjectMapper();
	static ArrayList<Person>arrayList=new ArrayList<Person>();
	public  ArrayList<Person> getList()
	{

		return arrayList;
	}
	public void newBoook() throws IOException {
		System.out.print("\t\t\tEnter file name\n");
		filename=scanner.next();
		file=new File(path1+filename+".json");
		file.createNewFile();
		System.out.print("\t\t\tFile created in the Directry...\n");
	}

	public  ArrayList<Person> open(ArrayList<Person> arrayList) throws IOException, ParseException{
			File filePath=new File("/home/bridgeit/AdressBookData");
			File mylist[]=filePath.listFiles();
			System.out.print("\t\t\tExisting files in the Directry\n");
			System.out.print("\t\t\t================================\n");
			for(int i=0;i<mylist.length;i++){
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
				System.out.print(jsonArray+"\n");
				TypeReference<ArrayList<Person>> typeReference = new TypeReference<ArrayList<Person>>() {};
				arrayList = mapper.readValue(jsonArray, typeReference);
				System.out.println(arrayList);
	
			}
			else
			{
				System.out.print("\t\t\tNo data to disply...\n\n");
			}
			AdressBook adressBook=new AdressBook();
			adressBook.adressBookOperation(arrayList);
			return arrayList;
}

	public  void save(ArrayList<Person> arrayList) throws JsonGenerationException, JsonMappingException, FileNotFoundException, IOException{
		System.out.print(arrayList+"\n");
		mapper.writeValue(new FileOutputStream(file), arrayList);
		System.out.print("\t\t\tData added sucsessfully......\n\n");
	}
	
	public void saveAs(ArrayList<Person> array){
		File filePath=new File("/home/bridgeit/AdressBookData");
		File mylist[]=filePath.listFiles();
		System.out.print("\t\t\tExisting files in the Directry\n");
		System.out.print("\t\t\t================================\n");
		for(int i=0;i<mylist.length;i++){
			System.out.println("\t\t\t"+(i+1)+": "+mylist[i].getName());
		}
		System.out.print("\t\t\t================================\n");
		System.out.print("\t\t\tEnter the file name to to save in new file .....\n");
		String name=scanner.next()+".json";	    
		file=new File(path1+name);
		try {
			bufferedReader=new BufferedReader(new FileReader(file));
		} catch (FileNotFoundException e) {
			
			e.printStackTrace();
		}
		String jsonArray;
		try {
			if((jsonArray=bufferedReader.readLine())!=null)
			{
				System.out.print(jsonArray+"\n");
				TypeReference<ArrayList<Person>> typeReference = new TypeReference<ArrayList<Person>>() {};
				arrayList = mapper.readValue(jsonArray, typeReference);
				System.out.print(arrayList+"\n");

			}
			
			
		} catch (IOException e) {
			
			e.printStackTrace();
		}
		System.out.print("\t\t\tEnter the new file name to save the data with extention\n");
		String filename1=scanner.next();
		String extention=scanner.next();
		File file1=new File(path1+filename1+extention);
		try {
			file1.createNewFile();
		} catch (IOException e)
		{
			e.printStackTrace();
		}
		System.out.print("\t\t\tFile created in the Directry...\n");
		try {
			mapper.writeValue(new FileOutputStream(file1), arrayList);
		} catch (IOException e) 
		{
			e.printStackTrace();
		}
		System.out.print("\t\t\tData added sucsessfully......\n\n");
	}
	public void close() {
		System.exit(0);
		
	}
}
