package Demo;
import java.util.Scanner;
public class Transposethematrix {
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
	void transpose(int a[][],int c,int r)
	{ 
		int b[][]=new int[c][r];
		System.out.println("transpose of array");
		for(int i=0;i<c;i++)
		{for(int j=0;j<r;j++)
			{
			b[i][j]=a[j][i]; 
			System.out.print(b[i][j]+"\t ");
			}
		System.out.println();
		} 

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
		
		
	Transposethematrix a1=new Transposethematrix ();
		a1.displayInput(a, r, c);
		a1.transpose(a, c, r);
		
	}


}
