package Assignment;

import java.util.Scanner;

public class Transposematrixwithoutmethod {
	
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
				}
				
			}
			System.out.println("Original matrix:");
			for(int i=0;i<r;i++)
			{
				for(int j=0;j<c;j++)
				{
					System.out.print(a[i][j]+" ");
				}
				System.out.println();
			}
			
			
			System.out.println("Transpose matrix:");
			int b[][]=new int[c][r];
			
			for(int i=0;i<c;i++)
			{
				for(int j=0;j<r;j++)
				{
					b[i][j]=a[j][i];
					System.out.print(b[i][j]+" ");
					
				}System.out.println();
			}
				
		
}

}
