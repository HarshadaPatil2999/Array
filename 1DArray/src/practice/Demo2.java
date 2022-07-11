package practice;
import java.util.Scanner;
public class Demo2 {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("size of array");
		int size=sc.nextInt();
		int a[]=new int[size];  
		
   	 System.out.println("Enter"+size+"elements:");
		for(int i=0;i<size;i++)
		{
			a[i]=sc.nextInt();
		}
		
		   
		
		for(int i=0;i<size;i++)
		{
			System.out.print(a[i]+" ");
		}
		System.out.println( );
	}


}
