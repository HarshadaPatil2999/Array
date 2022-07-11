package Assignment;
import java.util.Scanner;
public class Symmetricmatrix {
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
	void transpose(int a[][],int c,int r)
	{ 
		int b[][]=new int[c][r];
		System.out.println("transpose of array");
		for(int i=0;i<c;i++)
		{for(int j=0;j<r;j++)
			{
			b[i][j]=a[j][i]; 
			System.out.print(b[i][j]+" ");
			}
		System.out.println();
		} 
		int count=0;
		for(int i=0;i<c;i++)
		{
			for(int j=0;j<r;j++)
		     {
			if(b[i][j]==a[i][j]) 
			{
				count++;
			}
			
		    }
			
		}
		if(count==(c*r))
		{
			System.out.println("Symmetric matrix");
		}
		else
		{
			System.out.println("unsymmetric matrix");
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
		
		
		Symmetricmatrix a1=new Symmetricmatrix ();
		a1.displayInput(a, r, c);
		a1.transpose(a, c, r);
		
	}


}
