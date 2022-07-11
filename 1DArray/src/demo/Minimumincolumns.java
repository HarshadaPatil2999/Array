package demo;

public class Minimumincolumns {
	public static void main(String[] args) {
//		int arr[][] = {{22,31,9},{12,5,16},{34,42,2}};
//		for(int i=0;i<arr[0].length;i++)
//		{   int max=Integer.MAX_VALUE;
//			for(int j=0;j<arr[0].length;j++)//22 31 9
//				                           //12 5 16
//			   {                             // 34 42 2
//				if(max>arr[j][i])
//				{
//					max=arr[j][i];
//				}
//				
//			}
//			System.out.print(max+" ");
//		}
		
		int a[]= {34,12,56,78,22};
		int max=Integer.MAX_VALUE;
		int min=Integer.MIN_VALUE;
		for(int i=0;i<a.length;i++)
		
		{
			if(min<a[i])
			{
				min=a[i];
			}
			
			
			if(max>a[i])
		{
			max=a[i];
			
		}
			
	
			
			
		}
		System.out.println(min+" "+max);
	}

}
