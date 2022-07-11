package practice;
import java.util.Scanner;
public class Average {
	public static void main(String[] args)
	{
		
		Scanner sc=new Scanner(System.in);
		System.out.println("size of array");
		int size=sc.nextInt();
		float a[]=new float[size]; 
		float n=0;
	 System.out.println("Enter"+size+"elements:");
		for(int i=0;i<size;i++)
		{
			a[i]=sc.nextFloat();
			n=n+a[i];
			
	    }
		 System.out.println();
		float total=n/size;
		System.out.println("total:"+total);
		
 		}

}
