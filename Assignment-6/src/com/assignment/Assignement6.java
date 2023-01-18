package com.assignment;

import java.util.ArrayList;
import java.util.TreeMap;

public class Assignement6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		CountryListDemo countryListDemo = new CountryListDemo();
		TreeMap<String, ArrayList<String>> tm = new TreeMap<>();
		ArrayList<String> districts = new ArrayList<>();
		districts.add("KAdapa");
		districts.add("Karnool");
		districts.add("Hyderabad");
		ArrayList<String> districts1 = new ArrayList<>();
		districts1.add("Washington");
		districts1.add("Texas");
		tm.put("India", districts);
		tm.put("USA", districts1);
		
		//testing 3 scenarios
		countryListDemo.getCountry("abc",tm);
		countryListDemo.listCountryBefore("USA",tm);
		countryListDemo.listCountryAfter("India",tm);
	}

}
