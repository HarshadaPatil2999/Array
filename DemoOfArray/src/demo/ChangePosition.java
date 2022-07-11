package demo;
import java.util.Arrays;
import java.util.Scanner;
public class ChangePosition {
	
	void changePosition(int a[],int size)
     { 
		int b=size/2;
		for(int i=0;i<size/2;i++)
	   { 
		int temp=a[i];
		a[i]=a[b];
		a[b]=temp;
		 b++;
	   }
	System.out.println(Arrays.toString(a));
	
   }
	
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter size of array");
		int size=sc.nextInt();
		int a[]=new int[size];
		System.out.println("Enter elements of array");
		
		for(int i=0;i<size;i++)
		{
			a[i]=sc.nextInt();
		}
		
		ChangePosition c=new ChangePosition() ;
		c.changePosition(a, size);
		
	}

}
