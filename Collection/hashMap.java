//Write a program to add elements to the HashMap given the key and value data type is String

import java.util.*;

public class hashMap{
	public static void main(String [] args){
		HashMap<String,String> h = new HashMap<>();
		h.put("1","Anu");
		h.put("2","Tanu");
		h.put("3","Dhanu");
		
		System.out.println(h);
		System.out.println("***********************************");
		
		//How to check if HashMap is empty
		
		System.out.println(h.isEmpty());
		System.out.println("***********************************");
		
		//with using ForEach method 
		for(Map.Entry<String, String> entry : h.entrySet()){
			System.out.println("Key --> " + entry.getKey()+"  "+
								"Value--> "+entry.getValue());
		}
		
		//with using forEach
		//h.forEach(K,V)->(System.out.println("Key --> " + K+"  "+
			//			"Value--> V));
		System.out.println("***********************************");
		
		//with using iterator
		Set<Map.Entry<String,String>> entries= h.entrySet();
		Iterator<Map.Entry<String,String>> iterator = entries.iterator();
		while(iterator.hasNext())
		{
			Map.Entry<String,String> entry = iterator.next();
			System.out.println("Key --> " + entry.getKey()+"  "+
								"Value--> "+entry.getValue());
		}
	}
}