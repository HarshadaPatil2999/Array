package practice;
import java.util.Arrays;
import java.util.Scanner;
public class ArraySwap {
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	
	
//	System.out.println("size");
//	int size=sc.nextInt();
//	int a[]=new int[size];
//	System.out.println("elements");
//	for(int i=0;i<size;i++)
//	{
//		a[i]=sc.nextInt();
//	}
//	for(int i=0;i<size/2;i++)
//	{
//		int j ,b=a[0];
//		
//	for( j=0;j<(size-1);j++)
//			{
//	         a[j]=a[j+1];
//		     }
//			
//	     a[j]=b;
//	}
//	System.out.println("position change array:"+Arrays.toString(a));
//	

		int a[]= {1, 2 ,3, 4, 5, 6, 7, 8};
			
System.out.println("length:"+a.length);
	
		for(int i=0;i<a.length/2;i++)
	{
			int j ,b=a[0];
		for( j=0;j<(a.length-1);j++)
			{
	         a[j]=a[j+1];
		     }
			
		     a[j]=b;
		
	}
		System.out.println(Arrays.toString(a));
		

}
}
