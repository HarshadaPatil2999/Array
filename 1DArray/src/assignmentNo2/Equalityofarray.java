package assignmentNo2;
import java.util.Scanner;
public class Equalityofarray {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter arr1 size");
		int size1=sc.nextInt();
		int arr1[]=new int[size1];
		System.out.println("enter arr2 size");
		int size2=sc.nextInt();
		int arr2[]=new int[size2];
		
		System.out.println("enter"+size1+"elements of arr1");
		for(int i=0;i<size1;i++)
		{
			arr1[i]=sc.nextInt();
		}
		System.out.println();
		

		System.out.println("enter"+size2+"elements of arr2");
		for(int j=0;j<size1;j++)
		{
			arr2[j]=sc.nextInt();
		}
		int count=0;
		
		for(int i=0;i<size1;i++)
		{ if(size1==size2 )
			{  
			for(int j=0;j<size2;j++)
			 {
				if(arr1[i]==arr2[j])
				{
					count++;
				}
			 }
			
			}
		}if(count==size1)
		{
			System.out.println("equal array");
		}else
			System.out.println("not equal array");
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	
//	int arr1[]= {13,22,32,92,52,62};
//	int arr2[]= {62,32,13,22,92,52};
//	int count=0;
//	for(int i=0;i<arr1.length;i++)
//	
//	{
//		if(arr1.length==arr2.length)
//		{  for(int j=0;j<arr2.length;j++)
//		   {
//			if(arr1[i]==arr2[j])
//			{
//				count++;
//			}
//		   }    
//		 }
//	}
//	if(count==arr1.length)
//	   {
//		 System.out.println("equal array");
//	  }
//	else
//		System.out.println("not equal array");
//		

}
}