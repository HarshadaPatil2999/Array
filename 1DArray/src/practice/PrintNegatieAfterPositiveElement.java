package practice;

import java.util.Arrays;

public class PrintNegatieAfterPositiveElement {
	public static void main(String[] args) {
		int a[]= {-5,1,-4,-6,-9,2,3,5,6,-10,-12};
		
		for(int i=0;i<a.length;i++)//0,1,2
		{
			for(int j=0;j<=i;j++)//0/0,1/0,1
			{
				if(a[i]<0)
				{
					int temp=a[i];// //-4//-6
					a[i]=a[j];//-5//-4//-6
					a[j]=temp;//-5//-4//-6
				}
			}
		}
		System.out.println(Arrays.toString(a));
	}

}
