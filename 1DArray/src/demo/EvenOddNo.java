package demo;

import java.util.Arrays;

public class EvenOddNo {
	public static void main(String[] args) {
		int a[]= {12,34,55,77,86,99,31};
		
			for(int j=0;j<a.length;j++)
			{
				if(a[j]%2==0)
				{
					System.out.print(a[j]+" ");
				}
			}	
				for(int j=0;j<a.length;j++)	
				{
				if(a[j]%2!=0)
				{
					System.out.print(a[j]+" ");
				}
			}
			
		
	}

}
