package assignmentNo2;

import java.util.Arrays;

//import java.util.Arrays;
import java.util.Scanner;
public class Find2ndmaxno {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter size of array");
		int size=sc.nextInt();
		int a[]=new int[size];
		System.out.println("elements of array");
		for(int i=0;i<size;i++)
		{
			a[i]=sc.nextInt();
		}System.out.println();
		
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
	 System.out.println("second max no: "+a[1]);

// int a[]= {20,0,31,45,100,1,105,90};
// 
// for(int i=0;i<a.length;i++)
// {
//	 Arrays.sort(a);
//	
// } System.out.println(Arrays.toString(a));
// System.out.println("2nd max no:"+a[a.length-2]);
//		int a[]= {20,0,31,45,100,1,105,90};
		 for(int i=0;i<a.length;i++)
		 {
			for(int j=i+1;j<a.length;j++)
			{
				if(a[i]<a[j])
				{
					int temp=a[i];
					a[i]=a[j];
					a[j]=temp;
				}
			}
			
		 }System.out.println("array:"+Arrays.toString(a));
		 System.out.println("2nd max no:"+a[1]);
	}

}
