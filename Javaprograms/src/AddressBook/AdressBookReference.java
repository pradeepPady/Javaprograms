package AddressBook;

import java.io.IOException;
import java.util.Scanner;

public class AdressBookReference {

	@SuppressWarnings("resource")
	public static void main(String[] args) throws IOException {
		Scanner scanner=new Scanner(System.in);
		System.out.print("\t\t\t=========Address-Book===========\n\n");
		System.out.print("\t\t\tCreate new AdressBook Enter 1:\n");
		System.out.print("\t\t\tOpen AdressBook       Enter 2:\n");
		System.out.print("\t\t\tSave AdressBook       Enter 3:\n\n");
		System.out.print("\t\t\t================================\n");
		int choice=scanner.nextInt();
		switch(choice)
		{
		case 1:AdressBookManager.newBoook();
		      System.out.println("\t\t\tDo you want to add Information to book  1/0");
		      int ch=scanner.nextInt();
		      if(ch==1)
		       AdressBookManager.addPerson();
		       break;
		case 2:AdressBookManager.open();
		       break;
		case 3:AdressBookManager.save();
		       break;
		}
	}

}
