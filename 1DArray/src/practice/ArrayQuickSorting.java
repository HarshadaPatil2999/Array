package practice;
import java.util.Arrays;
import java.util.Scanner;
public class ArrayQuickSorting {
	public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	  System.out.println("size of array ");
	   int size=sc.nextInt();
	   int a[]=new int[size]; 
	   System.out.println("Enter elements of array a:");
	   for(int i=0;i<size;i++)
		{
			a[i]=sc.nextInt();
		
		} System.out.println();
		
		 for(int i=0;i<size;i++)
		 {
			 for(int j=i+1;j<size;j++)
			 {
				 if(a[i]<a[j])//Descending order
				 {
					 int temp=a[i];
					 a[i]=a[j];
					 a[j]=temp;
				 }
			 }
		 }
		 System.out.println("quicksort array is:"+Arrays.toString(a));
		System.out.println("second highest no: "+a[1]);
		 System.out.println("second smallest no:"+a[size-2]);
		 
		 
		 
		 
		 
		 
}
}