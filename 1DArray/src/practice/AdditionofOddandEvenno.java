package practice;
import java.util.Scanner;
public class AdditionofOddandEvenno {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("size of array");
		int size=sc.nextInt();
		int a[]=new int[size];  
		int sum=0;
        int sum1=0;
   	 System.out.println("Enter"+size+"elements:");
		for(int i=0;i<size;i++)
		{
			a[i]=sc.nextInt();
		}
		
		   
		
		for(int i=0;i<size;i++)
		{
			if(a[i]%2==0)
			{
				sum=sum+a[i];
			}
			
			else
			{
				sum1=sum1+a[i];
			}
			
		}
		System.out.println("Addition of even no:"+sum);
		System.out.println("Addition of odd no:"+sum1);
	}

}
