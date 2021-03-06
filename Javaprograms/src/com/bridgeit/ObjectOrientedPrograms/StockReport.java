package com.bridgeit.ObjectOrientedPrograms;

import java.io.FileNotFoundException;
import java.io.PrintWriter;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;

import com.bridgeit.utility.Utility;
	public class StockReport {

		public static void main(String[] args){
			JSONArray jsonArray = new JSONArray();
			Utility utility = new Utility();
			System.out.println("Enter Number of company");
			int number = utility.IntegerInput();
		    String[] array = new String[number];
			int share[] = new int[number];
			int amount[] = new int[number];
			int total[] = new int[number];
			System.out.println("Enter company name");
			int totalStock=0;
			for(int i=0; i<number; i++){

				array[i] = utility.StringInput();
			}


			for(int i=0; i<number; i++){
				System.out.println("Enter the number of shares for "+array[i]+" and share amount");
				share[i] = utility.IntegerInput();
				amount[i] = utility.IntegerInput();
			}

			for(int i=0; i<number; i++){
				total[i] = share[i]*amount[i];
			}
			System.out.println();
			System.out.println("\t*******************Stock Report**********************");
			System.out.println("\t=====================================================");
			System.out.println("\t|=Company Name|==|Shares|==|Price|==|total of each=|");
			System.out.println();
			PrintWriter printWriter =null;
			try {
				printWriter = new PrintWriter("/home/bridgeit/Json/myfile1.json");
			} catch (FileNotFoundException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}
			
			for(int i=0; i<number; i++)
			{
				System.out.printf("%14s,%12d,%12d,%15d",array[i],share[i],amount[i],total[i]);
				System.out.println();
				JSONObject jsonObject = new JSONObject();
				jsonObject.put("Company Name",array[i]);
				jsonObject.put("Shares",share[i]);
				jsonObject.put("Price",amount[i]);
				jsonObject.put("total",total[i]);
				jsonArray.add(jsonObject);
				
			}	
			
			printWriter.write(jsonArray.toJSONString());
			printWriter.flush();
			printWriter.close();
			System.out.println();
			System.out.println("\t=====================================================");

			for(int i=0; i<number; i++){

				totalStock+= share[i]*amount[i];
			}
			System.out.println("Total stock is: "+totalStock);
		}


}
