package Demo;
import java.util.Scanner;
public class Additionofeachrow {
	void displayInput(int a[][],int r,int c)
	{
		System.out.println("Enter"+(r*c)+"Elements");
		for(int i=0;i<r;i++)
		{
			for(int j=0;j<c;j++)
			{
				System.out.print(a[i][j]+" ");
			}System.out.println();
		}

	}
	void additionElement(int a[][],int r,int c)
	{
		for(int i=0;i<r;i++)
	{   int sum=0;
		for(int j=0;j<c;j++)
		{
			sum=sum+a[i][j];
			
		}
		System.out.println("Addition:"+sum);
		
		}System.out.println();
		
	}
	public static void main(String[] args) {
		int r,c;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter r and c");
		r=sc.nextInt();
		c=sc.nextInt();
		int a[][]=new int[r][c];
		System.out.println("Enter"+(r*c)+"Elements");
		for(int i=0;i<r;i++)
		{
			for(int j=0;j<c;j++)
			{
				a[i][j]=sc.nextInt();
			}System.out.println();
		}
		
	Additionofeachrow a1=new Additionofeachrow();
		a1.displayInput(a, r, c);
		a1.additionElement(a,r,c);
	}

}
