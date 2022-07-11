package assignmentno1;
import java.util.Scanner;
public class Findcommenelements {
	public static void main(String[] args) {
//		Scanner sc=new Scanner(System.in);
//		System.out.println("Enter size of array");
//		int size=sc.nextInt();
//		int a[]=new int[size];
//		System.out.println("elements of array");
//		for(int i=0;i<size;i++)
//		{
//			a[i]=sc.nextInt();
//		} 
//		   
//		for(int i=0;i<size;i++)
//		{int count=0;
//		for(int j=i+1;j<size;j++)
//		{
//			{
//	         count++;
//		    }
//			if(count>1)
//			{
//				System.out.print(a[i]+" ");
//			}
//		}
//		}
		
		int a[]= {1,2,3,3,4,4,1,4,2,5};
		
		for(int i=0;i<a.length;i++)
		{int count=0;
		 for(int j=i+1;j<a.length;j++)
			{
			 if(a[i]==a[j])
			 {
				 count++;
				}
			 
			}	
			if(count>0)
		 System.out.print(a[i]+" ");
		}
		
			
		
		
		
		
}
}
