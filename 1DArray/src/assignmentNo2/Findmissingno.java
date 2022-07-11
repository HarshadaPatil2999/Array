package assignmentNo2;
import java.util.Scanner;
public class Findmissingno {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter size");
		int size=sc.nextInt();
		int a[]=new int[size];
		System.out.println("enter"+size+"elements ");
		
		for(int i=0;i<size;i++)
		{
			a[i]=sc.nextInt();
		}System.out.println();
		int count=1;
		for(int i=0;i<size;)
		{
			if(a[i]==count)
			{i++;
				count++;
			}
			else {
				System.out.print(count+" ");
				   count++;
				}
		}
		
		
		
		
		
		
		
		
//		int a[]= {1,2,3,4,7,9};
//		int count=1;
//		for(int i=0;i<a.length;)
//		{
//			if(a[i]==count)
//				
//		    {
//				i++;
//		      count++;
//			} 
//		else {
//			System.out.print(count+" ");
//			 count++;
//		}
//		}
	    
	}

}
