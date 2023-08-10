//Write a program to sort ArrayList in descending order by using ReverseOrder() method 

import java.util.*;

public class ArrayListSortReverse{
	public static void main(String [] args){
		ArrayList<Integer> arr = new ArrayList<>();
		arr.add(2);
		arr.add(8);
		arr.add(3);
		arr.add(1);
		arr.add(5);
		arr.add(3);
		System.out.println("Before Sorting: ");
		//Collections.sort(arr);
		System.out.println(arr);
		Collections.sort(arr,Collections.reverseOrder());
		//Collections.reverse(arr);
		System.out.println("After Sorting: ");
		System.out.println(arr);
	}
}