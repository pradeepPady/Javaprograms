package com.bridgeit.ObjectOrientedPrograms;

import java.util.Scanner;

import com.bridgeit.utility.Utility;

public class REgularExpresations {
	private static final String message="Hello <<name>>, We have your full name as <<full name>> in our system. your contact number is 91-xxxxxxxxxx. Please,let us know in case of any clarification Thank you BridgeLabz 26/03/2018. ";
public static void main(String[] args) {
	Utility utility=new Utility();
	Scanner scanner=new Scanner(System.in);
	boolean flag=true;
	String name="";
	String mobileNumber="";
	while(flag)
	{
	System.out.print("\t1:Enter your Name:\t\t ");
    name=utility.StringInput();
	flag=utility.userNameCheck(name);
	if(flag)
	{
		System.out.print("\tPlease...enter the correct Name\n");
	}
	}
	utility.setName(name);
	System.out.print("\t2:enter your FullName: \n");
	String Fullname=scanner.nextLine();
	System.out.println();
    utility.setFullName(Fullname);
    flag=true;
    while(flag)
    {
    System.out.print("\t3:enter your mobile number\t\n");
    mobileNumber=utility.StringInput();
    System.out.println(mobileNumber);
    flag=utility.mobileNumberCheck(mobileNumber);
    if(flag)
	{
		System.out.print("\t--Please...enter the correct Mobile Number\t\n");
	}
    }
    utility.setPhoneNumber(mobileNumber);
    String newMessage=utility.RegexReplace(message);
    utility.messageDisply(newMessage);
}
}
