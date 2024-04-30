package pck;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Hashtable;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import java.util.TreeMap;
import java.util.TreeSet;
import java.util.Vector;

import pckg2.abs;

public class Class2 {

	//main method - compiler requires to run the java application
	
	public static void main(String args[]) {
		
		Class2 obj =new Class2();
		
		//list of phone numbers of the employees
		
		Map<String, Integer> listofPhone= new TreeMap<String,Integer>();
		listofPhone.put("Adil",4346 );
		listofPhone.put("egrhtr",346587 );
		listofPhone.put("ryhth",46 );
		listofPhone.put("35467",46 );
		listofPhone.put("23465",45635678 );
		
		System.out.println(listofPhone);
		
		System.out.println(listofPhone.get("Adil"));
		System.out.println(listofPhone.keySet());
		System.out.println(listofPhone.values());
		
		Iterator itr=listofPhone.entrySet().iterator();
		
		while(itr.hasNext()) {
			Map.Entry<String, Integer> entry=(Entry<String, Integer>) itr.next();
			System.out.print("Entry is " + entry.getKey()+" ");
			System.out.println("Value is " + entry.getValue());
			
		}
				
	}
				
	//user defined method are created for our own purpose when ever we required to do the same thing more than one time
	
	
	//acces specifier returntype methodname(paramters)
	
	public int sum(int a , int b, int c) {
		return a+b+c;
	}
	
}
