package demo;
import java.util.Scanner;
public class Choice {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter 2 numbers");
		int a=sc.nextInt();
		int b=sc.nextInt();
		System.out.println("press 1-add 2-sub 3-mul 4-div");
		int choice=sc.nextInt();
		switch(choice)
		{
		case 1:System.out.println("addition:"+(a+b));
		break;
		case 2:System.out.println("substraction"+(a-b));
		break;
		case 3:System.out.println("multiplication:"+(a*b));
		break;
		case 4:System.out.println("division:"+(a/b));
		break;
		
		
		default :
		System.out.println("invalid choice");
		}
		
}
}

	