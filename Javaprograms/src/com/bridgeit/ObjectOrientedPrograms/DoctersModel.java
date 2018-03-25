package com.bridgeit.ObjectOrientedPrograms;
import com.bridgeit.utility.Utility2;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;

public class DoctersModel {
	private String name,specialization,availability;
	private String id;
	Utility2 utility;
	JSONArray jsonArray=new JSONArray();
	JSONObject jsonObject=new JSONObject();
	static  JSONArray jsonArray1=new JSONArray();
	static  JSONObject jsonObject1=new JSONObject();
	static String  file="/home/bridgeit/Json/DoctersList.json";
	static String  appointmentFile="/home/bridgeit/Json/appointment.json";
	
			public DoctersModel()
			{
					utility=new Utility2();
					System.out.println("Enter Doctors Details ...");
					System.out.print("Enter Name: ");
					this.name=utility.StringInput();
					System.out.println();
					System.out.print("Enter Id: ");
					this.id=utility.StringInput();
					System.out.println();
					System.out.print("Enter specialization: ");
					this.specialization=utility.StringInput();
					System.out.println();
					System.out.print("Enter availability (1:AM 2:PM 3:both)");
					this.availability=utility.StringInput();
					System.out.println();
			}
			public String getId()
			{
				return id;
			}
			public String getName()
			{
				return name;
			}
			public String getSpecialization()
			{
				return specialization;
			}
			public String getAvailability()
			{
				return availability;
			}
			public String toString()
			{
				return id+" "+name+" "+specialization+" "+availability+"\n";
			}
			@SuppressWarnings("unchecked")
			public DoctersModel(String name, String id,String specialization,String availability) throws FileNotFoundException, IOException, ParseException
			{
					this.name=name;
					this.id=id;
					this.specialization=specialization;
					this.availability=availability;
					FileReader fileReader=new FileReader(file);
					BufferedReader br=new BufferedReader(fileReader);
					if(br.readLine()==null)
					{
						AddingTOObject(jsonArray,name,id,specialization,availability);
	
					}
					else
					{
						jsonArray=getCurrentObject();
						AddingTOObject(jsonArray,name,id,specialization,availability);
	
					}
					WritingIntoFile(jsonObject);
			}
			
			private void WritingIntoFile(JSONObject jsonObject2) throws IOException {
				
					FileWriter fw = new FileWriter(file);
					BufferedWriter bw=new BufferedWriter(fw);
					bw.write(jsonObject2.toJSONString());
					bw.flush();
			}
			
			private JSONArray getCurrentObject() throws FileNotFoundException, IOException, ParseException {
					JSONParser jsonParser=new JSONParser();
					Object obj = jsonParser.parse(new FileReader(file));
					JSONObject object=(JSONObject)obj;
					JSONArray jsonArray=(JSONArray)object.get("Doctors");
			        return jsonArray;
			}
			
			@SuppressWarnings("unchecked")
			private void AddingTOObject(JSONArray jsonArray, String name2, String id2, String specialization2, String availability2)
			{
				  JSONObject jsonObject1=new JSONObject();
				  jsonObject1.put("Name", name2);
				  jsonObject1.put("id", id2);
				  jsonObject1.put("Specilizations", specialization2);
				  jsonObject1.put("availability", availability2);
				  jsonArray.add(jsonObject1);
				  jsonObject.put("Doctors", jsonArray);
			}
			
			
			public static void disply() throws FileNotFoundException, IOException, ParseException
			{
					JSONParser jsonParser=new JSONParser();
					Object obj = jsonParser.parse(new FileReader(file));
					JSONObject object=(JSONObject)obj;
					JSONArray jsonArray=(JSONArray)object.get("Doctors");
					for(int i=0;i<jsonArray.size();i++)
					{
						JSONObject jsonObject=(JSONObject)jsonArray.get(i);
						System.out.println("\t==============Doctor :"+(i+1)+"==============");
					    System.out.println("\tName           :"+jsonObject.get("Name"));
					    System.out.println("\tId             :"+jsonObject.get("id"));
					    System.out.println("\tSpecilizations :"+jsonObject.get("Specilizations"));
					    if(jsonObject.get("availability").toString().equals("1"))
					    System.out.println("\tAvailability   :"+jsonObject.get("availability")+" AM");
					    else
					    	 if(jsonObject.get("availability").toString().equals("2"))
					    		 System.out.println("\tAvailability   :"+jsonObject.get("availability")+" PM");
					    System.out.println("\t======================================");
					    System.out.println();
					}
			}
			
			public static void searchByName(String string) throws FileNotFoundException, IOException, ParseException {
				
				JSONParser jsonParser=new JSONParser();
				Object obj = jsonParser.parse(new FileReader(file));
				JSONObject object=(JSONObject)obj;
				JSONArray jsonArray=(JSONArray)object.get("Doctors");
				
				for(int i=0;i<jsonArray.size();i++)
				{
					
					JSONObject jsonObject=(JSONObject)jsonArray.get(i);
					if(jsonObject.get("Name").toString().equals((string)))
					{
						System.out.println("\t==============Doctor :"+(i+1)+"==============");
					    System.out.println("\tName           :"+jsonObject.get("Name"));
					    System.out.println("\tId             :"+jsonObject.get("id"));
					    System.out.println("\tSpecilizations :"+jsonObject.get("Specilizations"));
					    System.out.println("\tAvailability   :"+jsonObject.get("availability"));
					    System.out.println("\t======================================");
					    System.out.println();
					
					}
				}
				
				
			}
			public static void searchById(String id) throws FileNotFoundException, IOException, ParseException {
				
				JSONParser jsonParser=new JSONParser();
				Object obj = jsonParser.parse(new FileReader(file));
				JSONObject object=(JSONObject)obj;
				JSONArray jsonArray=(JSONArray)object.get("Doctors");
				
				for(int i=0;i<jsonArray.size();i++)
				{
					
					JSONObject jsonObject=(JSONObject)jsonArray.get(i);
					if(jsonObject.get("id").toString().equals((id)))
					{
							System.out.println("\t==============Doctor :"+(i+1)+"==============");
						    System.out.println("\tName           :"+jsonObject.get("Name"));
						    System.out.println("\tId             :"+jsonObject.get("id"));
						    System.out.println("\tSpecilizations :"+jsonObject.get("Specilizations"));
						    System.out.println("\tAvailability   :"+jsonObject.get("availability"));
						    System.out.println("\t======================================");
						    System.out.println();
					}
				}
				
				
			}
			public static void searchByAvailability(String stringInput) throws FileNotFoundException, IOException, ParseException {
				
				JSONParser jsonParser=new JSONParser();
				Object obj = jsonParser.parse(new FileReader(file));
				JSONObject object=(JSONObject)obj;
				JSONArray jsonArray=(JSONArray)object.get("Doctors");
				for(int i=0;i<jsonArray.size();i++)
				{
					
					JSONObject jsonObject=(JSONObject)jsonArray.get(i);
					if(jsonObject.get("availability").toString().equals((stringInput)))
					{
						System.out.println("\t==============Doctor :"+(i+1)+"==============");
					    System.out.println("\tName           :"+jsonObject.get("Name"));
					    System.out.println("\tId             :"+jsonObject.get("id"));
					    System.out.println("\tSpecilizations :"+jsonObject.get("Specilizations"));
					    System.out.println("\tAvailability   :"+jsonObject.get("availability"));
					    System.out.println("\t======================================");
					    System.out.println();
					}
				}
			}
   public static void searchBySpecialization(String stringInput) throws FileNotFoundException, IOException, ParseException {
				
				JSONParser jsonParser=new JSONParser();
				Object obj = jsonParser.parse(new FileReader(file));
				JSONObject object=(JSONObject)obj;
				JSONArray jsonArray=(JSONArray)object.get("Doctors");
				for(int i=0;i<jsonArray.size();i++)
				{
					
					JSONObject jsonObject=(JSONObject)jsonArray.get(i);
					if(jsonObject.get("Specilizations").toString().equals((stringInput)))
					{
						System.out.println("\t==============Doctor :"+(i+1)+"==============");
					    System.out.println("\tName           :"+jsonObject.get("Name"));
					    System.out.println("\tId             :"+jsonObject.get("id"));
					    System.out.println("\tSpecilizations :"+jsonObject.get("Specilizations"));
					    System.out.println("\tAvailability   :"+jsonObject.get("availability"));
					    System.out.println("\t======================================");
					    System.out.println();
					}
				}
			}
public static int search(String docorId) throws FileNotFoundException, IOException, ParseException {
	int count=0;
	JSONParser jsonParser=new JSONParser();
	Object obj = jsonParser.parse(new FileReader(file));
	JSONObject object=(JSONObject)obj;
	JSONArray jsonArray=(JSONArray)object.get("Doctors");
	System.out.println("Docters whith the id "+docorId);
	for(int i=0;i<jsonArray.size();i++)
	{
		
		JSONObject jsonObject=(JSONObject)jsonArray.get(i);
		if(jsonObject.get("id").toString().equals((docorId)))
		{
			System.out.println("\t==============Doctor :"+(i+1)+"==============");
		    System.out.println("\tName           :"+jsonObject.get("Name"));
		    System.out.println("\tId             :"+jsonObject.get("id"));
		    System.out.println("\tSpecilizations :"+jsonObject.get("Specilizations"));
		    System.out.println("\tAvailability   :"+jsonObject.get("availability"));
		    System.out.println("\t======================================");
		    System.out.println();
			count++;
		}
		
	}
	//System.out.println("Choose your Docters in the given List");
	return count;
}
public static void upDateAppointmentIntoFile(String date1, String docorId, int count, String name2) throws FileNotFoundException, IOException, ParseException {
	FileReader fileReader=new FileReader(appointmentFile);
	BufferedReader br=new BufferedReader(fileReader);
	String name="";
	if(count==1)
	{
	if(br.readLine()==null)
	{
		
		JSONParser jsonParser=new JSONParser();
		Object obj = jsonParser.parse(new FileReader(file));
		JSONObject object=(JSONObject)obj;
		JSONArray jsonArray=(JSONArray)object.get("Doctors");
		for(int i=0;i<jsonArray.size();i++)
		{
			JSONObject jsonObject=(JSONObject)jsonArray.get(i);
			if(jsonObject.get("id").toString().equals((docorId)))
			{
			 name=jsonObject.get("Name").toString();
			}
			
		}
		AddingTobject1(jsonArray1, date1,docorId,name);
		
	}
	else
	{
		jsonArray1=getCurrentObject1();
		AddingTobject1(jsonArray1, date1,docorId,name);
		 
	}
	WritingIntoFile1(jsonObject1);
	}
	else
	{
		if(br.readLine()==null)
		{
			AddingTobject1(jsonArray1, date1,docorId,name2);			
		}
		else
		{
			jsonArray1=getCurrentObject1();
			AddingTobject1(jsonArray1, date1,docorId,name2);
			 
		}
		WritingIntoFile1(jsonObject1);
	}
}
	 @SuppressWarnings("unchecked")
	private static  void AddingTobject1(JSONArray jsonArray, String date1, String docorId,String name)
	{
		  JSONObject jsonObject2=new JSONObject();
		  jsonObject2.put("Name", name);
		  jsonObject2.put("id", docorId);
          jsonObject2.put("DateAndTime", date1);
		  jsonArray1.add(jsonObject2);
		  jsonObject1.put("Appointment", jsonArray1);
	}
	 private static  JSONArray getCurrentObject1() throws FileNotFoundException, IOException, ParseException {
			JSONParser jsonParser=new JSONParser();
			Object obj = jsonParser.parse(new FileReader(appointmentFile));
			JSONObject object=(JSONObject)obj;
			JSONArray jsonArray1=(JSONArray)object.get("Appointment");
	        return jsonArray1;
	}
	 private static void WritingIntoFile1(JSONObject jsonObject2) throws IOException {
			
			FileWriter fw = new FileWriter(appointmentFile);
			BufferedWriter bw=new BufferedWriter(fw);
			bw.write(jsonObject2.toJSONString());
			bw.flush();
	}
	public static void appointmentDisply() throws FileNotFoundException, IOException, ParseException {
		
		JSONParser jsonParser=new JSONParser();
		Object obj = jsonParser.parse(new FileReader(appointmentFile));
		JSONObject object=(JSONObject)obj;
		JSONArray jsonArray=(JSONArray)object.get("Appointment");
		for(int i=0;i<jsonArray.size();i++)
		{
			JSONObject jsonObject=(JSONObject)jsonArray.get(i);
			System.out.println("\t==============Appointment no. :"+(i+1)+"==============");
		    System.out.println("\tName           :"+jsonObject.get("Name"));
		    System.out.println("\tId             :"+jsonObject.get("id"));
		    System.out.println("\tDate and Time   :"+jsonObject.get("DateAndTime"));
		    System.out.println("\t======================================");
		    System.out.println();
		}
	}
	
	
}

