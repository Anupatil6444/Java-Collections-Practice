//Write a program to convert LinkedList to ArrayList

import java.util.*;

public class ConvertLinkedListToArrayList{
	public static void main(String[] args){
		LinkedList<Integer> ll = new LinkedList<>();
		ll.add(3);
		ll.add(8);
		ll.add(5);
		
		System.out.println(ll);
		
		ArrayList<Integer> arr = new ArrayList<>(ll);
		
		System.out.println(arr);
	}
}