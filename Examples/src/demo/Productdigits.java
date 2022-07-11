package demo;

import java.util.Scanner;

public class Productdigits {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter any number");

		int n = sc.nextInt();
		int product = 1;
		while (n > 0)
		{

			int r = n % 10;
			product = product * r;
			n = n / 10;

		}System.out.println("product of digits:" + product);

	}

}
