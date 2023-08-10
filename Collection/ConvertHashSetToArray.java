//Write a program to convert HashSet to Array

import java.util.*;

public class ConvertHashSetToArray{
	public static void main(String [] args){
		HashSet<String> h = new HashSet<>();
		h.add("anu");
		h.add("dhanu");
		h.add("Tanu");
		System.out.println(h);
		System.out.println("************************************");
		String [] arr = new String[h.size()];
		
		//By using toArray() method
		h.toArray(arr);
		
		for(String a: arr)
		{
			System.out.println(a);
		}
		System.out.println("************************************");
		
		//by Traverse the HashSet elements and add them to the Array object
		String [] arr1 = new String[h.size()];
		int index=0;
		//itrating over the HashSet and adding elements to an array
		for(String element:h){
			arr1[index++]=element;
		}
		//Display array
		for(String a: arr1)
		{
			System.out.println(a);
		}
	}
}