package assignmentno1;

import java.util.Arrays;

public class Practice {
	public static void main(String[] args) {
		
		int a[]= {14,12,13,16,67,82};
		int b[]=new int[a.length];
		
		
		
		for(int i=0;i<a.length;i++)
		{
			for(int j=0;j<a.length;j++)
			{
				if(a[i]%2==0)
				{
					int temp=a[i];//14
					a[i]=a[j];//14//12
					a[j]=temp;//14
					
				}
				
			}
			
		}
		
		for(int i=0;i<a.length;i++)
		{
			System.out.print(a[i]+" ");
		}
		
	//	System.out.println(Arrays.toString(a));
		
		
		
		
		
//		for(int i=0;i<a.length;i++)
//		{
//			if(a[i]%2==0)
//			{
//				b[i]=a[i];
//				
//				System.out.print(b[i]+" ");
//			}
//			
//			
//		}
//		
//		for(int i=0;i<a.length;i++)
//		{
//			if(a[i]%2==1)
//			{
//				b[i]=a[i];
//				System.out.print(b[i]+" ");
//			}
//			
//		}
//		
			
		
		
	}

}
