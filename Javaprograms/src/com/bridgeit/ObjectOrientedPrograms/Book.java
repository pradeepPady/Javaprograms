package com.bridgeit.ObjectOrientedPrograms;

import java.util.Scanner;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;

class Book{
	Scanner s = new Scanner(System.in);
	class Entry{
		JSONObject jsonObject=new JSONObject();
		JSONArray jsonArray=new JSONArray();
		String bookFile="";
		private String first;
		private String last;
		private String address;
		private String Zip;
		Entry(String first, String last, String address, String Zip){
			this.first = first;
			this.last = last;
			this.address = address;
			this.Zip = Zip;
			
		}
		Entry(){
			first = "";
			last = "";
			address = "";
			Zip = "";
		}
		public void readEntry(){
			System.out.println("First Name:"+first );
			System.out.println("Last Name:"+last );
			System.out.println("Address:"+address );
			System.out.println("Zip:"+Zip );
		}
	}

	private int entries = 0;
	Entry[] contents;
	public void initEntries(int e){
		contents = new Entry[e];
		for (int i = 0;i<contents.length;i++){   
			contents[i] = new Entry();
		}
	}
	public int getEntries(){
		return contents.length;
	}
	public void add(String first, String last, String address, String Zip){
		if (entries<contents.length){
			contents[entries] = new Entry(first, last, address, Zip);
			entries++;
		}
		else System.out.println("Error: book is full");
	}

	public void remove(int entry){
		if (entries>0){
			contents[entry] = new Entry();
			for (int i = 0;i<entries-entry;i++){
				if (entry+1==entries) contents[entry] = new Entry();
				else{
					Entry temp = contents[entry+i];
					contents[entry+i] = contents[entry+i+1]; 
					contents[entry+i+1] = temp;
				}
			}
			entries--;
		}
		else System.out.println("Error: book is empty.");
	}
	public void edit(String first, String last, String address, String Zip, int selection){
		contents[selection].first = first;
		contents[selection].last = last;
		contents[selection].address = address;
		contents[selection].Zip = Zip;
	}
	public void sort(int n){
		for(int i = 0;i<contents.length;i++){
			for (int j = 0;j<contents.length;j++){
				switch(n){
				case 1:
					if (contents[i].first.compareTo(contents[j].first)<0){
						Entry temp = contents[i];
						contents[i] = contents[j];
						contents[j] = temp;
					}
					break;
				case 2:
					if (contents[i].last.compareTo(contents[j].last)<0){
						Entry temp = contents[i];
						contents[i] = contents[j];
						contents[j] = temp;
					}
					break;
				case 3:
					if (contents[i].address.compareTo(contents[j].address)<0){
						Entry temp = contents[i];
						contents[i] = contents[j];
						contents[j] = temp;
					}
					break;
				case 4:
					if (contents[i].Zip.compareTo(contents[j].Zip)<0){
						Entry temp = contents[i];
						contents[i] = contents[j];
						contents[j] = temp;
					}
					break;
				default: 
					System.out.println("Error: invalid field");
					break;
				}
			}
		}
	}
	public void addFromCopy(Entry e){
		if (entries<contents.length){
			contents[entries] = e;
			entries++;
		}
		else System.out.println("Error: book is full");
	}
}

