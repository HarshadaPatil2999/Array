package practice;
import java.util.Scanner;
public class EqualArray {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
	  System.out.println("size of array a");
	int size=sc.nextInt();
	System.out.println("size of array b");
	int size1=sc.nextInt();
	int a[]=new int[size]; 
	System.out.println("Enter elements of array a:");
	System.out.println();
	
	for(int i=0;i<size;i++)
	{
		a[i]=sc.nextInt();
	
	} System.out.println();
	
	System.out.println("Enter elements of array b:");
	int b[]=new int[size1]; 
	for(int i=0;i<size1;i++)
	{	
		b[i]=sc.nextInt();
	
	}
	 System.out.println();
	  
	 int cnt=0;
if(size==size1)
	{ for(int i=0;i<size;i++)
		{
	       if(a[i]==b[i])
		    {
			cnt++;
		    }
		
		}
		if(cnt==size) 
		{
			System.out.println("match");
	     }
		else
		    {
			System.out.println("miss match");
		    }
	
	}
else
		{
			System.out.println("miss match size");
		}
	
		}
}