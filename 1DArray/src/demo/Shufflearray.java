package demo;

import java.util.Arrays;

public class Shufflearray {
	public static void main(String[] args) {
		int a[]= { 5,6,23,67,39,10,2};
		//6 23 67 39 10 2 5
		int temp=a[0];
		for(int i=0;i<a.length-1;i++)
		{ 
			a[i]=a[i+1];
			
		}
		a[a.length-1]=temp;
	System.out.println(Arrays.toString(a));	
		
//		for(int i=0;i<a.length;i++)
//		{
//			System.out.print(a[i]+" ");
//		}
//		
	}

}
