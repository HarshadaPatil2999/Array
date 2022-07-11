package demo;
import java.util.Scanner;
import java.util.Arrays;
import java.util.Scanner;
public class PrintTableofno {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter number");
		int n=sc.nextInt();
		
        int a[]=new int[10];
	
		for(int j=0;j<10;j++)
		
		{
			 a[j] = n*(j+1);
			 
		}
		 
	
	   System.out.print(Arrays.toString(a));
			
				
		
	}

}
