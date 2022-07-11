package demo;

import java.util.Scanner;

public class Calculatepower {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("enter base and index");
		int base = sc.nextInt();
	     int index = sc.nextInt();
	     double power=Math.pow(base, index);
	     System.out.println("power of no:"+power);
		
		

		}

	}


