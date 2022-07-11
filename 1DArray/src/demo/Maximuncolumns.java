package demo;

import java.util.Arrays;

public class Maximuncolumns {
	public static void main(String[] args) {
		int arr[][] = {{22,31,9},{12,5,16},{34,42,2}};
		                                              
		for(int i=0;i<3;i++)
		{int max=Integer.MIN_VALUE;
			for(int j=0;j<3;j++)
			{  if(max<arr[j][i])
			    {
				max=arr[j][i];//for max coloum first j then i
			    }
				
			}
			System.out.print(max+" ");
			
		}
		
		
//		for(int i=0;i<arr[0].length;i++)
//		{   int max=Integer.MIN_VALUE;           //   i0 i1   i2
//			for(int j=0;j<arr[0].length;j++)    // j0 22  31  9
//				                                // j1 12   5  16
//			   {                                 //j2 34   42  2
//				if(max<arr[j][i]) //arr[2][0]    //   03   13  22    
//				{
//					max=arr[j][i];
//				}
//				
//			}
//			System.out.print(max+" ");
//		}
	}

}
