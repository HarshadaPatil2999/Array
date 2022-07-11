package assignmentno1;
import java.util.Scanner;
public class FindDuplicateElement {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter size of array a");
		int size = sc.nextInt();
		int a[] = new int[size];
		
		System.out.println("elements of array a");
		for (int i = 0; i < size; i++) {
			a[i] = sc.nextInt();
		}
		
		System.out.println();
		for (int i = 0; i<size; i++)
		{int cnt=0;
			for (int j=i+1;j<size;j++)
			{
				if(a[i]==a[j])
				{
					cnt++;
					a[j]='b';
				}
			}
			if(cnt>0 && a[i]!='b')
				System.out.println(a[i]);
		}
		
		

}
}