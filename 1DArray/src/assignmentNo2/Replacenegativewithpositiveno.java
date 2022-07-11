package assignmentNo2;
import java.util.Scanner;
public class Replacenegativewithpositiveno {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("size of array");
		int size=sc.nextInt();
		int a[]=new int[size];
		System.out.println("enter"+size+"elements of array");
		for(int i=0;i<size;i++)
		{
			a[i]=sc.nextInt();
		}
		System.out.println();
		for(int i=0;i<size;i++)
		{
			if(a[i]<0)
			{
				a[i]=a[i-1]*a[i-1];
			}System.out.print(a[i]+" ");
		}
	
//	int a[]= {12,3,-19,29,5,-61,44,7,-9};
//	for (int i=0;i<a.length;i++)
//	{
//		if(a[i]<0)
//		{
//			a[i]=a[i-1]*a[i-1];
//		}
//		System.out.print(a[i]+" ");
//	}

}
}