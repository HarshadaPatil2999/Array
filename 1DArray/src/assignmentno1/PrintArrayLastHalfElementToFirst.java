package assignmentno1;

import java.util.Arrays;

public class PrintArrayLastHalfElementToFirst {
	public static void main(String[] args) {
		int a[]= {1,2,3,4,5,6,7,8};
		int b=a.length/2;
		for(int i=0;i<a.length/2;i++)
		{
			int temp=a[i];
			a[i]=a[b];
			a[b]=temp;
			b++;
			
		}
		System.out.println(Arrays.toString(a));
	}

}
