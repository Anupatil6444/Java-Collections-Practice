//Write a program to convert Array to List

import java.util.*;

public class ArrayToList{
	public static void main(String [] args){
		Integer [] a= new Integer[]{1,2,3,4,5,6,7,8,9,10};
		
		
		List<Integer> list = Arrays.asList(a);
		
		System.out.println(list);
		
		//Find the length of arrryList
		System.out.println(list.size());
	}
}