package assignmentno1;
import java.util.Scanner;
public class Averagevalue {
	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter size of array");
		int size=sc.nextInt();
		int a[]=new int[size];
		System.out.println("elements of array");
		for(int i=0;i<size;i++)
		{
			a[i]=sc.nextInt();
		}System.out.println();
		int sum=0;
		for(int i=0;i<size;i++)
		{
			sum=sum+a[i];
		}float avg=sum/size;
		System.out.println("average:"+avg);
	}

}
