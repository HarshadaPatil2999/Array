package demo;

import java.util.Scanner;

public class Armstrongno {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter any number");
		int n = sc.nextInt();
		double sum = 0.0d;
		int temp = n;
		int count = 0;
		while (temp != 0) {

			count++;
			temp = temp / 10;
		}
		temp = n;

		while (n != 0) {
			int r = n % 10;

			int pow = 1;
			for (int i = 1; i <= count; i++)

			{
				pow = pow * r;

			}
			sum = sum + pow;
			n = n / 10;
		}
		if (temp == sum)
			System.out.println(" Armstrong no");
		else
			System.out.println(" not Armstrong no");

	}

}
