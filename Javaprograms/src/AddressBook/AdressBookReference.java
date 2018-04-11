package AddressBook;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

import org.json.simple.parser.ParseException;

public class AdressBookReference
{
	public static void main(String[] args) throws IOException, ParseException
	{
		
		 ArrayList<Person>array;

		 Scanner scanner=new Scanner(System.in);
		AdressBookManager adressBookManager=new AdressBookManager();
		array=adressBookManager.getList();
		while(true)
		{
				System.out.print("\t\t\t=========Address-Book===========\n\n");
				System.out.print("\t\t\tCreate new AdressBook      Enter 1:\n");
				System.out.print("\t\t\tOpen AdressBook            Enter 2:\n");
				System.out.print("\t\t\tSave AdressBook            Enter 3:\n");
				System.out.print("\t\t\tSave As                    Enter 4:\n");
                System.out.print("\t\t\tClose                      Enter 5:\n");
				System.out.print("\t\t\t================================\n\n");
				int choice=scanner.nextInt();
		
				switch(choice)
				{
				case 1:      adressBookManager.newBoook();
				       break;
				case 2:array=adressBookManager.open(array);
				       break;
				case 3:      adressBookManager.save(array);
				       break;
				case 4:      adressBookManager.saveAs(array);
				       break;
				case 5:      adressBookManager.close();
				}

		}
	}

}
