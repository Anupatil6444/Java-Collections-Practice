//Program for Sorting HashMap by Keys (in TreeMap)

import java.util.*;

public class sortHashMapTreeMap{
	public static void main(String [] args){
		HashMap<Integer,String> h = new HashMap<>();
		h.put(12,"A");
		h.put(13,"H");
		h.put(33,"B");
		h.put(10,"C");
		h.put(6,"S");
		
		System.out.println("Before Sorting");
		for(Map.Entry<Integer,String> entry : h.entrySet()){
			System.out.println("Key-->"+entry.getKey()+"  "+"value-->"+entry.getValue());
		}
		
		Map<Integer,String> map = new TreeMap<>(h);
		System.out.println("After Sorting:");
		
		/*Set set2=map.entrySet();
		Iterator i2 = set2.iterator();
		while(i2.hasNext()){
			Map.Entry pair=(Map.Entry)i2.next();
			System.out.print(pair.getKey()+":");
			System.out.println(pair.getValue());
		}*/
		
		//System.out.println("Before Sorting");
		for(Map.Entry<Integer,String> entry : map.entrySet()){
			System.out.println("Key-->"+entry.getKey()+"  "+"value-->"+entry.getValue());
		}
		
	}
}