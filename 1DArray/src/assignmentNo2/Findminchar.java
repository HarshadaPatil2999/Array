package assignmentNo2;
import java.util.Scanner;
import java.util.Arrays;
public class Findminchar {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter size");
		int size=sc.nextInt();
		char a[]=new char[size];
		System.out.println("Enter element of array:");
		 for(char i=0;i<a.length;i++)
		 {
			 a[i]=sc.next().charAt(0);
		 }
//		char a[]= {'Z','B','C','V','D','X'};
		 for(char i=0;i<size;i++)
		 {
			for(char j=0;j<size;j++)
			{
				if(a[i]<a[j])
				{
					char temp=a[i];
					a[i]=a[j];
					a[j]=temp;
				}
			}
			
		 }System.out.println("array:"+Arrays.toString(a));
		 System.out.println(" min char:"+a[0]);
	}


}
