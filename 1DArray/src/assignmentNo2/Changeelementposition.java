package assignmentNo2;
import java.util.Arrays;
import java.util.Scanner;
public class Changeelementposition {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter size of array a");
		int size = sc.nextInt();
	    int a[]=new int[size];
		System.out.println("elements of a");
		for(int i=0;i<size;i++)
		{
			a[i]=sc.nextInt();
		}
		   System.out.println();
		   int b=size/2;
		  int temp=0;
		  for(int i=0;i<size/2;i++)
		   { 
			     temp=a[i];
			     a[i]=a[b];
			    a[b]=temp;
			      b++;
		   } 
		  System.out.println(Arrays.toString(a));
		   
		  
		  
		  
		  
		  // 0  1 2 3
//		int a[]= {1,2,3,4};
//		int b=(a.length/2);
//		int temp=0;
//		for(int i=0;i<(a.length/2);i++)
//		{
//			//3//4
//			 temp=a[i];//1
//			a[i]=a[b];//3
//			a[b]=temp;//1
//			b++;
//		}System.out.print(Arrays.toString(a));//3
		
		   
	}

}
