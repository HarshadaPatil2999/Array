package practice;

public class Example1 {
	public static void main(String[] args) {
//		int a[]= {1,2,3,4,5,6,7,8};
//		int sum=0;
//		int sum1=0;
//		for(int i=0;i<a.length;i++)
//		{
//			if(a[i]%2==0) 
//			{
//				sum=sum+a[i];
//				System.out.print(a[i]+" ");
//			}
//		}System.out.println();
//		System.out.println(sum);
//		
//		for(int i=0;i<a.length;i++)
//		{	if(a[i]%2!=0)
//			{
//			sum1=sum1+a[i];
//				System.out.print(a[i]+" ");
//			}
//			
//		}
//		System.out.println();
//		System.out.println(sum1);
		
		int b[]= {1,2,3,4,5,6,7};
		
		int sum=0;
		for(int i=0;i<b.length-2;i++)
		{
			   sum=b[i]+b[i+2];
			   System.out.print(sum+" ");
		   
		} 
		
	}

}
