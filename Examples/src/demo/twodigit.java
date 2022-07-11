package demo;
import java.util.Scanner;
public class twodigit {public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	System.out.println("enter the number");
	int a=sc.nextInt();



if (a>=10 && a<100)

	{
	   System.out.println(" it is 2 digit no");
	   { 
	   if(a%2==0)
	   { System.out.println("it is even no");
	
        int lastdigit=a%10;
      System.out.println("last digit:"+lastdigit);}
    
      else 
      System.out.println("it is odd no");
  }

	}


else 
	System.out.println("it is not 2 digit no");
}
}