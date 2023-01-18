package com.assignment;

import java.util.ArrayList;
import java.util.Map.Entry;
import java.util.Set;
import java.util.TreeMap;

public class CountryListDemo {
	
	public void getCountry(String countryName, TreeMap<String, ArrayList<String>> tm) {
		// TODO Auto-generated method stub
		if(tm.containsKey(countryName)) {
			System.out.println("Districts for the Entered Country:");
			System.out.println(tm.get(countryName));
		}else {
			System.out.println("Country Name not found");
		}
		System.out.println("=====================");
		
	}

	public void listCountryBefore(String countryName, TreeMap<String, ArrayList<String>> tm) {
		Set<Entry<String, ArrayList<String>>> set =tm.entrySet();
		System.out.println("District names before country name:");
		for(Entry<String, ArrayList<String>> e:set) {
			if(e.getKey().equals(countryName)) {
			System.out.println(e.getValue()+":"+e.getKey());
			}
		}
		System.out.println("=====================");
		
	}

	public void listCountryAfter(String countryName, TreeMap<String, ArrayList<String>> tm) {
		Set<Entry<String, ArrayList<String>>> set =tm.entrySet();
		System.out.println("District names after country name:");
		for(Entry<String, ArrayList<String>> e:set) {
			if(e.getKey().equals(countryName)) {
			System.out.println(e.getKey()+":"+e.getValue());
			}
		}
		System.out.println("=====================");
		
	}
	
	

}
