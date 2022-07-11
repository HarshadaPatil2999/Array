package assignmentno1;

import java.util.Arrays;

public class SwapTheArrayInPairs {
	public static void main(String[] args) {
		
		int a[]= {6,3,3,5,4,6,7,8,0,1};
		
		
		for(int i=0;i<a.length;i+=2)
		{
			//if(i%2==0) 
			{
				int temp=a[i];
				a[i]=a[i+1];
				a[i+1]=temp;
			}
			
	 }
		System.out.println(Arrays.toString(a));
	}

}
