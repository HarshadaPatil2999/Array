package Assignment;
import java.util.Scanner;
public class Findsumoflowertriangularmatrix {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter row and column ");
		int r=sc.nextInt();
		int c=sc.nextInt();
		int a[][]=new int[r][c];
		System.out.println("elements"+(r*c)+" of array:");
		for(int i=0;i<r;i++)
		{for(int j=0;j<c;j++)
		{
			a[i][j]=sc.nextInt();
		}
			
		}
		    int sum=0;
		
		for(int i=0;i<r;i++)
		{
			for(int j=0;j<c;j++)
			{if(i>j)
				
				sum=sum+a[i][j];
				}
			
			}System.out.println("Sum of main diagonal:"+sum);
		}

}
