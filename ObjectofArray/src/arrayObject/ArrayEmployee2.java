package arrayObject;
import java.util.Scanner;
public class ArrayEmployee2 {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int id;
		String name;
		MyDate joiningdate;
		System.out.println("Enter size of array");
		int size =sc.nextInt();
		Employee2 a[]=new Employee2[size];
		for(int i=0;i<size;i++)
		{
			System.out.println("Enter"+(i+1)+"Employee Details");
			System.out.println("Enter id,name,joining date");
			id=sc.nextInt();
			name=sc.next();
			
			
		}
		
		
	}

}
