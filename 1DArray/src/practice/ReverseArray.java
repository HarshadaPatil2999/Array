package practice;
import java.util.Scanner;
import java.util.Arrays;

public class ReverseArray {
	public static void main(String[] args)
	{
		
//	int a[]= {1,2,3,4,5,6}; 
//	int n=a.length;
//	
////	for(int i=0;i<a.length/2;i++)
////		{
////		  int temp=a[i];
////		  a[i]=a[a.length-i-1];
////		  a[a.length-i-1]=temp;
////		
////         
////		} System.out.println("reverse array is:");
////	     System.out.println(Arrays.toString(a));
//	for(int i=0;i<n/2;i++)
//	{
//	  int temp=a[i];
//	  a[i]=a[n-i-1];
//      a[n-i-1]=temp;
//	
//     } System.out.println("reverse array is:");
//	     System.out.println(Arrays.toString(a));
//	
		Scanner sc=new Scanner(System.in);
		System.out.println("size");
		int size=sc.nextInt();
		int a[]=new int[size];
		System.out.println("elements");
		for(int i=0;i<size;i++)
		{
			a[i]=sc.nextInt();
		}
		for(int i=0;i<size/2;i++)
		{
			int temp=a[i];
			a[i]=a[size-i-1];
			a[size-i-1]=temp;
		}
		System.out.println("reverse array:"+Arrays.toString(a));
		
	
	}		

}
