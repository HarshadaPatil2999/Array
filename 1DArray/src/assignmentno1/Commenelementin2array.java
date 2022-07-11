package assignmentno1;

import java.util.Scanner;

public class Commenelementin2array {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter size of array a");
		int size = sc.nextInt();
		int a[] = new int[size];
		System.out.println("elements of array a");
		for (int i = 0; i < size; i++) {
			a[i] = sc.nextInt();
		}
		System.out.println();
      System.out.println("Enter size1 of array b");
		int size1 = sc.nextInt();
		int b[] = new int[size1];
		System.out.println("elements of array b");
		for (int j = 0; j < size1; j++)
		{
			b[j] = sc.nextInt();
		}
		System.out.println();

		for (int i = 0; i < size; i++)
		{
	      for (int j = 0; j <size1; j++)
			{  
				if (a[i] == b[j])
				System.out.print(a[i] + " ");
			}

		}

	}
}