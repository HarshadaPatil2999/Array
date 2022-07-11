package demo;

import java.util.Scanner;

public class Frequencyofdigits {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter any number");
		int n = sc.nextInt();
	System.out.println("Digit\tFrequency");
		int temp;
		temp = n;
		for (int i = 0; i <= 9; i++)
		{
			int count = 0;
			
			while (n != 0)
			{

				int r = n % 10;
				if (r == i)
				{
					count++;
				}
				n = n / 10;

			}
			n = temp;
			if (count > 0)
				System.out.println(i + " \t" + count);

		}

	}
}
