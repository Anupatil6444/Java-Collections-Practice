import java.util.*;
class ArrayListTraverse{
	public static void main(String [] args){
		ArrayList<Integer> f1 = new ArrayList<Integer>();
		f1.add(2);
		f1.add(5);
		f1.add(8);
		System.out.println(f1);	
		
		//By using For Loop
        for(int i=0;i<f1.size();i++)
		{
			System.out.println(f1.get(i));
		}	
        System.out.println("****************************************");
		
		//By using ForEach Loop
		for(Integer a: f1)
		{
			System.out.println(a);
		}
		 System.out.println("****************************************");
		 
		 //By using llop with iterator
		 for(Iterator iterator =f1.iterator(); iterator.hasNext();){
			Integer a=(Integer)iterator.next();
			System.out.println(a);
		 }
		  System.out.println("****************************************");
		  
		  //by using iterator with while loop
		  Iterator<Integer> iterator =f1.iterator();
		  while(iterator.hasNext())
		  {
			int a = iterator.next();
			System.out.println(a);
		  }
		  System.out.println("****************************************");
		  
		  //By using stream + lambda
		  f1.stream().forEach(a->System.out.println(a));
		  System.out.println("****************************************");
		  
		  //By using forEach + lambda
		  f1.forEach((a)->System.out.println(a));
	}
}