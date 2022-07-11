package demo;
import java.util.Scanner;
public class ArrayofEmployee2 {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
	
		int id,salary;
		String name,dept,location;
		System.out.println("enter size of array");
		int size=sc.nextInt();
		Employee2 a[]=new Employee2[size];
		for(int i=0;i<size;i++)
		{
			System.out.println("Enter"+(i+1)+"Employee details");
			System.out.print("enter id:");
			id=sc.nextInt();
			System.out.print("enter name:");
			name=sc.next();
			System.out.print("enter dept:");
			dept=sc.next();
			System.out.print("enter location:");
			location=sc.next();
			System.out.print("enter salary:");
			salary=sc.nextInt();
			a[i]=new Employee2(id,name,dept,location,salary);
		}	
			for(Employee2 s:a)
			{
				if(s.dept.equals("HR") && s.salary>30000)
				System.out.println(s);
			}
}
}