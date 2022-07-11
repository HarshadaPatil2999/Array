package demo;

import java.util.Scanner;

public class ChecknoisKrishnamurthy {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("enter any number");

		int n = sc.nextInt();
		int temp = n;
		
		int sum = 0;

		while (n!= 0) {
             int fact=1;
			int r = n % 10;
			for (int i = 1; i <= r; i++)
			{
				fact = fact * i;
			}
			sum = sum + fact;
			n= n / 10;

		} 
		if (temp == sum)
			System.out.println("number is Krishnmurthy:"+sum );
		else
			System.out.println("number is not Krishnmurthy:" +sum);

	}
}
