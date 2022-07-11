package Demo;
import java.util.Scanner;
public class Display2Darray {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter r and c ");
		int r=sc.nextInt();
		int c=sc.nextInt();
		
		int a[][]=new int[r][c];
		System.out.println("Enter"+(r*c)+"elements of array:");
		for(int i=0;i<r;i++)
		{
			for(int j=0;j<c;j++)
			{
				a[i][j]=sc.nextInt();
				System.out.print(a[i][j]+" ");
			}System.out.println();
		}
		
	}

}
