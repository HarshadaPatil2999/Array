package Demo;
import java.util.Scanner;
public class Multiplicationofelements {
	void displayInput(int a[][],int r,int c)
	{
		System.out.println("Enter"+(r*c)+"Elements");
		for(int i=0;i<r;i++)
		{
			for(int j=0;j<c;j++)
			{
				System.out.print(a[i][j]+"\t ");
			}System.out.println();
		}

	}
	void multiplicationElement(int a[][],int r,int c)
	{
		for(int i=0;i<r;i++)
	{   int mul=1;
		for(int j=0;j<c;j++)
		{
			mul=mul*a[i][j];
			
		}System.out.println("Multiplication:"+mul);
	
	}
		System.out.println();
		
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
		
	Multiplicationofelements a1=new Multiplicationofelements  ();
		a1.displayInput(a, r, c);
		a1.multiplicationElement(a,r,c);
	}


}
