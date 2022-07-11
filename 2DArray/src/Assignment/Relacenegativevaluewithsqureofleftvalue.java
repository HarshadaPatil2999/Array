package Assignment;
import java.util.Arrays;
import java.util.Scanner;
public class Relacenegativevaluewithsqureofleftvalue {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter size of array ");
		int size=sc.nextInt();
		int a[]=new int[size];
		System.out.println("elements"+size+" of array:");
		for(int i=0;i<size;i++)
		{
			a[i]=sc.nextInt();
		}
		System.out.println("Original array:"+Arrays.toString(a));
		System.out.println();
			
		for(int i=0;i<size;i++)
		{
			if(a[i]<0)
		    {
			a[i]=a[i-1]*a[i-1];
		    }
		}
		
		System.out.println("output:"+Arrays.toString(a));
}
}
