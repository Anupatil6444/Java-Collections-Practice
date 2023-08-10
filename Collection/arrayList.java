
//Given an element write a program to check if element(value) exists in ArrayList
//Write a program to add element at particular index of ArrayList
//Write a program to remove element from specified index of ArrayList
//program to retrieve an element (at a specified index) from a given array list.
//Shuffle elements in a array list
import java.util.*;

public class arrayList{
	public static void main(String [] args){
		ArrayList<Integer> arr = new ArrayList<>();
		arr.add(1);
		arr.add(2);
		arr.add(3);
		arr.add(5);
		arr.add(2);
		//check if element(value) exists
		if(arr.contains(2))
			System.out.println("Yes");
		else
			System.out.println("No");
		
		//add element at particular index
		arr.add(1,5);
		System.out.println(arr);
		
		//remove element from specified index
		arr.remove(3);
		System.out.println(arr);
		
		//retrieve an element (at a specified index)
		int a=arr.get(2);
		System.out.println(a);
	
		//Shuffle elements in a array list
		Collections.shuffle(arr);
		System.out.println(arr);
	}
}
