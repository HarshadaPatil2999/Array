package demo;

import java.util.Arrays;

public class Negativenooneside {
	public static void main(String[] args) {
		
		int a[]= {1,-2,-6,-8,3,6,7,8,-12,-14};
		for(int i=0;i<a.length;i++)
		{
			for(int j=i+1;j<a.length;j++)
			{
				if(a[i]>a[j])
				{
					int temp=a[i];
					a[i]=a[j];
					a[j]=temp;
				}
			}
		}System.out.println(Arrays.toString(a));
	}

}
