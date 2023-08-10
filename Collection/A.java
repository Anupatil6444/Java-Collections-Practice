public class A{
	public static void main(String[]args){
		int size=5;
		for(int i=1;i<(5*6);i++)
		{
			for(int j=1;j<(5*6);j++)
			{
				if(i%6==0 || j%6==0)
					System.out.print("  ");
				else
			   System.out.print("*");
			}
			System.out.println();
		}
	}
}
