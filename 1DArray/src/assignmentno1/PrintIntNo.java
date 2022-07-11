package assignmentno1;

import java.util.Scanner;

public class PrintIntNo {
	public static void main(String[] args) {
		Scanner sc =new Scanner(System.in);
		System.out.println("Enter size of array");
		int size=sc.nextInt();
		System.out.println("Elements of array are:");
		int a[]= new int[size];
		for(int i=0;i<size;i++)
		{
			a[i]=sc.nextInt();
			System.out.print(a[i]+" ");
		}
		
		
		
		
	}

}
