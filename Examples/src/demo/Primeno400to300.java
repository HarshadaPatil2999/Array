package demo;

import java.util.Scanner;

public class Primeno400to300 {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int m = 400;
		int n = 300;
		for (int i = m; i >= n; i--)

		{
			int count = 0;

			for (int j = 1; j <= i; j++)
			{
				if (i % j == 0)
				{
					count++;
				}
			}
			if (count == 2)
			{
				System.out.println(i);
			}
		}
	}

	}

