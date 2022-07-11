package practice;
import java.util.Arrays;
import java.util.Scanner;
public class ArrayBubleSorting {
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
				 for(int j=0;j<size-1;j++)
				 {
					 if(a[j]>a[j+1])//Ascending order
					 {
						 int temp=a[j];
						 a[j]=a[j+1];
						 a[j+1]=temp;
					 }
				 }
			 }
			 System.out.println("Bouble sort array is:"+Arrays.toString(a));
			System.out.println("second smallest no: "+a[1]);
			 System.out.println("second highest no:"+a[size-2]);
//		Arrays.sort(a);	 
//		System.out.println(Arrays.toString(a));
//		System.out.println("second smallest no: "+a[1]);
//	 System.out.println("second highest no:"+a[size-2]);

}
}