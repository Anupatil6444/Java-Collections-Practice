
//Write a program to traverse(or iterate) HashSet

import java.util.*;

public class traverseHashSet{
	public static void main(String[] args){
		Set<String> f1 = new HashSet<>();
		f1.add("anu");
		f1.add("dhanu");
		f1.add("tanu");
		
		System.out.println(f1);
		
		System.out.println("***********************************");
		
		//Without iterator 
		for(String a : f1)
		{
			System.out.println(a);
		}
		
		System.out.println("***********************************");
		
		//With iterator
		Iterator<String> iterator=f1.iterator();
		while(iterator.hasNext())
		{
			String a = iterator.next();
			System.out.println(a);
		}
		
	}
}
