package demo;

import java.util.Arrays;

public class FindAvgexceptingminmaxvalue {
	public static void main(String[] args) {
		
		int a[]= {12,34,45,67,89,21,43};
//		Arrays.sort(a);
//		System.out.println(Arrays.toString(a));
		int sum=0;
		float avg;
		for(int i=0;i<a.length;i++)
		{
			for(int j=0;j<a.length;j++)
		 {
			if(a[i]<a[j])
			{
				int temp=a[i];
				a[i]=a[j];
				a[j]=temp;
			}
		}
			
		if(a[i]==a[0] && a[i]==a[a.length-1])
		{
			continue;
		}
		 sum= sum+a[i];
		
		}
		 avg=sum/a.length;
		 System.out.println("Avg:"+avg);
		 System.out.println(Arrays.toString(a));
			
	}

}
