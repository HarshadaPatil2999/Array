package demo;
import java.util.Scanner;
public class Minrow {
	public static void main(String[] args) {
		int arr[][] = {{22,31,9},{12,25,16}};
		for(int i=0;i<arr.length;i++)
		{   int min=arr[0][0];
			for(int j=0;j<arr[0].length;j++)//22 31 9
				                           //12 5 16
			   {                             
				if(min>arr[i][j])
				{
					min=arr[i][j];
				}
				
			}
			System.out.print(min+" ");
		}
		
		
		
	}

}
