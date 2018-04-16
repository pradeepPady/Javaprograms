package Bridgelabz.ClinicManagement;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.IOException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Date;
import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;
import org.codehaus.jackson.JsonGenerationException;
import org.codehaus.jackson.map.JsonMappingException;
import org.codehaus.jackson.map.ObjectMapper;
import org.codehaus.jackson.type.TypeReference;
public class ClinicManagementApp{
	private ArrayList<Appointment>appointList=new ArrayList<Appointment>();
	private ArrayList<Doctor>doctorsList;
	private ArrayList<Patient>pationtList;
	private  File DoctorFile=new File("/home/bridgeit/ClinicManagement/doctorsList.json");
	private  File patientFile=new File("/home/bridgeit/ClinicManagement/patientList.json");
	private  File appointFile=new File("/home/bridgeit/ClinicManagement/appointment.json");
	private ObjectMapper mapper=new ObjectMapper();
	private BufferedReader bufferedReader;
	private Scanner scanner=new Scanner(System.in);
	public void addDetails() throws FileNotFoundException 
	{
		doctorsList=new ArrayList<Doctor>();
		boolean flag=true;
		while(flag)
		{
			System.out.println("\n");
			System.out.print("\t\t\t _____________Add-Details_____________\n");
			System.out.print("\t\t\t|                                    |\n");
			System.out.print("\t\t\t|       1: Add Doctor                |\n");
			System.out.print("\t\t\t|       2: Add Patent                |\n");
			System.out.print("\t\t\t|       3: Exit                      |\n");
			System.out.print("\t\t\t|____________________________________|\n");
			System.out.print("\t\t\tEnter your choice\n");
			System.out.println("\n");

			int choice = scanner.nextInt();
			switch (choice) 
			{
			case 1:addDoctor();
			break;

			case 2:addPatient();
			break;
			case 3:flag=false;
			break;
			}
		}
	}

	private void addPatient() throws FileNotFoundException {
		pationtList=new ArrayList<Patient>();
		Patient patient=new Patient();
		System.out.print("Enter Patient Name\n");
		patient.setName(scanner.next());
		patient.setId((readPationtFile().size())+1);
		System.out.print("Enter Patient Mobile number\n");
		patient.setMobileNumber(scanner.nextInt());
		System.out.print("Enter Patient Age\n");
		patient.setAge(scanner.nextInt());
		pationtList.add(patient);
		savePatient();

	}

	private void addDoctor() throws FileNotFoundException {

		Doctor Doctor=new Doctor();
		System.out.print("Enter Doctor Name\n");
		Doctor.setName(scanner.next());					
		Doctor.setId(readDoctorFile().size()+1);
		System.out.print("Enter Doctor Specilization\n");
		Doctor.setSpcilization(scanner.next());
		System.out.print("Enter Doctor avalability\n");
		Doctor.setAvalability(scanner.next());
		doctorsList.add(Doctor);
		saveDoctor();

	}

	public void searchDetails() throws FileNotFoundException
	{
		boolean flag=true;
		while(flag)
		{
			System.out.print("\t\t\t _____________Search-Details_____________\n");
			System.out.print("\t\t\t|                                       |\n");
			System.out.print("\t\t\t|       1: Search Doctor                |\n");
			System.out.print("\t\t\t|       2: Search Patient               |\n");
			System.out.print("\t\t\t|       3: Exit                         |\n");
			System.out.print("\t\t\t|_______________________________________|\n");
			System.out.print("\t\t\tEnter your choice\n");

			int choice = scanner.nextInt();
			switch (choice) 
			{
			case 1:doctorSearchMenu();
			break;
			case 2:patientSearchMenu();
			break;
			case 3:flag=false;
			break;
			}
		}
	}

	private ArrayList<Doctor> doctorSearchMenu() throws FileNotFoundException {
		boolean flag=true;
		ArrayList<Doctor>doctorsList=readDoctorFile();
		ArrayList<Doctor>arrayList=null;
		while(flag)
		{
			System.out.print("\t\t\t ___________Doctor-Search-menu____________\n");
			System.out.print("\t\t\t|       1: Search Doctor By Name         |\n");
			System.out.print("\t\t\t|       2: Search Doctor By Id           |\n");
			System.out.print("\t\t\t|       3: Search Doctor By Specilization|\n");
			System.out.print("\t\t\t|       4: Exit                          |\n");
			System.out.print("\t\t\t|_______________________________________ |\n");
			System.out.print("\t\t\tEnter your choice\n");
			System.out.println("\n");

			int choice = scanner.nextInt();
			switch (choice) 
			{
			case 1: searchDoctorByName(doctorsList);
			break;

			case 2: searchDocterById(doctorsList);

			break;
			case 3:searchDocterBySpecilzn(doctorsList);
			break;
			case 4:flag=false;
			break;
			}
		}
		return arrayList;

	}




	private void searchDocterBySpecilzn(ArrayList<Doctor> doctorsList2) {
		System.out.println("Enter the Specilization of Doctor you want to search\n");
		String spl=scanner.next();
		ArrayList<Doctor>arrayList=new ArrayList<Doctor>();
		System.out.println("\t\t\t|________Doctors list with Specilization-"+spl+"________|");
		for(int i=0;i<doctorsList.size();i++)
		{
			if(doctorsList.get(i).getSpcilization().equals(spl))
			{
				System.out.println("\t\t\tName                         :"+doctorsList.get(i).getName());
				System.out.println("\t\t\tId                           :"+doctorsList.get(i).getId());
				System.out.println("\t\t\tSpecilization                :"+doctorsList.get(i).getSpcilization());
				System.out.println("\t\t\tAvalibility                  :"+doctorsList.get(i).getAvalability());
				System.out.println("\t\t\t_________________________________________________");
				arrayList.add(doctorsList.get(i));
			}
		}
		System.out.println("\t\t\t_________________________________________________");
		System.out.println("\n");

	}

	private void searchDocterById(ArrayList<Doctor> doctorsList2) {
		System.out.println("Enter the Id of Doctor you want to search\n");
		int id=scanner.nextInt();
		System.out.println("\t\t\t________Doctors  with Id-"+id+"________");
		ArrayList<Doctor>arrayList=new ArrayList<Doctor>();
		for(int i=0;i<doctorsList2.size();i++)
		{
			if(doctorsList2.get(i).getId()==id)
			{
				System.out.println("\t\t\tName                         :"+doctorsList2.get(i).getName());
				System.out.println("\t\t\tId                           :"+doctorsList2.get(i).getId());
				System.out.println("\t\t\tSpecilization                :"+doctorsList2.get(i).getSpcilization());
				System.out.println("\t\t\tAvalibility                  :"+doctorsList2.get(i).getAvalability());
				System.out.println("\t\t\t_______________________________________________");
				arrayList.add(doctorsList2.get(i));
				break;
			}
		}
		System.out.println("\t\t\t_______________________________________________");
		System.out.println("\n");

	}

	private void searchDoctorByName(ArrayList<Doctor> doctorsList2) {
		System.out.println("Enter the name of Doctor you want to search\n");
		String name=scanner.next();
		System.out.println("\t\t\t________Doctors list with name-"+name+"_______");
		ArrayList<Doctor>arrayList=new ArrayList<Doctor>();
		for(int i=0;i<doctorsList2.size();i++)
		{
			if(doctorsList2.get(i).getName().equals(name))
			{
				System.out.println("\t\t\tName                         :"+doctorsList2.get(i).getName());
				System.out.println("\t\t\tId                           :"+doctorsList2.get(i).getId());
				System.out.println("\t\t\tSpecilization                :"+doctorsList2.get(i).getSpcilization());
				System.out.println("\t\t\tAvalibility                  :"+doctorsList2.get(i).getAvalability());
				System.out.println("\t\t\t_______________________________________________");
				arrayList.add(doctorsList2.get(i));
			}
		}

		System.out.println("\t\t\t_______________________________________________");


	}

	private void patientSearchMenu() throws FileNotFoundException {

		boolean flag=true;
		ArrayList<Patient>pationtList=readPationtFile();

		while(flag)
		{
			System.out.print("\t\t\t ___________Patient-Search-menu___________\n");
			System.out.print("\t\t\t|       1: Search Patient By Name         |\n");
			System.out.print("\t\t\t|       2: Search Patient By Id           |\n");
			System.out.print("\t\t\t|       3: Search Patient By Mobile number|\n");
			System.out.print("\t\t\t|       4: Exit                           |\n");
			System.out.print("\t\t\t|_________________________________________|\n");
			System.out.print("\t\t\tEnter your choice\n");
			int choice = scanner.nextInt();
			switch (choice) 
			{
			case 1: searchPatientbyName(pationtList);
			break;
			case 2:searchPatientbyId(pationtList); 
			break;
			case 3:searchPatientByMobileNum(pationtList);      
			break;
			}
		}

	}

	private void searchPatientByMobileNum(ArrayList<Patient> pationtList2) {
		System.out.println("Enter the Mobile Number of Patient you want to search\n");
		int mnum=scanner.nextInt();
		System.out.println("Patient  with Mobile number-"+mnum+"________");
		for(int i=0;i<pationtList2.size();i++)
		{
			if(pationtList2.get(i).getMobileNumber()==(mnum))
			{
				System.out.println("\t\t\tName                         :"+pationtList2.get(i).getName());
				System.out.println("\t\t\tId                           :"+pationtList2.get(i).getId());
				System.out.println("\t\t\tSpecilization                :"+pationtList2.get(i).getMobileNumber());
				System.out.println("\t\t\tAge                          :"+pationtList2.get(i).getAge());
				System.out.println("\t\t\t_________________________________________________");
				break;
			}
		}
		System.out.println("\t\t\t_______________________________________________");

	}

	private void searchPatientbyId(ArrayList<Patient> pationtList2) {
		System.out.println("Enter the Id of Patient you want to search\n");
		int id=scanner.nextInt();
		System.out.println("\t\t\t________Doctors  with Id-"+id+"________");
		for(int i=0;i<pationtList2.size();i++)
		{
			if(pationtList2.get(i).getId()==id)
			{
				System.out.println("\t\t\tName                         :"+pationtList2.get(i).getName());
				System.out.println("\t\t\tId                           :"+pationtList2.get(i).getId());
				System.out.println("\t\t\tMobile number                :"+pationtList2.get(i).getMobileNumber());
				System.out.println("\t\t\tAge                          :"+pationtList2.get(i).getAge());
				System.out.println("\t\t\t_______________________________________________");
				break;
			}
		}
		System.out.println("\t\t\t_______________________________________________");

	}

	private void searchPatientbyName(ArrayList<Patient> pationtList2) {
		System.out.println("Enter the name of Patient you want to search\n");
		String name=scanner.next();
		System.out.println("\t\t\t________Patient list with name-"+name+"________");
		for(int i=0;i<pationtList2.size();i++)
		{
			if(pationtList2.get(i).getName().equals(name))
			{
				System.out.println("\t\t\tName                         :"+pationtList2.get(i).getName());
				System.out.println("\t\t\tId                           :"+pationtList2.get(i).getId());
				System.out.println("\t\t\tMobile number                :"+pationtList2.get(i).getMobileNumber());
				System.out.println("\t\t\tAge                          :"+pationtList2.get(i).getAge());
				System.out.println("\t\t\t_______________________________________________");

			}
		}
		System.out.println("\t\t\t_______________________________________________");

	}

	public void displyDetails() throws FileNotFoundException
	{
		boolean flag=true;
		while(flag)
		{
			System.out.print("\t\t\t _____________Disply-Details_____________\n");
			System.out.print("\t\t\t|       1: Disply Doctors                |\n");
			System.out.print("\t\t\t|       2: Disply Patients               |\n");
			System.out.print("\t\t\t|       3: Exit                          |\n");
			System.out.print("\t\t\t|________________________________________|\n");
			System.out.print("\t\t\tEnter your choice\n");

			int choice = scanner.nextInt();
			switch (choice) 
			{
			case 1:doctersDisply();
			break;
			case 2:patientDisply();
			break;
			case 3:flag=false;
			break;
			}
		}

	}
	private void patientDisply() throws FileNotFoundException {
		System.out.println("\t\t\t|________________Patient-List_________________________|");
		ArrayList<Patient>pationtList=readPationtFile();
		System.out.println("\t\t\t   Patient Name _ Id _ Mobile Number _ Age   ");
		for(int i=0;i<pationtList.size();i++)
		{

			System.out.printf(" %35s %7d %8s %15s",pationtList.get(i).getName(),pationtList.get(i).getId(),pationtList.get(i).getMobileNumber(),pationtList.get(i).getAge()+"   \n");

		}
		System.out.println("\t\t\t_____________________________________________________");
		System.out.println("\n");
	}
	private void doctersDisply() throws FileNotFoundException {
		System.out.println("\t\t\t________________Doctors-List_________________________");
		ArrayList<Doctor>doctorsList=readDoctorFile();
		System.out.println("\t\t\t   Doctor Name _ Id _ Specilization _ Avalibility   ");
		for(int i=0;i<doctorsList.size();i++)
		{

			System.out.printf(" %35s %7d %8s %15s",doctorsList.get(i).getName(),doctorsList.get(i).getId(),doctorsList.get(i).getSpcilization(),doctorsList.get(i).getAvalability()+"   \n");

		}
		System.out.println("\t\t\t_____________________________________________________");
		System.out.println("\n");
	}

	public void saveDoctor() throws FileNotFoundException
	{
		ArrayList<Doctor>doctorsList1=readDoctorFile();
		doctorsList.addAll(doctorsList1);
		try {
			mapper.writeValue(new FileOutputStream(DoctorFile), doctorsList);
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	public void savePatient() throws FileNotFoundException {

		ArrayList<Patient>pationtList1=readPationtFile();
		if(pationtList1.size()>0)
			pationtList.addAll(pationtList1);
		try {
			mapper.writeValue(new FileOutputStream(patientFile), pationtList);
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	private ArrayList<Doctor> readDoctorFile() throws FileNotFoundException {
		bufferedReader=new BufferedReader(new FileReader(DoctorFile));
		String jsonArray;
		ArrayList<Doctor>arrayList=new ArrayList<Doctor>();

		try {
			if((jsonArray=bufferedReader.readLine())!=null)
			{
				//	System.out.print(jsonArray+"\n");
				TypeReference<ArrayList<Doctor>> typeReference = new TypeReference<ArrayList<Doctor>>() {};
				arrayList = mapper.readValue(jsonArray, typeReference);

			}

			//doctorsList.addAll(arrayList);
		} catch (IOException e1) {
			e1.printStackTrace();
		}
		return arrayList;
	}
	private ArrayList<Patient> readPationtFile() throws FileNotFoundException {
		bufferedReader=new BufferedReader(new FileReader(patientFile));
		String jsonArray;
		ArrayList<Patient>arrayList=new ArrayList<Patient>();

		try {
			if((jsonArray=bufferedReader.readLine())!=null)
			{
				//System.out.print(jsonArray+"\n");
				TypeReference<ArrayList<Patient>> typeReference = new TypeReference<ArrayList<Patient>>() {};
				arrayList = mapper.readValue(jsonArray, typeReference);

			}


		} catch (IOException e1) {
			e1.printStackTrace();
		}
		return arrayList;
	}
	private ArrayList<Appointment> readAppointFile() throws FileNotFoundException {
		bufferedReader=new BufferedReader(new FileReader(appointFile));
		String jsonArray;
		ArrayList<Appointment>arrayList=new ArrayList<Appointment>();

		try {
			if((jsonArray=bufferedReader.readLine())!=null)
			{
				//System.out.print(jsonArray+"\n");
				TypeReference<ArrayList<Appointment>> typeReference = new TypeReference<ArrayList<Appointment>>() {};
				arrayList = mapper.readValue(jsonArray, typeReference);

			}


		} catch (IOException e1) {
			e1.printStackTrace();
		}
		return arrayList;
	}
	public void saveAppoint() throws FileNotFoundException {

		ArrayList<Appointment>list1=readAppointFile();
		if(list1.size()>0)
			//appointList.addAll(list1);
			try {
				mapper.writeValue(new FileOutputStream(appointFile), list1);
			} catch (IOException e) {
				e.printStackTrace();
			}
	}

	public void appointment() throws FileNotFoundException
	{
		appointList=new ArrayList<Appointment>();
		System.out.println("Enter the patient name and Id");
		String name=scanner.next();
		int id=scanner.nextInt();
		ArrayList<Patient>array= readPationtFile();

		boolean flag=true;
		for(int i=0;i<array.size();i++)
		{
			if(array.get(i).getName().equals(name)&&array.get(i).getId()==id)
			{
				try {
					searchAppointment(name,id);
				} catch (ParseException | IOException e) {
					e.printStackTrace();
				}
				flag=false;
			}
		}
		if(flag)
		{
			System.out.println(" Patient "+name+" is Not registered..so please add patient to the file..");
			addPatient();
		}

	}

	public void searchAppointment(String name, int id) throws ParseException, JsonGenerationException, JsonMappingException, IOException
	{
		Appointment appointment=new Appointment();
		ArrayList<Doctor> array1=readDoctorFile();
		ArrayList<Appointment> array2=readAppointFile(); 
		doctersDisply();
		System.out.println("Enter the docter name and id to take appointment");
		String docterName=scanner.next();
		int docterId=scanner.nextInt();
		boolean flag1=true;
		for(int j=0;j<array1.size();j++)
		{
			if(array1.get(j).getName().equals(docterName)&&array1.get(j).getId()==docterId)
			{
				if(array1.get(j).getCount()<5)
				{
					appointment.setPatientName(name);
					appointment.setPatientId(id);
					appointment.setDoctorId(docterId);
					appointment.setDoctorName(docterName);
					appointment.setDocterAvalability(array1.get(j).getAvalability());
					System.out.println("Enter Date of Appoientmentd (XX/YY/ZZZZ):");
					Date date=stringToDate(scanner.next());
					String date1=date.toString();
					appointment.setDate(date1);
					array1.get(j).setCount((array1.get(j).getCount())+1);
					array1.get(j).setNumberOfPatients((array1.get(j).getNumberOfPatients()+1));
					flag1=false;
					appointList.add(appointment);
					System.out.println("\t\t\tAppointment sucsessful...");
					break;
				}
				else if(array1.get(j).getCount()>=5)
				{
					array1.get(j).setCount(0);
				}
			}
		}
		if(flag1) {
			System.out.println("dr. "+docterName+" is unable to take appointment...so please search another docter in the list ");
		}
		else
		{
			if(array2.size()>0)
				appointList.addAll(array2);
			mapper.writeValue(new FileOutputStream(appointFile),appointList );

		}
		mapper.writeValue(new FileOutputStream(DoctorFile), array1);
	}
	private Date stringToDate(String stringInput) throws ParseException {
		Date date1=new SimpleDateFormat("dd/MM/yyyy").parse(stringInput);  
		return date1;
	}

	public void getFamousDocter() throws FileNotFoundException {
		//HashMap<String,Integer>hashMap=new HashMap<String,Integer>();
		ArrayList<Doctor>arrayList=readDoctorFile();
		System.out.println("Enter the specilization of Doctor");
		String splzn=scanner.next();
		Doctor doctor = null;
		int count=0;
		for(int i=0;i<arrayList.size();i++)
		{

			if((arrayList.get(i).getNumberOfPatients()>count)&&arrayList.get(i).getSpcilization().equals(splzn))
			{
				doctor=arrayList.get(i);
				count=arrayList.get(i).getNumberOfPatients();
			}
		}
		System.out.println("\t\t\tFamous "+splzn+" Docter");
		System.out.println("\t\t\tDoctor Name         : "+doctor.getName());
		System.out.println("\t\t\tDoctor Id           : "+doctor.getId());
		System.out.println("\t\t\tDoctor Specilization: "+doctor.getSpcilization());
		System.out.println("\t\t\tDoctor Avalability  : "+doctor.getAvalability());
		/*for(int i=0;i<arrayList.size();i++)
		{
			if(hashMap.containsKey(arrayList.get(i).getSpcilization()))
			{
				hashMap.put(arrayList.get(i).getSpcilization(),(hashMap.get(arrayList.get(i).getSpcilization())+1));		
			}
			else
			{
				hashMap.put(arrayList.get(i).getSpcilization(),1);
			}
		}
	int max=0;
	String name;
		for(int i=0;i<hashMap.size();i++)
		{
			if(hashMap.get(i).intValue()>max)
			{
				max=hashMap.get(i).intValue();
			}
		}

	}*/
	}
	public static <T> List<T>  readFile(String filename,Class<T[]> clazz)
	{   List<T> list = null;
	BufferedReader  reader = null;
	String jsonArray = "";
	try {
		reader = new BufferedReader(new FileReader(filename));
	} catch (FileNotFoundException e) {
		System.out.println("\t\t\tFile not exsists");	
	}

	try {
		String line = "";
		while ((line = reader.readLine()) != null) {
			jsonArray += line;
		}
	} catch (IOException e) {
		e.printStackTrace();
	}
	if(jsonArray != null)
	{
		ObjectMapper objectMapper = new ObjectMapper();

		try {
			list= new LinkedList<T> (Arrays.asList(objectMapper.readValue(jsonArray,clazz)));
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	return list;
	}
}
