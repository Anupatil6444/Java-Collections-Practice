
import java.util.*;
public class ListToArray{
	public static void main(String [] args)
	{
		List<Integer> list = new ArrayList<>();
		list.add(1);
		list.add(4);
		list.add(6);
		System.out.println(list);
		//Integer [] a=list.toArray(new Integer[0]);
		int []a =Integer.parseInt(list.toArray());
		for(int b :a)
			System.out.println(b);
	}
}